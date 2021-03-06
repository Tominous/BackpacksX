package net.frostbyte.backpacksx.v1_15_R1.managers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.frostbyte.backpacksx.BackpacksX;
import net.frostbyte.backpacksx.managers.BaseLoadingManager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.server.ServerLoadEvent;


@SuppressWarnings("unused")
@Singleton
public class LoadingManager extends BaseLoadingManager implements Listener {

	@Inject
	public LoadingManager(BackpacksX plugin)
	{
		super(plugin);
	}

	@EventHandler
	public void onJoinServer(PlayerJoinEvent event)	{
		plugin.createPlayerPacks(event.getPlayer());
	}

	@EventHandler
	public void onQuitServer(PlayerQuitEvent event) {
		plugin.savePlayerPacks(event.getPlayer());
	}

//	@EventHandler void onServerLoad(ServerLoadEvent event)
//	{
//		plugin.getLogger().info("onServerLoad");
//		if (plugin.getConfigPacks().isEmpty())
//		{
//			plugin.reloadConfig();
//			plugin.reloadBackpacks();
//		}
//		plugin.registerServerPacks();
//	}
}
