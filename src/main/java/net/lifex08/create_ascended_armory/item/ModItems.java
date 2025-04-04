package net.lifex08.create_ascended_armory.item;

import net.lifex08.create_ascended_armory.CreateAscendedArmory;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(CreateAscendedArmory.MODID);

    public static final DeferredItem<Item> GRANITEALLOY = ITEMS.register("granite_alloy",
            () -> new Item(new Item.Properties()));
    public static final DeferredItem<Item> DIORITEALLOY = ITEMS.register("diorite_alloy",
            () -> new Item(new Item.Properties()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
