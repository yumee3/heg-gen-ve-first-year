package Ex2.Domaine;

import Ex2.Bdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    private static String filename = "LstTables.csv";
    private static ArrayList<Table> tablesBois = new ArrayList<Table>();

    public static void TableBois() {
        for (Table table : Bdd.getListeTables()) {
            if (table.getMatiere().equals("BOIS")) {
                tablesBois.add(table);
                Collections.sort(tablesBois, new CompareToTableBois());
            }
        }
        System.out.println("Liste des tables en BOIS (triées par code) : ");
        for (Table t : tablesBois) {

            System.out.println(t);
        }
    }

    public static void TableSurface() {
        System.out.println("Liste des tables triées par surface (du plus grand au plus petit) : ");
        List<Table> tables = Bdd.getListeTables();
        Collections.sort(tables, new CompareToSurfaceDesc());

        for (Table table : Bdd.getListeTables()) {
            System.out.println(table);
        }
    }

    public static void main(String[] args) {

        Bdd.chargerData(filename);
        TableBois();
        System.out.println();
        TableSurface();
    }
}
