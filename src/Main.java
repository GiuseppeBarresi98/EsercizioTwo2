//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UltimeChiamate chiamataUno = new UltimeChiamate(3567543,0.4);
        UltimeChiamate chiamataDue = new UltimeChiamate(345667744,1.5);
        UltimeChiamate[] ultimeChiamateArray = {chiamataUno, chiamataDue};
        SchedaSim nuovaSchedaSim = new SchedaSim("34567897",10,ultimeChiamateArray);

nuovaSchedaSim.stampaDati();

    }



    }
