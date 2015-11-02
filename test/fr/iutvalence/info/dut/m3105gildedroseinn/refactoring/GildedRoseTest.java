package fr.iutvalence.info.dut.m3105gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.GildedRose;
import fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.Item;

public class GildedRoseTest
{
	private Item item = null;
	
	@Test
	public void updateAnItemShouldLowerItsQualityAndSellIn()
	{
		this.item = new Item("+5 Dexterity Vest", 10, 20);
		
		GildedRose.updateItem(this.item);
		
		assertEquals(item.getSellIn(), 9);
		assertEquals(item.getQuality(), 19);
	}
}
