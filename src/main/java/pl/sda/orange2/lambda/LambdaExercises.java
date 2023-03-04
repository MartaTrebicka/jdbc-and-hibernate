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
    }
}
