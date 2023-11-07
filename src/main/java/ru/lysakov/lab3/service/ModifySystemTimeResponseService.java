package ru.lysakov.lab3.service;

import ru.lysakov.lab3.model.Response;
import ru.lysakov.lab3.util.DateTimeUtil;

import java.util.Date;

public class ModifySystemTimeResponseService
        implements ModifyResponseService{
    @Override
    public Response modify(Response response) {
        response.setSystemTime(DateTimeUtil.getCustomFormat()
                .format(new Date()));

        return response;
    }
}
