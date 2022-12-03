package utils;

import java.util.ArrayList;
import modelo.ComandoBinario;

/**
 *
 * @author Geam
 */
public class GerenciadorBinario {

    public ArrayList<String> retornarSeisPrimeirosDigitosBinarios(ArrayList<String> listaBinarios) {

        ArrayList<String> listaComandosBinarios = new ArrayList<>();

        for (String binario : listaBinarios) {
            listaComandosBinarios.add(binario.substring(0, 6));
            //System.out.println(binario.substring(0, 6));
        }

        return listaComandosBinarios;
    }

    public ArrayList<ComandoBinario> montarListaComandosBinarios(ArrayList<String> listaBinarios, ArrayList<Integer> listaCiclosPrograma) {
        ArrayList<ComandoBinario> comandosBinarios = new ArrayList<>();

        ArrayList<ComandoBinario> comandosBinarioPadrao = carregarCiclosComandos();

        for (int i = 0; i < listaBinarios.size(); i++) {
            for (int j = 0; j < comandosBinarioPadrao.size(); j++) {

                if (listaBinarios.get(i).trim().equals(comandosBinarioPadrao.get(j).getBinarioInstrucao().trim())) {

                    comandosBinarios.add(new ComandoBinario(comandosBinarioPadrao.get(j).getNomeInstrucao(), comandosBinarioPadrao.get(j).getTipoInstrucao(), listaBinarios.get(i).trim(), comandosBinarioPadrao.get(j).getCiclosInstrucao()));

                }
            }
        }

        return comandosBinarios;
    }

    public ArrayList<Integer> listarCiclosComandosBinarios(ArrayList<String> listaBinarios) {

        ArrayList<Integer> listaCiclos = new ArrayList<>();

        for (String comandoBinario : listaBinarios) {
            listaCiclos.add(this.identificarCicloComando(comandoBinario));
            // System.out.println("Comando binário: "+comandoBinario+" Quantidade de ciclos: "+this.identificarCicloComando(comandoBinario));
        }

        return listaCiclos;

    }

    public int identificarCicloComando(String comandoBinario) {

        int ciclosComando = 4;
        ArrayList<ComandoBinario> comandosBinario = carregarCiclosComandos();

        for (ComandoBinario comando : comandosBinario) {

            if (comandoBinario.trim().equals(comando.getBinarioInstrucao().trim())) {
                ciclosComando = comando.getCiclosInstrucao();
                System.out.println("Comando binário: " + comandoBinario + " Tipo instrução: " + comando.getTipoInstrucao() + " Instrução: " + comando.getNomeInstrucao() + " Quantidade de ciclos: " + ciclosComando);
                return ciclosComando;
            }
        }

        return ciclosComando;
    }

    public float calcularCPI(ArrayList<Integer> listaCiclosPrograma, Integer somaCiclosPrograma) {

        float ciclos = somaCiclosPrograma;
        float qtdInstrucoes = listaCiclosPrograma.size();
        float cpi = ciclos / qtdInstrucoes;

        return cpi;
    }

    public Integer somarCiclosPrograma(ArrayList<Integer> listaCiclos) {

        Integer resultadoSoma = 0;

        for (Integer ciclos : listaCiclos) {
            resultadoSoma += ciclos;
        }

        //System.out.println("Soma dos ciclos do programa: "+resultadoSoma);
        return resultadoSoma;
    }

