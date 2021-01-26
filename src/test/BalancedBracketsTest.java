package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //backwards brackets returns false
    @Test
    public void backwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    //string enclosed in set of brackets returns true
    @Test
    public void strEnclosedInBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways.]"));
    }

    //string enclosed in backwards set of brackets returns false
    @Test
    public void strEnclosedInBackwardsBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways.["));
    }

    //string of only open bracket returns false
    @Test
    public void onlyOpenBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    //string of only closed bracket returns false
    @Test
    public void onlyClosedBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    //set of 2 open brackets returns false
    @Test
    public void twoOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[["));
    }

    //set of 2 closed brackets returns false
    @Test
    public void twoClosedBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]"));
    }

    //set of brackets anywhere in string returns true
    @Test
    public void bracketsWithinStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("According to all known [laws of aviation], there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways."));
    }

    //uneven amount of open and closed brackets returns false
    @Test
    public void unevenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[][][]]]"));
    }

    //string with no brackets returns true
    @Test
    public void noBracketsReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways."));
    }

    //string with no closing bracket anywhere returns false
    @Test
    public void noClosingBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways."));
    }

    //string with no opening bracket anywhere returns false
    @Test
    public void noOpeningBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("According to all known laws of aviation, there is no way that a bee should be able to fly. Its wings are too small to get its fat little body off the ground. The bee, of course, flies anyways.]"));
    }
}
