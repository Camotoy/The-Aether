package com.aetherteam.aether.data.generators.tags;

import com.aetherteam.aether.Aether;
import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AetherBlockTagData extends BlockTagsProvider {
    public AetherBlockTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, @Nullable ExistingFileHelper helper) {
        super(output, registries, Aether.MODID, helper);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addTags(HolderLookup.Provider provider) {
        // Aether
        this.tag(AetherTags.Blocks.TREATED_AS_VANILLA_BLOCK).add(
                AetherBlocks.CHEST_MIMIC.get(),
                AetherBlocks.FROSTED_ICE.get(),
                AetherBlocks.UNSTABLE_OBSIDIAN.get());
        this.tag(AetherTags.Blocks.AETHER_PORTAL_BLOCKS).add(Blocks.GLOWSTONE);
        this.tag(AetherTags.Blocks.AETHER_PORTAL_BLACKLIST).add(AetherBlocks.BLUE_AERCLOUD.get()).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS
        );
        this.tag(AetherTags.Blocks.AETHER_ISLAND_BLOCKS).add(
                AetherBlocks.AETHER_DIRT.get(),
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                AetherBlocks.HOLYSTONE.get());
        this.tag(AetherTags.Blocks.AETHER_DIRT).add(
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get(),
                AetherBlocks.AETHER_DIRT.get());
        this.tag(AetherTags.Blocks.HOLYSTONE).add(
                AetherBlocks.HOLYSTONE.get(),
                AetherBlocks.MOSSY_HOLYSTONE.get());
        this.tag(AetherTags.Blocks.AERCLOUDS).add(
                AetherBlocks.COLD_AERCLOUD.get(),
                AetherBlocks.BLUE_AERCLOUD.get(),
                AetherBlocks.GOLDEN_AERCLOUD.get());
        this.tag(AetherTags.Blocks.SKYROOT_LOGS).add(
                AetherBlocks.SKYROOT_LOG.get(),
                AetherBlocks.SKYROOT_WOOD.get(),
                AetherBlocks.STRIPPED_SKYROOT_LOG.get(),
                AetherBlocks.STRIPPED_SKYROOT_WOOD.get());
        this.tag(AetherTags.Blocks.GOLDEN_OAK_LOGS).add(
                AetherBlocks.GOLDEN_OAK_LOG.get(),
                AetherBlocks.GOLDEN_OAK_WOOD.get());
        this.tag(AetherTags.Blocks.ALLOWED_BUCKET_PICKUP).add(
                Blocks.POWDER_SNOW);
        this.tag(AetherTags.Blocks.AEROGEL).add(AetherBlocks.AEROGEL.get(),
                AetherBlocks.AEROGEL_WALL.get(),
                AetherBlocks.AEROGEL_STAIRS.get(),
                AetherBlocks.AEROGEL_SLAB.get());
        this.tag(AetherTags.Blocks.DUNGEON_BLOCKS).add(
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get());
        this.tag(AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS).add(
                AetherBlocks.LOCKED_CARVED_STONE.get(),
                AetherBlocks.LOCKED_SENTRY_STONE.get(),
                AetherBlocks.LOCKED_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_HELLFIRE_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_HELLFIRE_STONE.get());
        this.tag(AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS).add(
                AetherBlocks.TRAPPED_CARVED_STONE.get(),
                AetherBlocks.TRAPPED_SENTRY_STONE.get(),
                AetherBlocks.TRAPPED_ANGELIC_STONE.get(),
                AetherBlocks.TRAPPED_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.TRAPPED_HELLFIRE_STONE.get(),
                AetherBlocks.TRAPPED_LIGHT_HELLFIRE_STONE.get());
        this.tag(AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS).add(
                AetherBlocks.BOSS_DOORWAY_CARVED_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_SENTRY_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_ANGELIC_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_HELLFIRE_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_LIGHT_HELLFIRE_STONE.get());
        this.tag(AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS).add(
                AetherBlocks.TREASURE_DOORWAY_CARVED_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_SENTRY_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_ANGELIC_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_HELLFIRE_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_LIGHT_HELLFIRE_STONE.get());
        this.tag(AetherTags.Blocks.SENTRY_BLOCKS).add(
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.LOCKED_CARVED_STONE.get(),
                AetherBlocks.LOCKED_SENTRY_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_CARVED_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_SENTRY_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_CARVED_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_SENTRY_STONE.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.CARVED_WALL.get());
        this.tag(AetherTags.Blocks.ANGELIC_BLOCKS).add(
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_ANGELIC_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_ANGELIC_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.ANGELIC_WALL.get());
        this.tag(AetherTags.Blocks.HELLFIRE_BLOCKS).add(
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.LOCKED_HELLFIRE_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_HELLFIRE_STONE.get(),
                AetherBlocks.BOSS_DOORWAY_LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_HELLFIRE_STONE.get(),
                AetherBlocks.TREASURE_DOORWAY_LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HELLFIRE_WALL.get());
        this.tag(AetherTags.Blocks.SLIDER_UNBREAKABLE).add(
                Blocks.BARRIER,
                Blocks.BEDROCK,
                Blocks.END_PORTAL,
                Blocks.END_PORTAL_FRAME,
                Blocks.END_GATEWAY,
                Blocks.COMMAND_BLOCK,
                Blocks.REPEATING_COMMAND_BLOCK,
                Blocks.CHAIN_COMMAND_BLOCK,
                Blocks.STRUCTURE_BLOCK,
                Blocks.JIGSAW,
                Blocks.MOVING_PISTON,
                Blocks.LIGHT,
                Blocks.REINFORCED_DEEPSLATE
        ).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS,
                AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS);
        this.tag(AetherTags.Blocks.VALKYRIE_QUEEN_UNBREAKABLE).add(
                Blocks.WATER,
                Blocks.BEDROCK,
                Blocks.END_PORTAL,
                Blocks.END_PORTAL_FRAME,
                Blocks.END_GATEWAY,
                Blocks.COMMAND_BLOCK,
                Blocks.REPEATING_COMMAND_BLOCK,
                Blocks.CHAIN_COMMAND_BLOCK,
                Blocks.STRUCTURE_BLOCK,
                Blocks.JIGSAW,
                Blocks.MOVING_PISTON,
                Blocks.LIGHT,
                Blocks.REINFORCED_DEEPSLATE
        ).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS,
                AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS);
        this.tag(AetherTags.Blocks.NON_BRONZE_DUNGEON_REPLACEABLE).add(
                Blocks.AIR,
                Blocks.CHEST,
                AetherBlocks.CHEST_MIMIC.get(),
                AetherBlocks.TREASURE_CHEST.get()
        ).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS);
        this.tag(AetherTags.Blocks.GRAVITITE_ABILITY_BLACKLIST).addTags(
                BlockTags.BUTTONS,
                BlockTags.PRESSURE_PLATES,
                BlockTags.TRAPDOORS,
                BlockTags.FENCE_GATES);
        this.tag(AetherTags.Blocks.AETHER_ANIMALS_SPAWNABLE_ON).add(AetherBlocks.AETHER_GRASS_BLOCK.get());
        this.tag(AetherTags.Blocks.SWET_SPAWNABLE_ON).add(AetherBlocks.AETHER_GRASS_BLOCK.get());
        this.tag(AetherTags.Blocks.AECHOR_PLANT_SPAWNABLE_ON).add(AetherBlocks.AETHER_GRASS_BLOCK.get());
        this.tag(AetherTags.Blocks.INFINIBURN).addTag(BlockTags.INFINIBURN_OVERWORLD);
        this.tag(AetherTags.Blocks.ALLOWED_FLAMMABLES).add(Blocks.SOUL_SAND, Blocks.SOUL_SOIL).addTags(
                AetherTags.Blocks.INFINIBURN,
                AetherTags.Blocks.HELLFIRE_BLOCKS);
        this.tag(AetherTags.Blocks.VALKYRIE_TELEPORTABLE_ON).add(
                AetherBlocks.LOCKED_ANGELIC_STONE.get(),
                AetherBlocks.LOCKED_LIGHT_ANGELIC_STONE.get());
        this.tag(AetherTags.Blocks.TREATED_AS_AETHER_BLOCK);

        // Vanilla
        this.tag(BlockTags.STONE_BRICKS).add(AetherBlocks.HOLYSTONE_BRICKS.get()).addTag(AetherTags.Blocks.DUNGEON_BLOCKS);
        this.tag(BlockTags.WOODEN_STAIRS).add(AetherBlocks.SKYROOT_STAIRS.get());
        this.tag(BlockTags.WOODEN_SLABS).add(AetherBlocks.SKYROOT_SLAB.get());
        this.tag(BlockTags.WOODEN_FENCES).add(AetherBlocks.SKYROOT_FENCE.get());
        this.tag(BlockTags.WOODEN_DOORS).add(AetherBlocks.SKYROOT_DOOR.get());
        this.tag(BlockTags.WOODEN_TRAPDOORS).add(AetherBlocks.SKYROOT_TRAPDOOR.get());
        this.tag(BlockTags.WOODEN_BUTTONS).add(AetherBlocks.SKYROOT_BUTTON.get());
        this.tag(BlockTags.WOODEN_PRESSURE_PLATES).add(AetherBlocks.SKYROOT_PRESSURE_PLATE.get());
        this.tag(BlockTags.BUTTONS).add(
                AetherBlocks.SKYROOT_BUTTON.get(),
                AetherBlocks.HOLYSTONE_BUTTON.get());
        this.tag(BlockTags.PRESSURE_PLATES).add(
                AetherBlocks.SKYROOT_PRESSURE_PLATE.get(),
                AetherBlocks.HOLYSTONE_PRESSURE_PLATE.get());
        this.tag(BlockTags.SAPLINGS).add(
                AetherBlocks.SKYROOT_SAPLING.get(),
                AetherBlocks.GOLDEN_OAK_SAPLING.get());
        this.tag(BlockTags.LOGS_THAT_BURN).addTags(
                AetherTags.Blocks.SKYROOT_LOGS,
                AetherTags.Blocks.GOLDEN_OAK_LOGS);
        this.tag(BlockTags.STAIRS).add(
                AetherBlocks.SKYROOT_STAIRS.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_STAIRS.get(),
                AetherBlocks.MOSSY_HOLYSTONE_STAIRS.get(),
                AetherBlocks.ICESTONE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_BRICK_STAIRS.get(),
                AetherBlocks.AEROGEL_STAIRS.get());
        this.tag(BlockTags.SLABS).add(
                AetherBlocks.SKYROOT_SLAB.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HOLYSTONE_SLAB.get(),
                AetherBlocks.MOSSY_HOLYSTONE_SLAB.get(),
                AetherBlocks.ICESTONE_SLAB.get(),
                AetherBlocks.HOLYSTONE_BRICK_SLAB.get(),
                AetherBlocks.AEROGEL_SLAB.get());
        this.tag(BlockTags.WALLS).add(
                AetherBlocks.CARVED_WALL.get(),
                AetherBlocks.ANGELIC_WALL.get(),
                AetherBlocks.HELLFIRE_WALL.get(),
                AetherBlocks.HOLYSTONE_WALL.get(),
                AetherBlocks.MOSSY_HOLYSTONE_WALL.get(),
                AetherBlocks.ICESTONE_WALL.get(),
                AetherBlocks.HOLYSTONE_BRICK_WALL.get(),
                AetherBlocks.AEROGEL_WALL.get());
        this.tag(BlockTags.LEAVES).add(
                AetherBlocks.SKYROOT_LEAVES.get(),
                AetherBlocks.GOLDEN_OAK_LEAVES.get(),
                AetherBlocks.CRYSTAL_LEAVES.get(),
                AetherBlocks.CRYSTAL_FRUIT_LEAVES.get(),
                AetherBlocks.HOLIDAY_LEAVES.get(),
                AetherBlocks.DECORATED_HOLIDAY_LEAVES.get());
        this.tag(BlockTags.SMALL_FLOWERS).add(
                AetherBlocks.PURPLE_FLOWER.get(),
                AetherBlocks.WHITE_FLOWER.get());
        this.tag(BlockTags.BEDS).add(AetherBlocks.SKYROOT_BED.get());
        this.tag(BlockTags.DIRT).addTag(AetherTags.Blocks.AETHER_DIRT);
        this.tag(BlockTags.FLOWER_POTS).add(
                AetherBlocks.POTTED_BERRY_BUSH.get(),
                AetherBlocks.POTTED_BERRY_BUSH_STEM.get(),
                AetherBlocks.POTTED_PURPLE_FLOWER.get(),
                AetherBlocks.POTTED_WHITE_FLOWER.get(),
                AetherBlocks.POTTED_SKYROOT_SAPLING.get(),
                AetherBlocks.POTTED_GOLDEN_OAK_SAPLING.get());
        this.tag(BlockTags.ENDERMAN_HOLDABLE).addTag(AetherTags.Blocks.AETHER_DIRT).add(
                AetherBlocks.QUICKSOIL.get(),
                AetherBlocks.PURPLE_FLOWER.get(),
                AetherBlocks.WHITE_FLOWER.get());
        this.tag(BlockTags.VALID_SPAWN).addTag(AetherTags.Blocks.AETHER_DIRT);
        this.tag(BlockTags.IMPERMEABLE).add(AetherBlocks.QUICKSOIL_GLASS.get());
        this.tag(BlockTags.BAMBOO_PLANTABLE_ON).addTag(AetherTags.Blocks.AETHER_DIRT);
        this.tag(BlockTags.SIGNS).add(
                AetherBlocks.SKYROOT_SIGN.get(),
                AetherBlocks.SKYROOT_WALL_SIGN.get());
        this.tag(BlockTags.STANDING_SIGNS).add(AetherBlocks.SKYROOT_SIGN.get());
        this.tag(BlockTags.WALL_SIGNS).add(AetherBlocks.SKYROOT_WALL_SIGN.get());
        this.tag(BlockTags.DRAGON_IMMUNE).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS,
                AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.AEROGEL);
        this.tag(BlockTags.WITHER_IMMUNE).addTags(
                AetherTags.Blocks.LOCKED_DUNGEON_BLOCKS,
                AetherTags.Blocks.TRAPPED_DUNGEON_BLOCKS,
                AetherTags.Blocks.BOSS_DOORWAY_DUNGEON_BLOCKS,
                AetherTags.Blocks.TREASURE_DOORWAY_DUNGEON_BLOCKS);
        this.tag(BlockTags.BEE_GROWABLES).add(AetherBlocks.BERRY_BUSH_STEM.get());
        this.tag(BlockTags.PORTALS).add(AetherBlocks.AETHER_PORTAL.get());
        this.tag(BlockTags.BEACON_BASE_BLOCKS).add(
                AetherBlocks.ZANITE_BLOCK.get(),
                AetherBlocks.ENCHANTED_GRAVITITE.get());
        this.tag(BlockTags.WALL_POST_OVERRIDE).add(AetherBlocks.AMBROSIUM_TORCH.get());
        this.tag(BlockTags.FENCE_GATES).add(AetherBlocks.SKYROOT_FENCE_GATE.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE).add(
                AetherBlocks.HOLYSTONE.get(),
                AetherBlocks.MOSSY_HOLYSTONE.get(),
                AetherBlocks.ICESTONE.get(),
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get(),
                AetherBlocks.HOLYSTONE_BRICKS.get(),
                AetherBlocks.AEROGEL.get(),
                AetherBlocks.AMBROSIUM_BLOCK.get(),
                AetherBlocks.ZANITE_BLOCK.get(),
                AetherBlocks.ENCHANTED_GRAVITITE.get(),
                AetherBlocks.ALTAR.get(),
                AetherBlocks.FREEZER.get(),
                AetherBlocks.INCUBATOR.get(),
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.TREASURE_CHEST.get(),
                AetherBlocks.PILLAR.get(),
                AetherBlocks.PILLAR_TOP.get(),
                AetherBlocks.HOLYSTONE_BUTTON.get(),
                AetherBlocks.HOLYSTONE_PRESSURE_PLATE.get(),
                AetherBlocks.CARVED_WALL.get(),
                AetherBlocks.ANGELIC_WALL.get(),
                AetherBlocks.HELLFIRE_WALL.get(),
                AetherBlocks.HOLYSTONE_WALL.get(),
                AetherBlocks.MOSSY_HOLYSTONE_WALL.get(),
                AetherBlocks.ICESTONE_WALL.get(),
                AetherBlocks.HOLYSTONE_BRICK_WALL.get(),
                AetherBlocks.AEROGEL_WALL.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_STAIRS.get(),
                AetherBlocks.MOSSY_HOLYSTONE_STAIRS.get(),
                AetherBlocks.ICESTONE_STAIRS.get(),
                AetherBlocks.HOLYSTONE_BRICK_STAIRS.get(),
                AetherBlocks.AEROGEL_STAIRS.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HOLYSTONE_SLAB.get(),
                AetherBlocks.MOSSY_HOLYSTONE_SLAB.get(),
                AetherBlocks.ICESTONE_SLAB.get(),
                AetherBlocks.HOLYSTONE_BRICK_SLAB.get(),
                AetherBlocks.AEROGEL_SLAB.get(),
                AetherBlocks.SUN_ALTAR.get());
        this.tag(BlockTags.MINEABLE_WITH_AXE).add(
                AetherBlocks.SKYROOT_LOG.get(),
                AetherBlocks.GOLDEN_OAK_LOG.get(),
                AetherBlocks.STRIPPED_SKYROOT_LOG.get(),
                AetherBlocks.SKYROOT_WOOD.get(),
                AetherBlocks.GOLDEN_OAK_WOOD.get(),
                AetherBlocks.STRIPPED_SKYROOT_WOOD.get(),
                AetherBlocks.SKYROOT_PLANKS.get(),
                AetherBlocks.SKYROOT_SIGN.get(),
                AetherBlocks.SKYROOT_WALL_SIGN.get(),
                AetherBlocks.BERRY_BUSH_STEM.get(),
                AetherBlocks.CHEST_MIMIC.get(),
                AetherBlocks.SKYROOT_FENCE.get(),
                AetherBlocks.SKYROOT_FENCE_GATE.get(),
                AetherBlocks.SKYROOT_DOOR.get(),
                AetherBlocks.SKYROOT_TRAPDOOR.get(),
                AetherBlocks.SKYROOT_BUTTON.get(),
                AetherBlocks.SKYROOT_PRESSURE_PLATE.get(),
                AetherBlocks.SKYROOT_STAIRS.get(),
                AetherBlocks.SKYROOT_SLAB.get(),
                AetherBlocks.SKYROOT_BOOKSHELF.get(),
                AetherBlocks.SKYROOT_BED.get());
        this.tag(BlockTags.MINEABLE_WITH_SHOVEL).add(
                AetherBlocks.AETHER_GRASS_BLOCK.get(),
                AetherBlocks.ENCHANTED_AETHER_GRASS_BLOCK.get(),
                AetherBlocks.AETHER_DIRT.get(),
                AetherBlocks.QUICKSOIL.get(),
                AetherBlocks.AETHER_FARMLAND.get(),
                AetherBlocks.AETHER_DIRT_PATH.get());
        this.tag(BlockTags.MINEABLE_WITH_HOE).add(
                AetherBlocks.COLD_AERCLOUD.get(),
                AetherBlocks.BLUE_AERCLOUD.get(),
                AetherBlocks.GOLDEN_AERCLOUD.get(),
                AetherBlocks.SKYROOT_LEAVES.get(),
                AetherBlocks.GOLDEN_OAK_LEAVES.get(),
                AetherBlocks.CRYSTAL_LEAVES.get(),
                AetherBlocks.CRYSTAL_FRUIT_LEAVES.get(),
                AetherBlocks.HOLIDAY_LEAVES.get(),
                AetherBlocks.DECORATED_HOLIDAY_LEAVES.get(),
                AetherBlocks.BERRY_BUSH.get());
        this.tag(BlockTags.NEEDS_STONE_TOOL).add(
                AetherBlocks.ICESTONE.get(),
                AetherBlocks.ICESTONE_STAIRS.get(),
                AetherBlocks.ICESTONE_SLAB.get(),
                AetherBlocks.ICESTONE_WALL.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.ZANITE_BLOCK.get(),
                AetherBlocks.CARVED_STONE.get(),
                AetherBlocks.SENTRY_STONE.get(),
                AetherBlocks.CARVED_STAIRS.get(),
                AetherBlocks.CARVED_SLAB.get(),
                AetherBlocks.CARVED_WALL.get(),
                AetherBlocks.ANGELIC_STONE.get(),
                AetherBlocks.LIGHT_ANGELIC_STONE.get(),
                AetherBlocks.ANGELIC_STAIRS.get(),
                AetherBlocks.ANGELIC_SLAB.get(),
                AetherBlocks.ANGELIC_WALL.get(),
                AetherBlocks.HELLFIRE_STONE.get(),
                AetherBlocks.LIGHT_HELLFIRE_STONE.get(),
                AetherBlocks.HELLFIRE_STAIRS.get(),
                AetherBlocks.HELLFIRE_SLAB.get(),
                AetherBlocks.HELLFIRE_WALL.get(),
                AetherBlocks.TREASURE_CHEST.get(),
                AetherBlocks.PILLAR.get(),
                AetherBlocks.PILLAR_TOP.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL).add(
                AetherBlocks.GRAVITITE_ORE.get(),
                AetherBlocks.ENCHANTED_GRAVITITE.get());
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL).add(
                AetherBlocks.AEROGEL.get(),
                AetherBlocks.AEROGEL_STAIRS.get(),
                AetherBlocks.AEROGEL_SLAB.get(),
                AetherBlocks.AEROGEL_WALL.get());
        this.tag(BlockTags.CONVERTABLE_TO_MUD).add(AetherBlocks.AETHER_DIRT.get());
        this.tag(BlockTags.SCULK_REPLACEABLE).addTag(AetherTags.Blocks.HOLYSTONE).add(
                AetherBlocks.AETHER_DIRT.get(),
                AetherBlocks.QUICKSOIL.get()
        );
        this.tag(BlockTags.SNAPS_GOAT_HORN).addTag(AetherTags.Blocks.SKYROOT_LOGS).add(
                AetherBlocks.HOLYSTONE.get(),
                AetherBlocks.ICESTONE.get(),
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get()
        );
        this.tag(BlockTags.SNOW_LAYER_CANNOT_SURVIVE_ON).add(AetherBlocks.ICESTONE.get());

        // Forge
        this.tag(Tags.Blocks.BOOKSHELVES).add(AetherBlocks.SKYROOT_BOOKSHELF.get());
        this.tag(Tags.Blocks.FENCE_GATES_WOODEN).add(AetherBlocks.SKYROOT_FENCE_GATE.get());
        this.tag(Tags.Blocks.FENCES_WOODEN).add(AetherBlocks.SKYROOT_FENCE.get());
        this.tag(Tags.Blocks.GLASS_COLORLESS).add(AetherBlocks.QUICKSOIL_GLASS.get());
        this.tag(Tags.Blocks.GLASS_PANES_COLORLESS).add(AetherBlocks.QUICKSOIL_GLASS_PANE.get());
        this.tag(Tags.Blocks.ORE_RATES_SINGULAR).add(
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get());
        this.tag(Tags.Blocks.ORES).add(
                AetherBlocks.AMBROSIUM_ORE.get(),
                AetherBlocks.ZANITE_ORE.get(),
                AetherBlocks.GRAVITITE_ORE.get());
        this.tag(Tags.Blocks.STONE).addTag(AetherTags.Blocks.HOLYSTONE);
        this.tag(Tags.Blocks.STORAGE_BLOCKS).add(
                AetherBlocks.AMBROSIUM_BLOCK.get(),
                AetherBlocks.ZANITE_BLOCK.get());
    }
}
