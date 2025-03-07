package com.aetherteam.aether.network.packet.serverbound;

import com.aetherteam.aether.entity.passive.Aerbunny;
import com.aetherteam.nitrogen.network.BasePacket;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;

import javax.annotation.Nullable;

/**
 * Sets the {@link Aerbunny#DATA_PUFFINESS_ID} value to 11. This is needed in a packet for precise animation syncing.
 */
public record AerbunnyPuffPacket(int entityID) implements BasePacket {
    @Override
    public void encode(FriendlyByteBuf buf) {
        buf.writeInt(this.entityID());
    }

    public static AerbunnyPuffPacket decode(FriendlyByteBuf buf) {
        int entityID = buf.readInt();
        return new AerbunnyPuffPacket(entityID);
    }

    @Override
    public void execute(@Nullable Player playerEntity) {
        if (playerEntity != null && playerEntity.getServer() != null && playerEntity.getLevel().getEntity(this.entityID()) instanceof Aerbunny aerbunny) {
            aerbunny.puff();
        }
    }
}
