package TrbArquitetura;

import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.GerenciadorArquivo;
import utils.GerenciadorBinario;
import utils.Conversor;

/**
 *
 * @author Geam
 */
public class NewClass {

    /*public static void main(String[] args) {
        GerenciadorArquivo gerenciadorArquivo = new GerenciadorArquivo();
        Conversor conversor = new Conversor();
        GerenciadorBinario gerenciadorBinario = new GerenciadorBinario();
        try {
           
            //Obtém as linhas do arquivo em hexadecimal
            ArrayList<String> linhasHexadecimal = gerenciadorArquivo.obterConteudoArquivo("D:\\Ciencia da computação\\13 Semestre\\Arquitetura e organização de computadores 2\\M1\\Trabalho 1\\dump1");
            
            //Converte as linhas em hexadecimal para binário
            ArrayList<String> linhasBinario = conversor.converterListaHexadecimalParaBinario(linhasHexadecimal);
            
            //Ler os 6 primeiros digitos de cada linha em binário
            ArrayList<String> listaComandosBinarios = gerenciadorBinario.retornarSeisPrimeirosDigitosBinarios(linhasBinario);
           
            //Identificar quantos ciclos são necessários para cada comando
            ArrayList<Integer> listaCliclosComandosBinarios = gerenciadorBinario.listarCiclosComandosBinarios(listaComandosBinarios);
          
            //Realizar soma dos ciclos do programa
            Integer somaCiclosPrograma = gerenciadorBinario.somarCiclosPrograma(listaCliclosComandosBinarios);
            System.out.println("Soma dos ciclos do programa: "+somaCiclosPrograma);
            System.out.println("Quantidade de instruções: "+listaCliclosComandosBinarios.size());
           
            //Realizar o calculo de CPI
            float cpi = gerenciadorBinario.calcularCPI(listaCliclosComandosBinarios,somaCiclosPrograma);
            System.out.println("C.P.I. : "+cpi);
            
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex, "Erro ao executar o programa!", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(NewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

}
