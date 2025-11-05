import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {


    private final Main sut = new Main();

    @Test
    @DisplayName("Vazio → 0")
    void emptyString() {
        assertEquals(0, sut.lengthOfLongestSubstring(""));
    }

    @Test
    @DisplayName("Um caractere → 1")
    void singleChar() {
        assertEquals(1, sut.lengthOfLongestSubstring("a"));
    }

    @Test
    @DisplayName("Todos distintos → tamanho da string")
    void allUnique() {
        assertEquals(6, sut.lengthOfLongestSubstring("abcdef"));
    }

    @Test
    @DisplayName("Caso clássico: abcabcbb → 3")
    void classic_abcabcbb() {
        assertEquals(3, sut.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    @DisplayName("Todos iguais: bbbbb → 1")
    void allSame() {
        assertEquals(1, sut.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    @DisplayName("Repetição intercalada: pwwkew → 3 (wke)")
    void interleavedRepeats() {
        assertEquals(3, sut.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    @DisplayName("Repetição no começo e no fim: dvdf → 3 (vdf)")
    void repeatAtEnds() {
        assertEquals(3, sut.lengthOfLongestSubstring("dvdf"));
    }

    @Test
    @DisplayName("Espaços contam: 'a b c' → 3")
    void spacesCount() {
        assertEquals(3, sut.lengthOfLongestSubstring("a b c"));
    }

    @Test
    @DisplayName("Unicode com acentos: 'áéíóú' → 5")
    void unicodeAccents() {
        assertEquals(5, sut.lengthOfLongestSubstring("áéíóú"));
    }

    @Test
    @DisplayName("Substring máxima no meio: 'abba' → 2 (ab ou ba)")
    void maxInMiddle() {
        assertEquals(2, sut.lengthOfLongestSubstring("abba"));
    }

    @Test
    @DisplayName("Mix com números e letras: 'tmmzuxt' → 5 (mzuxt)")
    void mixedAlnum() {
        assertEquals(5, sut.lengthOfLongestSubstring("tmmzuxt"));
    }
}
