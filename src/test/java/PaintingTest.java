import org.example.Painting;
import org.example.PaintingsList;
import org.junit.jupiter.api.Test;

class PaintingTest {

    @Test
    void paintingsContains() {
        PaintingsList<Object> paintingsList = new PaintingsList<>();

        Painting testPainting = new Painting("test on oil", "Michel");

        paintingsList.addPaintings(testPainting);

        if (paintingsList.getPaintings().getFirst().getClass() == Painting.class) {
            System.out.println("class is good");
        } else {
            System.out.println("class not good");
        }
    }
}
