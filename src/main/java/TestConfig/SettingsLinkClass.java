package TestConfig;

import java.net.HttpURLConnection;
import java.net.URL;

public class SettingsLinkClass {

    public static boolean verifyLinks(String linkUrl)
    {
        boolean deger = true;
        try
        {
            URL url = new URL(linkUrl);
            HttpURLConnection httpURLConnect=(HttpURLConnection)url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            if(httpURLConnect.getResponseCode()>=400)
            {
                deger = false;
            }
            else{
                System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
        }catch (Exception e) {
        }
        return deger ;
    }
}
