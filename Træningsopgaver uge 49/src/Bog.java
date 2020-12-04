import java.util.ArrayList;
import java.util.Objects;

public class Bog {

    private long ISBN;
    private String Titel;
    private int udgivelsesår;


    public Bog(long isbn, String titel, int udgivelsesår) {
        this.ISBN = isbn;
        this.Titel = titel;
        this.udgivelsesår = udgivelsesår;
    }

    public long getISBN() {
        return ISBN;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public int getUdgivelsesår() {
        return udgivelsesår;
    }

    public void setUdgivelsesår(int udgivelsesår) {
        this.udgivelsesår = udgivelsesår;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBN=" + ISBN +
                ", Titel='" + Titel + '\'' +
                ", udgivelsesår=" + udgivelsesår +
                '}';
    }

    public boolean equals(Bog bog) {
        return ISBN == bog.ISBN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ISBN, Titel, udgivelsesår);
    }
}
