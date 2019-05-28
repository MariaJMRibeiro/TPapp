package up201506196.com.firsttp;


import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class Medication {


    private String name;
    private int quantity;
    private String user;

    public Medication() {

    }

    public Medication(String name, int quantity, String user) {
        this.name = name;
        this.quantity = quantity;
        this.user= user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public String getUser() {
        return this.user;
    }


}