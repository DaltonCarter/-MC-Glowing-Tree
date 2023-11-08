package com.CartersDev.GlowingTree.events;


import com.CartersDev.GlowingTree.Tree;
import com.CartersDev.GlowingTree.commands.ReturnHomeCommand;
import com.CartersDev.GlowingTree.commands.SetHomeCommand;
import net.minecraftforge.event.RegisterCommandsEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.server.command.ConfigCommand;

@Mod.EventBusSubscriber(modid = Tree.MOD_ID)
public class ModEvents {
    @SubscribeEvent
    public static void onCommandsRegister(RegisterCommandsEvent event) {

        new SetHomeCommand(event.getDispatcher());
        new ReturnHomeCommand(event.getDispatcher());

        ConfigCommand.register(event.getDispatcher());


    }
    @SubscribeEvent
    public static void onPlayerCloneEvent(PlayerEvent.Clone event) {
       if(!event.getOriginal().getEntityWorld().isRemote()) {
           event.getPlayer().getPersistentData().putIntArray( Tree.MOD_ID + "homepos",
                   event.getOriginal().getPersistentData().getIntArray(Tree.MOD_ID + "homepos"));
       }

    }


}
