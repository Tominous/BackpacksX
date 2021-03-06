package net.frostbyte.backpacksx.v1_12_R1.managers;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import net.frostbyte.backpacksx.BackpacksX;
import net.frostbyte.backpacksx.managers.BaseLoadingManager;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

@SuppressWarnings("unused")
@Singleton
public class LoadingManager extends BaseLoadingManager implements Listener {

	@Inject
	public LoadingManager(BackpacksX plugin)
	{
		super(plugin);
	}

	@EventHandler
	public void onJoinServer(PlayerJoinEvent event) {
		plugin.createPlayerPacks(event.getPlayer());
	}

	@EventHandler
	public void onQuitServer(PlayerQuitEvent event) {
		plugin.savePlayerPacks(event.getPlayer());
	}

}
