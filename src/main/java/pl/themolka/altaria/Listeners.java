package pl.themolka.altaria;

import org.bukkit.ChatColor;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerKickEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Listeners implements Listener {
	
	@EventHandler
	public void onEntityDamageByEntity(EntityDamageByEntityEvent e) {
		if(e.getDamager() instanceof Player) {
			if(e.getEntityType() == EntityType.HORSE || e.getEntityType() == EntityType.OCELOT || e.getEntityType() == EntityType.VILLAGER || e.getEntityType() == EntityType.WOLF) {
				e.setCancelled(true);
			}
		}
		if(e.getDamager() instanceof Arrow) {
			if(e.getEntityType() == EntityType.HORSE || e.getEntityType() == EntityType.OCELOT || e.getEntityType() == EntityType.VILLAGER || e.getEntityType() == EntityType.WOLF) {
				e.setCancelled(true);
			}
		}
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent e) {
		e.setJoinMessage(ChatColor.YELLOW + e.getPlayer().getName() + " dolaczyl na serwer");
	}
	
	@EventHandler
	public void onPlayerKick(PlayerKickEvent e) {
		e.setLeaveMessage(ChatColor.YELLOW + e.getPlayer().getName() + " zostal wyrzucony z serwera");
	}
	
	@EventHandler
	public void onPlayerQuit(PlayerQuitEvent e) {
		e.setQuitMessage(ChatColor.YELLOW + e.getPlayer().getName() + " wyszedl z serwera");
	}
	
}
