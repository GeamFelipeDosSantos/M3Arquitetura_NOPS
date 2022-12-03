package utils;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Geam
 */
public class GerenciadorArquivo {

    
    public ArrayList<String> obterConteudoArquivo(String caminho) throws FileNotFoundException, IOException {
        ArrayList<String> linhasHexadecimal;
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
            linhasHexadecimal = new ArrayList<>();
            while (br.ready()) {
                
                String linha = br.readLine();
                linhasHexadecimal.add(linha);
                //System.out.println(linha);
            }
        }
        return linhasHexadecimal;
    }
}
