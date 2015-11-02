package fr.iutvalence.info.dut.m3105gildedroseinn.refactoring;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.GildedRose;
import fr.iutvalence.info.dut.m3105.gildedroseinn.refactoring.Item;

public class GildedRoseTest
{
	public static final Item ITEM_WITH_BOTH_POSITIVE_SELLIN_AND_QUALITY = new Item("+5 Dexterity Vest", 10, 20);
	public static final Item ITEM_WITH_NEGATIVE_SELLIN_AND_POSITIVE_QUALITY = new Item("+5 Dexterity Vest", -1, 20);
	
	private Item item = null;
	
	@Test
	public void updateAnItemShouldLowerItsQualityAndSellIn()
	{
		int expectedQuality = ITEM_WITH_BOTH_POSITIVE_SELLIN_AND_QUALITY.getQuality()-1;
		int expectedSellIn = ITEM_WITH_BOTH_POSITIVE_SELLIN_AND_QUALITY.getSellIn()-1;
		
		GildedRose.updateItem(ITEM_WITH_BOTH_POSITIVE_SELLIN_AND_QUALITY);
		
		assertEquals(ITEM_WITH_BOTH_POSITIVE_SELLIN_AND_QUALITY.getSellIn(), expectedSellIn);
		assertEquals(ITEM_WITH_BOTH_POSITIVE_SELLIN_AND_QUALITY.getQuality(), expectedQuality);
	}
	
	@Test
	public void updateAnItemWithANegativeSellInShouldLowerItsQualityByTwo()
	{
		int expectedQuality = ITEM_WITH_NEGATIVE_SELLIN_AND_POSITIVE_QUALITY.getQuality()-2;
		int expectedSellIn = ITEM_WITH_NEGATIVE_SELLIN_AND_POSITIVE_QUALITY.getSellIn()-1;
		
		GildedRose.updateItem(ITEM_WITH_NEGATIVE_SELLIN_AND_POSITIVE_QUALITY);
		
		assertEquals(ITEM_WITH_NEGATIVE_SELLIN_AND_POSITIVE_QUALITY.getSellIn(), expectedSellIn);
		assertEquals(ITEM_WITH_NEGATIVE_SELLIN_AND_POSITIVE_QUALITY.getQuality(), expectedQuality);
	}
}
