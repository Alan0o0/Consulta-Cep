package org.aplicacao;

import org.aplicacao.dto.EnderecoDto;
import org.aplicacao.servico.ApiServico;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException,InterruptedException {

        ApiServico apiServico = new ApiServico();

        try{
            //EnderecoDto enderecoDto = apiServico.getEndereco("75560018");
            System.out.println(apiServico.getEndereco("97880000"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
