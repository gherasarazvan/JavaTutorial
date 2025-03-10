package temaSporitivi;

public class Sportivi {

    public String numeSportiv;
    public int varstaSportiv;
    public int aniExperientaSportiv;
    public double greutateSportiv;
    public int nrMedaliiSportiv;
    public String echipaSportiv;

    public Sportivi(String numeSportiv, int varstaSportiv, int aniExperientaSportiv, double greutateSportiv, int nrMedaliiSportiv, String echipaSportiv) {
        this.numeSportiv = numeSportiv;
        this.varstaSportiv = varstaSportiv;
        this.aniExperientaSportiv = aniExperientaSportiv;
        this.greutateSportiv = greutateSportiv;
        this.nrMedaliiSportiv = nrMedaliiSportiv;
        this.echipaSportiv = echipaSportiv;
    }

    public void rezumat() {
        System.out.println("Numele sportivului este: " + numeSportiv);
        System.out.println("Varsta sportivului este: " + varstaSportiv);
        System.out.println("Greutatea sportivului este: " + greutateSportiv);
        System.out.println("Sportivul are: " + nrMedaliiSportiv + " medalii castigate si " + aniExperientaSportiv + " ani experienta");
        System.out.println("Echipa din care face parte sportivul este: " + echipaSportiv);
    }

    public Sportivi(String numeSportiv, int varstaSportiv, String echipaSportiv) {
        this.numeSportiv = numeSportiv;
        this.varstaSportiv = varstaSportiv;
        this.echipaSportiv = echipaSportiv;
        if(aniExperientaSportiv==0 & greutateSportiv==0 & nrMedaliiSportiv==0){
            System.out.println("Numele sportivului este: " + numeSportiv);
            System.out.println("Varsta sportivului este: " + varstaSportiv);
            System.out.println("Echipa din care face parte sportivul este: " + echipaSportiv);
        }

    }
}
