package br.univille.microkernel_plugin.service;

import java.util.HashMap;
import org.springframework.http.HttpStatus;
import br.univille.microkernel_interface.service.DefaultService;

public class ServiceTwoImpl implements DefaultService
{

    @Override
    public HttpStatus doWork(HashMap<String, String> params) {
        System.out.println("Service TWO: " + params);
        return HttpStatus.INTERNAL_SERVER_ERROR;
    }

}
