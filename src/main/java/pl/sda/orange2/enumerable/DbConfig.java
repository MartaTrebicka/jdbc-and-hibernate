package pl.sda.orange2.enumerable;

public enum DbConfig {

    DB_URL("jdbc:h2:~/databases/jdbc"),  //obiekt typu DbCongig
    USER("sa"), //obiekt typu DbCongig
    PASSWORD("sa"); //obiekt typu DbCongig

    private String value;

     DbConfig(String value) {// KONSTRUKTOR
this.value = value;
     }
    public String getValue(){  // getter (?)
        return value;
    }
}
