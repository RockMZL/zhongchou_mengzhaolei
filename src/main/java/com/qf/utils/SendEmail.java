package com.qf.utils;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.HtmlEmail;

import javax.servlet.http.HttpSession;
import java.util.Random;

public class SendEmail {
    public static boolean sendEmail(String targetEmail, HttpSession session) throws EmailException {
        String regexp = "^[a-zA-Z0-9-_]+@[a-zA-Z0-9-_]+(\\.[a-zA-Z0-9-_]+)+$";
        if (targetEmail.matches(regexp)) {
            HtmlEmail email = new HtmlEmail();
            //邮箱的SMTP服务器，一般123邮箱的是smtp.123.com,qq邮箱为smtp.qq.com
            email.setHostName("smtp.qq.com");
            //设置发送的字符类型
            email.setCharset("utf-8");
            //设置收件人
            email.addTo(targetEmail);
            //发送人的邮箱为自己的，用户名可以随便填
            email.setFrom("912995161@qq.com", "孟兆磊");
            //设置发送人到的邮箱和用户名和授权码(授权码是自己设置的)
            email.setAuthentication("912995161@qq.com", "hkrhwirvnrjybdfj");
            //授权码
            //hkrh wirv nrjy bdfj
            //gkoa ixjs dgqv bdhh
            Random random = new Random();
            String identifyingCode = "";
            for (int j = 0; j <= 5; j++) {
                int i = random.nextInt(10);
                identifyingCode += i;
            }
            //设置发送主题
            email.setSubject("哈喽,验证码来了");
            //设置发送内容
            session.setAttribute("identifyingCode", identifyingCode);
            email.setMsg(identifyingCode);
            email.send();
            return true;
        }
        return false;
    }

}
