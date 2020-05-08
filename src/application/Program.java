package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String args[]) throws ParseException {

        // Variable declaration
        // Formatar a data
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        // Alterar de UTC para GMT
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        // Parse command
        // Usando o parse (Java 8) é necessário adicionar exceção throws ParseException
        Date data1 = sdf1.parse("09/02/2020");
        Date data2 = sdf2.parse("09/02/2020 10:50:00");
        // Como se fosse SYSDATE
        Date data3 = new Date();
        Date data4 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        //
        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());
        Date x3 = new Date(0L);
        Date x4 = new Date(1000L * 60L * 60L * 5L);

        // Printing
        System.out.println("Data1 + " + data1); // Exibir a data no padrão do sistema
        System.out.println("Data2 + " + data2);
        System.out.println("Data3 + " + data3);
        System.out.println("Data4 + " + data4);
        System.out.println("------------------------");
        System.out.println("Data1 + " + sdf1.format(data1)); // Exibir a data no padrão do BR
        System.out.println("Data2 + " + sdf2.format(data2));
        System.out.println("Data3 + " + sdf2.format(data3));
        System.out.println("Data4 + " + sdf2.format(data4));
        System.out.println("------------------------");
        System.out.println("Data1 + " + sdf3.format(data1)); // Exibir a data no padrão do BR
        System.out.println("Data2 + " + sdf3.format(data2));
        System.out.println("Data3 + " + sdf3.format(data3));
        System.out.println("Data4 + " + sdf3.format(data4));
        System.out.println("------------------------");
        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);
        System.out.println("x4: " + x4);

        // Manipulando datas
        System.out.println("------------------------");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance(); // instanciar
        Date data = new Date();
        System.out.println("Data: " + data);
        System.out.println("Sdf: "  + sdf.format(data));

        // carregar a data na Calendar
        cal.setTime(data);
        // Chamando a função para adicionar
        cal.add(Calendar.HOUR_OF_DAY, 4);
        cal.add(Calendar.MINUTE, 5);
        cal.add(Calendar.DAY_OF_MONTH, 3);
        data = cal.getTime();
        System.out.println("Cal: " + data);
        System.out.println("Cal sdf: "  + sdf.format(data));
        int minutes = cal.get(Calendar.MINUTE);
        int month = cal.get(1 + Calendar.MONTH); // precisa somar 1 pq o Calendar começa com 0 (janeiro)
        System.out.println("Minutos: " + minutes);
        System.out.println("Mes: " + month);

        System.out.println("Teste GIT");
    }

}
