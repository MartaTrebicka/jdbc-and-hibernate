package pl.sda.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {
        BoysDontCry boy = new ChłopakiNiePłaczą();// obiekt
        boy.silnoreki();

        ((ChłopakiNiePłaczą)boy).sing();// rzutowanie

        ChłopakiNiePłaczą boy2 = new ChłopakiNiePłaczą();
        boy2.sing();

        // anonymous class
        BoysDontCry anonymousClassReference = new BoysDontCry() { // stowrzyliśmy klasę bez nazwy która implementuje interface BoysDontCry
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy silnoreki");
            }
        };
        anonymousClassReference.silnoreki();


        //ROBIENIE LAMBDY
        // () parenthesis - arguments list
        // -> arguments, body separator
        // {} parenthesis - method body



        BoysDontCry firstLambda = () -> {};  //metoda silnoreki jest void i jest pusta (bo silboreki () i pusty nawias)
BoysDontCry secondLambda = () -> System.out.println("Lambda");

secondLambda.silnoreki(); // żeby to wypisać na konsoli

        BoysDontCry thirdLambda= () -> {
            System.out.println("one");
            System.out.println("second");
        };

        System.out.println("_________________________");
        System.out.println("Coffee time");

       CoffeeMaker myCoffeeMaker = (int water, String coffeeType) -> "my coffe"; // Typ interface. po = dajemy parametry metody. a po -> co wywołujemy
        CoffeeMaker myCoffeeMaker2 = (int water, String coffeeType) -> {
            return "my coffee";
        };
        CoffeeMaker myCoffeeMaker3 = (int water, String coffeeType) -> {
            System.out.println("Coffee brewing...");
            return "Java Latte";
        };
        String myCoffee = myCoffeeMaker3.prepare(5, "Small");
        System.out.println("my coffe is ready: " + myCoffee);

        CoffeeMaker shortVersion = (water, coffeeType) -> "my coffee";
shortVersion.prepare(5,"Large Java coffee");

    }
}
