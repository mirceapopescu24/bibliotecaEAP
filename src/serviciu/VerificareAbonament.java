package serviciu;

import java.text.*;
import java.util.*;

public class VerificareAbonament {

    public void verificare_abonament(String data1, Date data2) throws ParseException {
        Date datainceput = new SimpleDateFormat("dd-MM-yyyy").parse(data1);

        if (datainceput.compareTo(data2) > 0)
            System.out.println("Abonamentul dumneavoastra este valabil.");
        if (datainceput.compareTo(data2) < 0)
            System.out.println("Abonamentul dumneavoastra a expirat! Va rugam sa-l reinnoiti!");
    }
}
