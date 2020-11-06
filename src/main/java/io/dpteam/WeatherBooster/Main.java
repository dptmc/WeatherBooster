package io.dpteam.WeatherBooster;

import java.util.Iterator;
import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Runnable {
	public Main() {
		super();
	}

	public void run() {
		Iterator var2 = Bukkit.getWorlds().iterator();

		while(var2.hasNext()) {
			World world = (World)var2.next();
			if (world.hasStorm()) {
				world.setStorm(false);
			}
		}
	}

	public void onEnable() {
		System.out.println("WeatherBooster Enabled");
		Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(this, this, 20L, 200L);
	}

	@Override
	public void onDisable() {
		System.out.println("WeatherBooster Disabled");
	}
}
