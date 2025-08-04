package net.lifex08.create_ascended_armory.item;

import net.lifex08.create_ascended_armory.CreateAscendedArmory;
import net.lifex08.create_ascended_armory.block.custom.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
        DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateAscendedArmory.MODID);

    public static final Supplier<CreativeModeTab> ASCENDED_ARMORY_INGREDIENTS_TAB = CREATIVE_MODE_TAB.register("ascended_armory_ingredients_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIORITEALLOY.get()))
                    .title(Component.translatable("creativetab.create_ascended_armory.ascended_armory_ingredients"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.GRANITEALLOY.get());
                        output.accept(ModItems.DIORITEALLOY.get());
                        output.accept(ModBlocks.GRANITE_ALLOY_BLOCK.get());
                        output.accept(ModBlocks.DIORITE_ALLOY_BLOCK.get());
                    }).build());


    public static final Supplier<CreativeModeTab> ASCENDED_ARMORY_WEAPONS_TAB = CREATIVE_MODE_TAB.register("ascended_armory_weapons_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DIORITEALLOY.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(CreateAscendedArmory.MODID, "ascended_armory_ingredients_tab"))
                    .title(Component.translatable("creativetab.create_ascended_armory.ascended_armory_weapons"))
                    .displayItems((parameters, output) -> {
                        //output.accept(ModItems..get());
                        //output.accept(ModItems..get());
                    }).build());



    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TAB.register(eventBus);
    }


}
