package pl.sda.orange2.lambda;


// Its functional interface because has ne abstract method

@FunctionalInterface  // ochrona przed uzytkownikami javy.
public interface BoysDontCry {

    void silnoreki();

    default void cry() {
    }// rozszerzenie interface. ale inni użytkownicy dzieki temu,że to default nie muszą tego u siebie aktualizować jakby
}
