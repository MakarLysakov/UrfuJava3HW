package ru.lysakov.lab3.service;

import org.springframework.stereotype.Service;
import ru.lysakov.lab3.model.Response;

@Service
public interface ModifyResponseService {
    Response modify (Response response);
}
