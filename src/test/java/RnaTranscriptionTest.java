import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RnaTranscriptionTest {

    private RnaTranscription rnaTranscription;

    @BeforeEach
    public void setUp() {
        rnaTranscription = new RnaTranscription();
    }

    @Test
    public void testEmptyRnaSequence() {
        String actual = rnaTranscription.transcribe("");

        assertThat(actual).isEmpty();
    }

    @Test
    public void testRnaTranscriptionOfCytosineIsGuanine() {
        String expected = "G";

        String inputStrand = "C";

        String actual = rnaTranscription.transcribe(inputStrand);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testRnaTranscriptionOfGuanineIsCytosine() {
        String expected = "C";

        String inputStrand = "G";

        String actual = rnaTranscription.transcribe(inputStrand);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testRnaTranscriptionOfThymineIsAdenine() {
        String expected = "A";

        String inputStrand = "T";

        String actual = rnaTranscription.transcribe(inputStrand);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testRnaTranscriptionOfAdenineIsUracil() {

        String expected = "U";

        String inputStrand = "A";

        String actual = rnaTranscription.transcribe(inputStrand);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void testRnaTranscription() {
        String expected = "UGCACCAGAAUU";

        String inputString = "ACGTGGTCTTAA";

        String actual = rnaTranscription.transcribe(inputString);

        assertThat(actual).isEqualTo(expected);
    }
}


