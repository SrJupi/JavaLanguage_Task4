package n3e01;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GenerateIntegersTest {

    @Test
    void testInteger (){
        //generate Integer a = 3, b=3 and c = 5
        GenerateIntegers gi = new GenerateIntegers();

        assertThat(gi.a).isEqualTo(gi.b);
        assertThat(gi.b).isNotEqualTo(gi.c);
    }

}