    private ArrayList<ComandoBinario> carregarCiclosComandos() {

        ArrayList<ComandoBinario> comandosBinario = new ArrayList<>();

        //Tipo Branch
        comandosBinario.add(new ComandoBinario("beq", "Branch", "000100", 3));
        comandosBinario.add(new ComandoBinario("bgtz", "Branch", "000111", 3));
        comandosBinario.add(new ComandoBinario("blez", "Branch", "000110", 3));
        comandosBinario.add(new ComandoBinario("bne", "Branch", "000101", 3));
        //Tipo Jump
        comandosBinario.add(new ComandoBinario("j", "Jump", "000010", 3));
        comandosBinario.add(new ComandoBinario("jal", "Jump", "000011", 3));
        comandosBinario.add(new ComandoBinario("jalr", "Jump", "001001", 3));
        comandosBinario.add(new ComandoBinario("jt", "Jump", "001000", 3));
        //Tipo Load
        comandosBinario.add(new ComandoBinario("lb", "Load", "100000", 5));
        comandosBinario.add(new ComandoBinario("lbu", "Load", "100100", 5));
        comandosBinario.add(new ComandoBinario("lh", "Load", "100001", 5));
        comandosBinario.add(new ComandoBinario("lhu", "Load", "100101", 5));
        comandosBinario.add(new ComandoBinario("lw", "Load", "100011", 5));
        //Tipo Store
        comandosBinario.add(new ComandoBinario("sb", "Store", "101000", 4));
        comandosBinario.add(new ComandoBinario("sh", "Store", "101001", 4));
        comandosBinario.add(new ComandoBinario("sw", "Store", "101011", 4));
        //Tipo R-Type
        //Arithmetic and Logical Instructions
        comandosBinario.add(new ComandoBinario("add", "Arithmetic and Logical", "100000", 4));
        comandosBinario.add(new ComandoBinario("addu", "Arithmetic and Logical", "100001", 4));
        comandosBinario.add(new ComandoBinario("addi", "Arithmetic and Logical", "001000", 4));
        comandosBinario.add(new ComandoBinario("addiu", "Arithmetic and Logical", "001001", 4));
        comandosBinario.add(new ComandoBinario("and", "Arithmetic and Logical", "100100", 4));
        comandosBinario.add(new ComandoBinario("andi", "Arithmetic and Logical", "001100", 4));
        comandosBinario.add(new ComandoBinario("div", "Arithmetic and Logical", "011010", 4));
        comandosBinario.add(new ComandoBinario("divu", "Arithmetic and Logical", "011011", 4));
        comandosBinario.add(new ComandoBinario("mult", "Arithmetic and Logical", "011000", 4));
        comandosBinario.add(new ComandoBinario("multu", "Arithmetic and Logical", "011001", 4));
        comandosBinario.add(new ComandoBinario("nor", "Arithmetic and Logical", "100111", 4));
        comandosBinario.add(new ComandoBinario("or", "Arithmetic and Logical", "100101", 4));
        comandosBinario.add(new ComandoBinario("ori", "Arithmetic and Logical", "001101", 4));
        comandosBinario.add(new ComandoBinario("sll", "Arithmetic and Logical", "000000", 4));
        comandosBinario.add(new ComandoBinario("sllv", "Arithmetic and Logical", "000100", 4));
        comandosBinario.add(new ComandoBinario("sra", "Arithmetic and Logical", "000011", 4));
        comandosBinario.add(new ComandoBinario("srav", "Arithmetic and Logical", "000111", 4));
        comandosBinario.add(new ComandoBinario("srl", "Arithmetic and Logical", "000010", 4));
        comandosBinario.add(new ComandoBinario("srlv", "Arithmetic and Logical", "000110", 4));
        comandosBinario.add(new ComandoBinario("sub", "Arithmetic and Logical", "100010", 4));
        comandosBinario.add(new ComandoBinario("subu", "Arithmetic and Logical", "100011", 4));
        comandosBinario.add(new ComandoBinario("xor", "Arithmetic and Logical", "100110", 4));
        comandosBinario.add(new ComandoBinario("xori", "Arithmetic and Logical", "001110", 4));
        //Constant-Manipulating Instructions
        comandosBinario.add(new ComandoBinario("lhi", "Constant-Manipulating", "011001", 4));
        comandosBinario.add(new ComandoBinario("llo", "Constant-Manipulating", "011000", 4));
        //Comparison Instructions
        comandosBinario.add(new ComandoBinario("slt", "Comparison", "101010", 4));
        comandosBinario.add(new ComandoBinario("sltu", "Comparison", "101001", 4));
        comandosBinario.add(new ComandoBinario("slti", "Comparison", "001010", 4));
        comandosBinario.add(new ComandoBinario("sltiu", "Comparison", "001001", 4));
        
        
        
     //   comandosBinario.add(new ComandoBinario("r", "R-Type", "100000", 4));

        return comandosBinario;
    }

}
