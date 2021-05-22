package serviciu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ServiciuAudit {

    public static void scrieAudit (String nume_actiune) throws IOException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        File file = new File("C:\\Users\\Ovidiu\\Desktop\\bibliotecaEAP\\src\\CSV\\Audit.csv");
        FileWriter fr = new FileWriter(file, true);
        BufferedWriter writer = new BufferedWriter(fr);
        writer.write(nume_actiune + ' ' +  formatter.format(date));
        writer.newLine();
        writer.close();
        fr.close();
    }
}
