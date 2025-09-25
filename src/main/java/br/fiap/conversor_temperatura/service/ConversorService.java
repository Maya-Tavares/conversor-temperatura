package br.fiap.conversor_temperatura.service;

import org.springframework.stereotype.Service;

@Service
public class ConversorService {
    public double celsiusParaFarenheit(double celsius)
    {
        double fahreinheit = celsius * 9 / 5 + 32;
        return fahreinheit;
    }
}
