package estacionamento;

import java.util.ArrayList;
import java.text.DateFormat;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Vaga {

    int horaentrada;
    int horasaida;
    int valor;
    ArrayList<Estacionamento> lista_vaga_e;
    ArrayList<Estacionamento> lista_vaga_d;

    public Vaga() {
        lista_vaga_e = new ArrayList();
        lista_vaga_d = new ArrayList();
    }

    private String getDateTime() {
        DateFormat dateformat;
        dateformat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return dateformat.format(date);
    }

    void adicionar_carro(Estacionamento estacionamento) {
        if (lista_vaga_e.size() <= 12) {
            lista_vaga_e.add(estacionamento);
        } else if (lista_vaga_e.size() > 12 && lista_vaga_e.size() <= 12) {
            lista_vaga_d.add(estacionamento);
        } else {
            System.out.println("Estacionamento Cheio.");
        }

    }

    void remover_carro_e(Estacionamento estacionamento) {
        lista_vaga_e.remove(estacionamento);
    }

    void remover_carro_d(Estacionamento estacionamento) {
        lista_vaga_d.remove(estacionamento);
    }

    void calcular_valor(Estacionamento estacionamento) {
        if (horasaida - horaentrada <= 1) {
            System.out.println("Valor: R$4,00");
        } else if (horasaida - horaentrada > 1) {
            for (int i = 1; i != (horasaida - horaentrada); i++) {
            }
            valor = 4 + (horasaida - horaentrada) * 2;
            System.out.println(valor);
        }
    }
}
