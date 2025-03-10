package multimi;

import org.testng.annotations.Test;

import java.util.*;

public class Multimi
{
    // Multimi = array, list, map

    @Test
    public void metodaTest()
    {
//        afisareColegiV2();
//        afisareProduseV1();
//        afisareProduseV2();
        carteDeRetete();
    }

    //Afisam numele colegilor

    public void afisareColegi()
    {
        String[] colegi = new String[3];

        colegi[0] = "Alex";
        colegi[1] = "Razvan";
        colegi[2] = "Roxana";

        for (int i=0; i<colegi.length; i++)
        {
            System.out.println("Sunt coleg cu " + colegi[i] + ".");
        }
    }


    public void afisareColegiV2()
    {
        List<String> colegi = new ArrayList<>();

        colegi.add("Razvan");
        colegi.add("Roxana");
        colegi.add("Mircea");

        for (int i=0; i<colegi.size(); i++)
        {
            System.out.println("Sunt coleg cu " + colegi.get(i) + ".");
        }
    }


    // Map = key - value

    public void afisareProduseV1()
    {
        Map<String,String> raion = new HashMap<>();

        raion.put("Raftul 1","Paine");
        raion.put("Raftul 2","Cereale");
        raion.put("Raftul 3","Ciocolata");


        for(String key: raion.keySet())
        {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsul de pe raftul curent este: " + raion.get(key));
        }

    }

    public void afisareProduseV2()
    {
        Map<String, List<String>> raion = new LinkedHashMap<>();
        //linked hashmap - ordoneaza

        List<String> produseRaft1 = new ArrayList<>();
        produseRaft1.add("Lapte");
        produseRaft1.add("Mere");
        produseRaft1.add("Banane");

        List<String> produseRaft2 = new ArrayList<>();
        produseRaft2.add("Struguri");
        produseRaft2.add("Amandine");
        produseRaft2.add("Eclere");

        List<String> produseRaft3 = new ArrayList<>();
        produseRaft3.add("Apa");
        produseRaft3.add("Branza");

        raion.put("Raft 1", produseRaft1);
        raion.put("Raft 2", produseRaft2);
        raion.put("Raft 3", produseRaft3);

        for(String key: raion.keySet())
        {
            System.out.println("Raftul curent este: " + key);
            System.out.println("Produsele de pe raftul curent sunt: " + raion.get(key));
        }

    }

    public void carteDeRetete()
    {
        Map<String, List<String>> retete = new LinkedHashMap<>();

        List<String> ingredienteCiorba = new ArrayList<>();
        ingredienteCiorba.add("2 L Apa");
        ingredienteCiorba.add("10 Cartofi");
        ingredienteCiorba.add("O Ceapa");
        ingredienteCiorba.add("2 Ardei");
        ingredienteCiorba.add("5 Morcovi");

        List<String> ingredienteSarmale = new ArrayList<>();
        ingredienteSarmale.add("O varza");
        ingredienteSarmale.add("100 g orez");
        ingredienteSarmale.add("10 ciuperci mici");
        ingredienteSarmale.add("O ceapa");
        ingredienteSarmale.add("O felie de paine");

        List<String> ingredienteClatite = new ArrayList<>();
        ingredienteClatite.add("1 Kg Faina");
        ingredienteClatite.add("1 L Lapte");

        retete.put("Ciorba", ingredienteCiorba);
        retete.put("Sarmale", ingredienteSarmale);
        retete.put("Clatite", ingredienteClatite);

        for(String key: retete.keySet())
        {
            System.out.println("Pentru a face " + key + " avem nevoie de: ");
            System.out.println(retete.get(key));
        }
    }
}

