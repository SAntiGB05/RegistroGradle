package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RegistroApp {
    private static final Logger logger = LogManager.getLogger(RegistroApp.class);

    public static void main(String[] args) {

        logger.debug("Este es un mensaje de depuración (DEBUG)");
        logger.info("Este es un mensaje informativo (INFO)");
        logger.warn("Este es un mensaje de advertencia (WARN)");
        logger.error("Este es un mensaje de error (ERROR)");
        logger.fatal("Este es un mensaje fatal (FATAL)");


        try {
            int result = procesar(10, 0);
            logger.info("Resultado del procesamiento: " + result);
        } catch (ArithmeticException e) {
            logger.error("Error en el procesamiento: " + e.getMessage());
        }
    }

    private static int procesar(int a, int b) {
        return a / b;
    }
}
