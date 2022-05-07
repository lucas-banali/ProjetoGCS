public class Item {
    private String prato;
    private String valor;
    private String ingrediente;

    public Item(String prato, String valor, String ingredientes) {
        this.prato = prato;
        this.valor = valor;
        this.ingrediente = ingredientes;
    }

    public String getPrato() {
        return prato;
    }

    public void setPrato(String prato) {
        this.prato = prato;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(String ingrediente) {
        this.ingrediente = ingrediente;
    }
}
