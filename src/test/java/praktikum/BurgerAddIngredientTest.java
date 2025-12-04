package praktikum;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


public class BurgerAddIngredientTest {

    @Test
    public void testAddIngredient() {
        Burger burger = new Burger();
        Ingredient ingredient = mock(Ingredient.class);

        burger.addIngredient(ingredient);

        assertEquals(1, burger.ingredients.size());
        assertTrue(burger.ingredients.get(0) == ingredient);
    }
}
