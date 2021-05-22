package Clase;

import java.util.*;
import java.text.*;


public class Abonament {
    private String data_inceput;
    private String data_sfarsit;
    private String tip; // VIP sau Elite

    public Abonament()
    {

    }
    public Abonament(String data_inceput, String data_sfarsit) {
        this.data_inceput = data_inceput;
        this.data_sfarsit = data_sfarsit;
    }

    public Abonament(String format, String format1, String string) {
    }

    public Abonament(Date parse, Date parse1, String string) {
    }



    public String getData_inceput() {
        return data_inceput;
    }

    public String getData_sfarsit() {
        return data_sfarsit;
    }

    public String getTip() {
        return tip;
    }

    public void setData_inceput(String data_inceput) {
        this.data_inceput = data_inceput;
    }

    public void setData_sfarsit(String data_sfarsit) {
        this.data_sfarsit = data_sfarsit;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void CitireAbonament() throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti data la care abonamentul a inceput sa fie valabil:");
        this.data_inceput = scanner.nextLine();
        Date inceput = new SimpleDateFormat("dd-MM-yyyy").parse(this.data_inceput);
        System.out.println("Introduceti data la care abonamentul expira:");
        this.data_sfarsit = scanner.nextLine();
        Date sfarsit = new SimpleDateFormat("dd-MM-yyyy").parse(this.data_sfarsit);
        System.out.println("Introduceti tipul abonamentului (Premium sau Elite):");
        this.tip = scanner.nextLine();
    }

    public void AfisareAbonament() {
        System.out.println("Abonamentul are data de inceput, " + this.data_inceput + " expira la data de, " + this.data_sfarsit +
                "iar tipul abonamentului este " + this.tip);
    }

    @Override
    public String toString() {
        return "Abonamentul are data de inceput, " + this.data_inceput + " expira la data de, " + this.data_sfarsit +
                " iar tipul abonamentului este " + this.tip;
    }
}


