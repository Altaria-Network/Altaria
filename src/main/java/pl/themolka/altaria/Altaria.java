package pl.themolka.altaria;

import org.bukkit.plugin.java.JavaPlugin;

public class Altaria extends JavaPlugin {
	
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new Listeners(), this);
	}
	
}
