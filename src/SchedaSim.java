public class SchedaSim {
    private String numeroDiTelefono;
    private double creditoDisponibile = 0;
    private UltimeChiamate ultimeChiamate[];

    public SchedaSim(String numeroDiTelefono,double creditoDisponibile,UltimeChiamate[] ultimeChiamate){
        this.numeroDiTelefono = numeroDiTelefono;
        this.creditoDisponibile = creditoDisponibile;
        this.ultimeChiamate = ultimeChiamate;


    }



   public void stampaDati(){
        System.out.println(numeroDiTelefono);
        System.out.println(creditoDisponibile);
        for (UltimeChiamate chiamate: ultimeChiamate){
            System.out.println("numeri chiamati:"+ chiamate.numeroChiamato);
            System.out.println("la chiamata è durata:"+ chiamate.durataChiamata);
        }
    }
}
