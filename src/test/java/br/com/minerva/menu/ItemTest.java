package br.com.minerva.menu;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ItemTest {

    @Test
    public void deveCriarItemEntaoValidarSeNomeFoiPreenchido(){
        Item item = new Item("teste", 84.5d);
        assertEquals("teste", item.getName());
    }

    @Test
    public void naoDeveCriarItemQuandoNomeNaoEstiverPreenchidoEntaoLancarErro(){
         assertThrows(ItemNameNotFilledException.class, () -> new Item("", 84.5d));
    }

    @Test
    public void naoDeveCriarItemQuandoNomeEstiverNuloEntaoLancarErro(){
        assertThrows(ItemNameNotFilledException.class, () -> new Item(null, 84.5d));
    }

    @Test
    public void naoDeveCriarItemQuandoValorNaoEstiverPreenchidoOuForZeroEntaoLancarErro(){
        assertThrows(ItemValueNotFilledException.class, () -> new Item("Hamburger", 0d));
    }

}
