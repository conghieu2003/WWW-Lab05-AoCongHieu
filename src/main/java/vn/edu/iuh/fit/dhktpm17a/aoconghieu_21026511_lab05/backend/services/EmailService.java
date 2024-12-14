package vn.edu.iuh.fit.dhktpm17a.aoconghieu_21026511_lab05.backend.services;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class InvitationService {

    @Autowired
    private JavaMailSender mailSender;

    // Gửi email mời ứng tuyển
    public void sendInvitation(String toEmail, String candidateName) throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(toEmail);
        helper.setSubject("Thư mời ứng tuyển");
        helper.setText("Xin chào " + candidateName + ",<br/>"
                + "Chúng tôi rất vui khi mời bạn tham gia ứng tuyển tại công ty của chúng tôi."
                + "<br/><br/>Trân trọng,<br/>Đội ngũ tuyển dụng", true);

        mailSender.send(message);
    }
}
