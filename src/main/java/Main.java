import java.util.*;
import java.io.*;
import com.google.gson.*;

public class Main {
    public static void scriere(List<PerecheNumere> lista) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter("perechi.json")) {
            gson.toJson(lista, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<PerecheNumere> citire() {
        Gson gson = new Gson();
        try (Reader reader = new FileReader("perechi.json")) {
            PerecheNumere[] perechi = gson.fromJson(reader, PerecheNumere[].class);
            return new ArrayList<>(Arrays.asList(perechi));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        // Crearea listei
        List<PerecheNumere> lista = new ArrayList<>();
        lista.add(new PerecheNumere(13, 21));
        lista.add(new PerecheNumere(8, 13));
        lista.add(new PerecheNumere(144, 233));

        // Scriere și citire
        scriere(lista);
        List<PerecheNumere> listaIncarcata = citire();

        // Afișare rezultate
        listaIncarcata.forEach(System.out::println);
    }
}

