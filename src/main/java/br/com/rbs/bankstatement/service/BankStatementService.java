package br.com.rbs.bankstatement.service;

import br.com.rbs.bankstatement.domain.BankStatement;
import br.com.rbs.bankstatement.dto.BankStatementDTO;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BankStatementService {

    public List<BankStatementDTO> listBankStatement() throws IOException {
        return getBankStatement()
                .getListaControleLancamento()
                .stream()
                .map(lancamentos -> new BankStatementDTO(lancamentos))
                .collect(Collectors.toList());
    }

    public BankStatement getBankStatement() throws IOException {
        final InputStream jsonData = TypeReference.class.getResourceAsStream("/data/lancamento-conta-legado.json");
        return buildObjectMapper().readValue(jsonData, BankStatement.class);
    }

    private ObjectMapper buildObjectMapper() {
        final ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        objectMapper.configure(JsonParser.Feature.AUTO_CLOSE_SOURCE, true);
        return objectMapper;
    }
}