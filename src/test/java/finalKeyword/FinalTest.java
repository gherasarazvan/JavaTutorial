package finalKeyword;

import org.testng.annotations.Test;

public class FinalTest {

    // variabila = proprietate care isi poate modifica valoarea
    // constanta = proprietate care nu isi poate modifica valoarea
    // scopul unei constante poate sa fie acela de a pastra aceleasi valori in intreg proiectul

    public final String user = "Andrei@gmail.com";
    public final String password = "123parola";

    @Test
    public void loginTest(){
        System.out.println("Userul s-a logat cu succes folosind user: " + user + " si parola: " + password);
    }
}
