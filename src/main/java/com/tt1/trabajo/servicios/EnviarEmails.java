package com.tt1.trabajo.servicios;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import com.tt1.trabajo.interfaces.InterfazEnviarEmails;
import com.tt1.trabajo.modelo.Destinatario;

@Service
public class EnviarEmails implements InterfazEnviarEmails {

    private final Logger logger;
    public EnviarEmails(Logger logger) {
        this.logger = logger;
    }

    @Override
    public boolean enviarEmail(Destinatario dest, String email) {
        logger.info("Enviando correo ficticio al destinatario: " + dest + " | Mensaje: " + email);
        return true;
    }
}