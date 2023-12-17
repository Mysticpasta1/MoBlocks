package kirothebluefox.moblocks.content.creativetabs;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class Furnitures extends CreativeModeTab {
	public Furnitures() {
		super("furnitures_creative_tab");
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(Item.BY_BLOCK.get());
	}

	@Override
	public boolean hasSearchBar() {
		return true;
	}
}
