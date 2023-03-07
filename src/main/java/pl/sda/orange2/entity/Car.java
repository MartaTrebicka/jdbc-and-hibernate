package pl.sda.orange2.entity;
//rekordy to klasa.
// tu tylko gettery
public record Car(
        Long id,
        String colour,
        String brand,
        String model
) {
}
