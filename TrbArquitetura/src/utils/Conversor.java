package utils;

import java.util.ArrayList;
import java.util.HashMap;
import modelo.ComandoBinario;

/**
 *
 * @author Geam
 */
public class Conversor {

    /**
     * Recebe uma lista de strings em hexadecimal, converte e retorna a lista
     * para binário.
     *
     * @param listaHexadecimal
     * @return
     */
    public ArrayList<String> converterListaHexadecimalParaBinario(ArrayList<String> listaHexadecimal) {

        ArrayList<String> linhasBinario = new ArrayList<>();

        for (String linha : listaHexadecimal) {
            linhasBinario.add(this.hexToBinary(linha));
            //System.out.println(linhasBinario);
        }

        return linhasBinario;
    }

    private String hexToBinary(String hex) {

        String binary = "";
        hex = hex.toUpperCase();
        HashMap<Character, String> hashMap = new HashMap<>();

        // storing the key value pairs
        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");

        int i;
        char ch;

        for (i = 0; i < hex.length(); i++) {

            ch = hex.charAt(i);

            if (hashMap.containsKey(ch)) {
                binary += hashMap.get(ch);
            } else {
                binary = "Invalid Hexadecimal String";
                return binary;
            }
        }
        return binary;
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
        //comandosBinario.add(new ComandoBinario("jt", "Jump", "001000", 3));
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
        comandosBinario.add(new ComandoBinario("add", "Arithmetic and Logical", "000000", 4));
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
        //comandosBinario.add(new ComandoBinario("sll", "Arithmetic and Logical", "000000", 4));
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

    /*if (comando.getTipoInstrucao () 
        .equals("Arithmetic and Logical")) {
                    String destReg = null;
        if (comando.getNomeInstrucao().endsWith("i")) {
            destReg = comando.getBinarioInstrucao().substring(11, 16);
        } else {

        }
    }*/
    public ArrayList<String> generateWithNops(ArrayList<String> listaBinarios) {
        ArrayList<ComandoBinario> comandosBinario = carregarCiclosComandos();
        String binarioAnterior = null;
        
        ArrayList<String> retorno = new ArrayList();
        
        for (String binario : listaBinarios) {
            if (binarioAnterior == null) {
                retorno.add(binario);
                binarioAnterior = binario;
                continue;
            }

            ComandoBinario comandoAtual = null;
            ComandoBinario comandoAnterior = null;
            for (ComandoBinario comando : comandosBinario) {
                if (binario.trim().substring(0, 6).equals(comando.getBinarioInstrucao().trim())) {
                    comandoAtual = comando;
                }
                
                if (binarioAnterior.trim().substring(0, 6).equals(comando.getBinarioInstrucao().trim())) {
                    comandoAnterior = comando;
                }
            }

            if (comandoAtual.getTipoInstrucao().equals("Arithmetic and Logical") && comandoAnterior.getTipoInstrucao().equals("Arithmetic and Logical")) {
                String destReg = null;
                String destRegAnterior = null;
                
                if (comandoAtual.getNomeInstrucao().endsWith("i")) {
                    destReg = binario.substring(11, 16);
                } else {
                    destReg = binario.substring(16, 21);
                }
                
                if(comandoAnterior.getNomeInstrucao().endsWith("i")) {
                    destRegAnterior = binarioAnterior.substring(11, 16);
                } else {
                    destRegAnterior = binarioAnterior.substring(16, 21);
                }
                
                if(destReg.equals(destRegAnterior)) {
                    retorno.add("00000000000000000000000000000000");
                    retorno.add("00000000000000000000000000000000");
                }
            }
            
            retorno.add(binario);

            binarioAnterior = binario;
        }
        
        return retorno;
    }

}
