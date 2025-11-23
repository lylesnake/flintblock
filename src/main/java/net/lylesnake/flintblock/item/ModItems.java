package net.lylesnake.flintblock.item;

import net.lylesnake.flintblock.FlintBlock;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(FlintBlock.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
