import java.net.InetAddress;
import java.util.Properties;

import javax.mail.*;

public class SendMail {
    public static void main(String[] args) throws Exception {

        final String from = "from@gmail.com";
        final String to = "to@gmail.com";

        Properties props = System.getProperties();
        props.setProperty("smtp.mail.host", "localhost");
        Session ssn = Session.getDefaultInstance(props);

        MimeMessage mime = new MimeMessage(ssn);
        mime.setFrom(InetAddress(from));
        mime.setSubject("title");
        mime.setText("message here");
        mime.addRecipient(Message.RecipientType.To, InetAddress(to));
        Transport.send(mime);

    }
}