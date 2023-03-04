package pl.sda.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {
        BoysDontCry boy = new ChłopakiNiePłaczą();// obiekt
        boy.silnoreki();

        ((ChłopakiNiePłaczą)boy).sing();// rzutowanie

        ChłopakiNiePłaczą boy2 = new ChłopakiNiePłaczą();
        boy2.sing();
    }
}
