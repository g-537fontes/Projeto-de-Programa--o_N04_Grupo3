    package gerenciamentodeingressos;

public class Ingresso {
    private int id;
    private String codigo;
    private String tipo;
    private double valor;
    private String status;
    private int idEvento;
    private int idParticipante;

    public Ingresso() {}

    public Ingresso(String codigo, String tipo, double valor, String status, int idEvento, int idParticipante) {
        this.codigo = codigo;
        this.tipo = tipo;
        this.valor = valor;
        this.status = status;
        this.idEvento = idEvento;
        this.idParticipante = idParticipante;
    }

    // Getters e setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getIdEvento() { return idEvento; }
    public void setIdEvento(int idEvento) { this.idEvento = idEvento; }

    public int getIdParticipante() { return idParticipante; }
    public void setIdParticipante(int idParticipante) { this.idParticipante = idParticipante; }
}

