// Diese Klasse muss und soll nicht veraendert werden

class Buch {
    private String titel;
    private String autor;

    public Buch(String t, String a) {
        autor = a;
        titel = t;
    }

    public String titelAusgeben() {
        return titel;
    }

    public String autorAusgeben() {
        return autor;
    }
}
