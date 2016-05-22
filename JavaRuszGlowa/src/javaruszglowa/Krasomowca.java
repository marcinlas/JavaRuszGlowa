
package javaruszglowa;

public class Krasomowca {
    
    public static void main (String[] args) {
        
        //3 grupy słów, które będą wybierane do zdania
        String[] listaSlow1 = 
        {
            "architektura wielowarstwowa", "30000 metrów", "rozwiazanie B-do-B", 
            "aplikacja kliencka", "interfejs internetowy", "inteligentna karta", 
            "rozwiazanie dynamiczne", "szesc sigma", "przenikliwo"
        };
        
        String[] listaSlow2 =
        {
            "zwiesza mozliwosci", "poprawia atrakcyjnosc", "poprawia wartość",
            "opracowana dla", "bazująca na", "rozproszona","sieci",
            "skoncentrowany na", "podniesiona na wyższy poziom", "skierowanej",
            "udostępniona"
        };
        
        String[] listaSlow3 = 
        {
            "procesu", "puntku wpisywania", "rozwiązania", "strategii", "paradygmatu",
            "portalu", "witryny", "wersji", "misji"
        };

        // określenie, ile jest słów w każdej z list
        int lista1Dlugosc = listaSlow1.length;
        int lista2Dlugosc = listaSlow2.length;
        int lista3Dlugosc = listaSlow3.length;
        
        //generacja 3 losowych słów - zwrotów
        int rnd1 = (int) (Math.random() * lista1Dlugosc);  // int w nawiasie to zmiana typu
        int rnd2 = (int) (Math.random() * lista2Dlugosc);  // czyli rzutowawnie typów
        int rnd3 = (int) (Math.random() * lista3Dlugosc);
        
        //stworenie zdania
        String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];
        
        //wyświetlenia zdania
        System.out.println("To jest to, czego nam trzeba: " + zdanie);
        
       
    }
}

