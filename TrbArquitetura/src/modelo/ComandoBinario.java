
package modelo;

/**
 *
 * @author Geam
 */
public class ComandoBinario {
    
    private String nomeInstrucao;
    private String tipoInstrucao;
    private String binarioInstrucao;
    private int ciclosInstrucao;

    public ComandoBinario() {
        
    }

    public ComandoBinario(String nomeInstrucao, String tipoInstrucao, String binarioInstrucao, int ciclosInstrucao) {
        this.nomeInstrucao = nomeInstrucao;
        this.tipoInstrucao = tipoInstrucao;
        this.binarioInstrucao = binarioInstrucao;
        this.ciclosInstrucao = ciclosInstrucao;
    }   
    
    
    /**
     * @return the nomeInstrucao
     */
    public String getNomeInstrucao() {
        return nomeInstrucao;
    }

    /**
     * @param nomeInstrucao the nomeInstrucao to set
     */
    public void setNomeInstrucao(String nomeInstrucao) {
        this.nomeInstrucao = nomeInstrucao;
    }

    /**
     * @return the tipoInstrucao
     */
    public String getTipoInstrucao() {
        return tipoInstrucao;
    }

    /**
     * @param tipoInstrucao the tipoInstrucao to set
     */
    public void setTipoInstrucao(String tipoInstrucao) {
        this.tipoInstrucao = tipoInstrucao;
    }

    /**
     * @return the binarioInstrucao
     */
    public String getBinarioInstrucao() {
        return binarioInstrucao;
    }

    /**
     * @param binarioInstrucao the binarioInstrucao to set
     */
    public void setBinarioInstrucao(String binarioInstrucao) {
        this.binarioInstrucao = binarioInstrucao;
    }

    /**
     * @return the ciclosInstrucao
     */
    public int getCiclosInstrucao() {
        return ciclosInstrucao;
    }

    /**
     * @param ciclosInstrucao the ciclosInstrucao to set
     */
    public void setCiclosInstrucao(int ciclosInstrucao) {
        this.ciclosInstrucao = ciclosInstrucao;
    }
    
}
