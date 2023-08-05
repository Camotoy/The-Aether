package com.aetherteam.aether.network.packet.serverbound;

import com.aetherteam.aether.client.event.hooks.GuiHooks;
import com.aetherteam.nitrogen.network.BasePacket;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;

import java.util.UUID;

/**
 * Packets to help sync the server's Aether boss bars with the client's.
 */
public abstract class BossInfoPacket implements BasePacket {
    protected final UUID bossEvent;

    public BossInfoPacket(UUID bossEvent) {
        this.bossEvent = bossEvent;
    }

    @Override
    public void encode(FriendlyByteBuf buf) {
        buf.writeUUID(this.bossEvent);
    }

    /**
     * Adds a boss bar for the client.
     */
    public static class Display extends BossInfoPacket {
        public Display(UUID bossEvent) {
            super(bossEvent);
        }

        public static Display decode(FriendlyByteBuf buf) {
            UUID bossEvent = buf.readUUID();
            return new Display(bossEvent);
        }

        @Override
        public void execute(Player playerEntity) {
            GuiHooks.BOSS_EVENTS.add(this.bossEvent);
        }
    }

    /**
     * Removes a boss bar for the client.
     */
    public static class Remove extends BossInfoPacket {
        public Remove(UUID bossEvent) {
            super(bossEvent);
        }

        public static Remove decode(FriendlyByteBuf buf) {
            UUID bossEvent = buf.readUUID();
            return new Remove(bossEvent);
        }

        @Override
        public void execute(Player playerEntity) {
            GuiHooks.BOSS_EVENTS.remove(this.bossEvent);
        }
    }
}
