package net.frogenet.frogetech.item;

import net.frogenet.frogetech.Frogetech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(Frogetech.MODID);

    public static final DeferredItem<Item> GUNK_BALL = ITEMS.registerItem("gunk_ball",
            Item::new, new Item.Properties());


    public static void register(IEventBus bus) {
        ITEMS.register(bus);
    }
}
