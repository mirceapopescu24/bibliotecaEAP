package serviciu;

public class AbonamentElite {

    public void abonamentelite(String abonamentcititori, int numarcititori, String numecititor, String prenumecititor, String tipabonament) {
        if (abonamentcititori.contains(tipabonament)) {
            System.out.println("Multumim, " + numecititor + " " + prenumecititor + "!");
        }
    }
}
