package net.rezolv.obsidanum.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rezolv.obsidanum.Obsidanum;
import net.rezolv.obsidanum.block.custom.*;
import net.rezolv.obsidanum.chests.blocks.BlockStoneChest;
import net.rezolv.obsidanum.chests.blocks.EnumStoneChest;
import net.rezolv.obsidanum.fluid.ModFluids;
import net.rezolv.obsidanum.item.ItemsObs;
import net.rezolv.obsidanum.world.tree.ObsidanOak;
import net.rezolv.obsidanum.world.wood.ModWoodTypes;

import java.util.function.Supplier;

public class BlocksObs {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Obsidanum.MOD_ID);
    public static final RegistryObject<NetherFlameBlock> NETHER_FLAME_BLOCK = BLOCKS.register("nether_flame_block",
            () -> new NetherFlameBlock(ModFluids.SOURCE_NETHER_FIRE_LAVA, BlockBehaviour.Properties.copy(Blocks.LAVA)));
    public static final RegistryObject<Block> OBSIDAN_WOOD_LEAVES = BLOCKS.register("obsidan_wood_leaves",
            () -> new FlameLeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)));

    public static final RegistryObject<Block> OBSIDAN_SAPLING = BLOCKS.register("obsidan_sapling",
            () -> new SaplingBlock(new ObsidanOak(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)));
    public static final RegistryObject<Block> OBSIDAN_WOOD_LOG = registerBlock("obsidan_wood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> OBSIDAN_WOOD = registerBlock("obsidan_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_OBSIDAN_WOOD_LOG = registerBlock("stripped_obsidan_wood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG).strength(3f)));
    public static final RegistryObject<Block> STRIPPED_OBSIDAN_WOOD = registerBlock("stripped_obsidan_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD).strength(3f)));

    public static final RegistryObject<Block> OBSIDIAN_TABLET = registerBlock("obsidian_tablet",
            () -> new ObsidianTablet(BlockBehaviour.Properties.of().mapColor(MapColor.METAL)
                    .strength(20, 500).sound(SoundType.CHERRY_WOOD).hasPostProcess((bs, br, bp) -> true).emissiveRendering((bs, br, bp) -> true)  // Устанавливаем предикат на true, чтобы всегда использовать эмиссирующий рендеринг

                    .mapColor(MapColor.COLOR_BLACK).requiresCorrectToolForDrops().noOcclusion()));
    public static final RegistryObject<Block> OBSIDIAN_INLAID_COLUMN = registerBlock("obsidian_inlaid_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_INLAID_COLUMN = registerBlock("cracked_obsidian_inlaid_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_INLAID_COLUMN = registerBlock("moldy_obsidian_inlaid_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_COLUMN = registerBlock("obsidian_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_COLUMN = registerBlock("cracked_obsidian_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_COLUMN = registerBlock("moldy_obsidian_column",
            () -> new RotatedPillarBlock(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED = registerBlock("obsidian_polished",
            () -> new Block(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops().forceSolidOn()));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED_WALL = registerBlock("obsidian_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_POLISHED_WALL = registerBlock("cracked_obsidian_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_POLISHED_WALL = registerBlock("moldy_obsidian_polished_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_BRICKS_WALL = registerBlock("obsidian_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS_WALL = registerBlock("cracked_obsidian_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_BRICKS_WALL = registerBlock("moldy_obsidian_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED_FENCE = registerBlock("obsidian_polished_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_POLISHED_FENCE = registerBlock("cracked_obsidian_polished_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_POLISHED_FENCE = registerBlock("moldy_obsidian_polished_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_POLISHED = registerBlock("cracked_obsidian_polished",
            () -> new Block(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_POLISHED = registerBlock("moldy_obsidian_polished",
            () -> new Block(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_DOOR = registerBlock("obsidian_door",
            () -> new ObsidianDoor(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE)
                    .requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CARVED_OBSIDIAN_BRICKS = registerBlock("carved_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_CARVED_OBSIDIAN_BRICKS = registerBlock("moldy_carved_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_CARVED_OBSIDIAN_BRICKS = registerBlock("cracked_carved_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_BRICKS = registerBlock("obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_BRICKS_FENCE = registerBlock("obsidian_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS_FENCE = registerBlock("cracked_obsidian_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_BRICKS_FENCE = registerBlock("moldy_obsidian_bricks_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of().strength(20.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS = registerBlock("cracked_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_BRICKS = registerBlock("moldy_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MYSTERIOUS_CARVED_OBSIDIAN_BRICKS = registerBlock("mysterious_carved_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_MYSTERIOUS_CARVED_OBSIDIAN_BRICKS = registerBlock("cracked_mysterious_carved_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_MYSTERIOUS_CARVED_OBSIDIAN_BRICKS = registerBlock("moldy_mysterious_carved_obsidian_bricks",
            () -> new Block(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDAN_PLANKS = registerBlock("obsidan_planks",
            () -> new FlameBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> OBSIDAN_WOOD_DOOR = registerBlock("obsidan_wood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_DOOR).sound(SoundType.CHERRY_WOOD),BlockSetType.OAK));
    public static final RegistryObject<Block> OBSIDAN_WOOD_TRAPDOOR = registerBlock("obsidan_wood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_DOOR).sound(SoundType.CHERRY_WOOD),BlockSetType.OAK));
    public static final RegistryObject<Block> OBSIDAN_PLANKS_PRESSURE_PLATE = registerBlock("obsidan_planks_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING,
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD),
                    BlockSetType.IRON));
    public static final RegistryObject<Block> OBSIDAN_PLANKS_BUTTON = registerBlock("obsidan_planks_button",
            () -> new FlameButton(BlockBehaviour.Properties.copy(Blocks.CHERRY_BUTTON).sound(SoundType.CHERRY_WOOD),
                    BlockSetType.OAK, 10, true));
    public static final RegistryObject<Block> OBSIDAN_PLANKS_STAIRS = registerBlock("obsidan_planks_stairs",
            () -> new FlameStairs(() -> BlocksObs.OBSIDAN_PLANKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED_STAIRS = registerBlock("obsidian_polished_stairs",
            () -> new StairBlock(() -> BlocksObs.OBSIDIAN_POLISHED.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_POLISHED_STAIRS = registerBlock("cracked_obsidian_polished_stairs",
            () -> new StairBlock(() -> BlocksObs.CRACKED_OBSIDIAN_POLISHED.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_POLISHED_STAIRS = registerBlock("moldy_obsidian_polished_stairs",
            () -> new StairBlock(() -> BlocksObs.MOLDY_OBSIDIAN_POLISHED.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_BRICKS_STAIRS = registerBlock("obsidian_bricks_stairs",
            () -> new StairBlock(() -> BlocksObs.OBSIDIAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS_STAIRS = registerBlock("cracked_obsidian_bricks_stairs",
            () -> new StairBlock(() -> BlocksObs.CRACKED_OBSIDIAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_BRICKS_STAIRS = registerBlock("moldy_obsidian_bricks_stairs",
            () -> new StairBlock(() -> BlocksObs.MOLDY_OBSIDIAN_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_BRICKS_SLAB = registerBlock("obsidian_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_BRICKS_SLAB = registerBlock("cracked_obsidian_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_BRICKS_SLAB = registerBlock("moldy_obsidian_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDIAN_POLISHED_SLAB = registerBlock("obsidian_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(50.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> CRACKED_OBSIDIAN_POLISHED_SLAB = registerBlock("cracked_obsidian_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(35.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> MOLDY_OBSIDIAN_POLISHED_SLAB = registerBlock("moldy_obsidian_polished_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of().strength(40.0F, 1200.0F).sound(SoundType.STONE).requiresCorrectToolForDrops()));
    public static final RegistryObject<Block> OBSIDAN_PLANKS_SLAB = registerBlock("obsidan_planks_slab",
            () -> new FlameSlab(BlockBehaviour.Properties.copy(Blocks.CHERRY_PLANKS).sound(SoundType.CHERRY_WOOD)));
    public static final RegistryObject<Block> OBSIDAN_SIGN = BLOCKS.register("obsidan_sign",
            () -> new ModStandingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), ModWoodTypes.OBSIDAN));
    public static final RegistryObject<Block> OBSIDAN_WALL_SIGN = BLOCKS.register("obsidan_wall_sign",
            () -> new ModWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), ModWoodTypes.OBSIDAN));

    public static final RegistryObject<Block> OBSIDAN_HANGING_SIGN = BLOCKS.register("obsidan_hanging_sign",
            () -> new ModHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), ModWoodTypes.OBSIDAN));
    public static final RegistryObject<Block> OBSIDAN_WALL_HANGING_SIGN = BLOCKS.register("obsidan_wall_hanging_sign",
            () -> new ModWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), ModWoodTypes.OBSIDAN));



    //Метод регистрации блоков
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ItemsObs.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
