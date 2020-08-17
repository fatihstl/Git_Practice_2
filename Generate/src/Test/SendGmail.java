package Test;

import Library.Util;

public class SendGmail {

    /*
           first Step:
               go to  :
                    https://myaccount.google.com/lesssecureapps?utm_source=google-account&utm_medium=web
                       Make sure that your google account allows third part app
*/
    public static void main(String[] args) {
        // credentials
        String userName = "fatih11iyiyol@gmail.com";
        String passWord = "Sakarya3822";
        // email:
        String receiver = "fatih11iyiyol@gmail.com";
        String subject = "Muhtar";
        String text = "Hi How are you? Why you are so ...";
        Util.sendEmails(userName, passWord, receiver, subject, text);
        System.out.println("Completed");


    }
    }
