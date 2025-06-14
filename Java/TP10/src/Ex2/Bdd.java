package Ex2;

import Ex2.Domaine.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe qui aura la responsabilité de lire le fichier CSV et de créer les objets Table
 */

public class Bdd {
    public static ArrayList<TableRectangle> tableRectangles = new ArrayList<>();
    public static ArrayList<TableRonde> tableRondes = new ArrayList<>();

    public static List<Table> getListeTables() {
        List<Table> toutes = new ArrayList<>();
        toutes.addAll(tableRectangles);
        toutes.addAll(tableRondes);
        return toutes;
    }

    public static ArrayList<TableRectangle> getTableRectangles() {
        return tableRectangles;
    }

    public static ArrayList<TableRonde> getTableRondes() {
        return tableRondes;
    }



    public static void chargerData(String fileName) {
        String[] fichier = FileToStr.lireLignes(fileName);
        for (String ligne : fichier) {
            String[] champs = ligne.split(";");
            String code = champs[0];
            int nb_places = Integer.parseInt(champs[1]);
            String matiere = champs[2];
            if (champs[0].startsWith("R")) {
                int largeur = Integer.parseInt(champs[3]);
                int longueur = Integer.parseInt(champs[4]);
                TableRectangle tR = new TableRectangle(code, nb_places, matiere, largeur, longueur);
                tableRectangles.add(tR);

            }
            else {
                int diametre = Integer.parseInt(champs[3]);
                TableRonde tO = new TableRonde(code, nb_places, matiere, diametre);
                tableRondes.add(tO);
            }
        }

    }
}