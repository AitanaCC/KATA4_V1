package kata4_v1;

import model.Histogram;
import model.Mail;
import view.MailListReader;
import view.MailHistogramBuilder;
import view.HistogramDisplay;
import java.util.List;

public class KATA4_V1 {

   public static void main(String[] args) {
        String fileName = new String ("email.txt");   
        List<Mail> mailList = MailListReader.read(fileName);
        
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram); 
        histogramDisplay.execute();
        
    }
   
}

