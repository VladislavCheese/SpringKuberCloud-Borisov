package com.naya.exams.examinator.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author vladislav_syrov
 * Для ручной генерации адреса запроса в случае отсутствия eureka.
 */
@RestController
@RequestMapping("/exams-direct")
public class ExamDirectController extends ExamComposerController {
    @Autowired
    public ExamDirectController(RestTemplate restTemplate) {
        super(restTemplate);
    }

    @Override
    public String getServiceUrl(final String service, final int amount) {
        /* Префикс provider- указывается потому что так начинается название контейнера,
        порт также необходимо указывать (он переопределяется на 8080 для всех контейнеров
        в docker-only/docker-compose.yml)*/
        return "http://provider-" + service + ":8080/exercise/random?amount=" + amount;
    }
}
