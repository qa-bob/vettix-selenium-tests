import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Reflection {
    public static String currentEnv = "";
    public static String loginURL = null;
    public static String username = null;
    public static String password = null;

    public static String getCurrentEnv() {
        return currentEnv;
    }

    public static void setCurrentEnv(String currentEnv) {
        Reflection.currentEnv = currentEnv;
    }

    public static String getLoginURL() {
        return loginURL;
    }

    public static void setLoginURL(String loginURL) {
        Reflection.loginURL = loginURL;
    }

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        Reflection.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        Reflection.password = password;
    }

    static {
        String environment = getEnvironment("./environment.txt");
        currentEnv = environment;
        switch (environment) {
            case "DEV":
                loginURL = "https://mypolicy.dev.digital.pncie.com/mypolicy/login";
                username = "todd.kurtz@csaa.com";
                password = "Password1";
                break;
            case "PERF":
                loginURL = "https://mypolicy.perf.digital.pncie.com/mypolicy/login";
                username = "todd.kurtz@csaa.com";
                password = "Password1";
                break;
            default:
                loginURL = "https://mypolicy.digital.csaa-insurance.aaa.com/mypolicy/login";
                username = "todd.kurtz@csaa.com";
                password = "Password1";
                break;
        }

    }

    private static String getEnvironment (String filename) {
        String env = "";
        try {
            File file = new File(filename);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String s;
            while ((s = br.readLine()) != null) {
                env = s;
            }
        } catch (Exception e) {
            System.out.println(e);
        }return env;
    }
}
