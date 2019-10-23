import java.util.*;

public class User {
    private String userName;
    User[] connections;
    int noOfConnections = 0;
    String tokens[] = new String[10];

    User(String s, int n) {
        this.userName = s;
        this.noOfConnections = c;
        connections = new User[50];

    }

    public String toString(String s) {
        if (s.length() > 0) {
            s.split(";");
            for (int i = 0; i < s.length(); i++) {
                tokens[i] = s;
            }

            return this.userName + ":" + "[" + tokens[i] + "]";

        }
        return null;
    }

}