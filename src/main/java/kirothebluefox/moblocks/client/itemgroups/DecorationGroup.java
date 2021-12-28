package kirothebluefox.moblocks.client.itemgroups;

import kirothebluefox.moblocks.common.init.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class DecorationGroup extends CreativeModeTab {
    public DecorationGroup() {
        super("decoration_creative_tab");
    }

    @Override
    public boolean hasSearchBar() {
        return true;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ModBlocks.COLORABLE_FLOWER_POT.get());
    }
}
