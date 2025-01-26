package com.lpprogramming.minecraft.oc2_vs;

import li.cil.oc2.common.item.*;

import li.cil.oc2.api.API;
import li.cil.oc2.common.Constants;
import li.cil.oc2.common.Config;
import li.cil.oc2.common.block.Blocks;
import li.cil.oc2.common.bus.device.data.BlockDeviceDataRegistry;
import li.cil.oc2.common.bus.device.data.FirmwareRegistry;
import li.cil.oc2.common.util.RegistryUtils;
import li.cil.oc2.common.tags.*;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import li.cil.oc2.common.bus.device.data.FileSystems;
import net.minecraft.core.Registry;

import java.util.function.Function;
import java.util.function.Supplier;


public final class Items {
    private static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "oc2_vs");
    
    public static final RegistryObject<Item> SHIP_OPERATIONS_MODULE = register("ship_operations_module", ModItem::new);
    
    public static void initialize() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> factory) {
        return ITEMS.register(name, factory);
    }
}
