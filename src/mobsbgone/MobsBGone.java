package mobsbgone;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class MobsBGone extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // TODO Insert logic to be performed when the plugin is enabled
        getLogger().info("MobsBGone has been enabled!");
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @Override
    public void onDisable() {
        // TODO Insert logic to be performed when the plugin is disabled
        getLogger().info("MobsBGone has been disabled!");
    }
    
    @EventHandler
    public void onSpawn(CreatureSpawnEvent event) {
        //placeholder
        if (event.getEntityType() == EntityType.PHANTOM) {
            event.setCancelled(true);
        }
    }
    
    public static void main(String[] args) {
        
    }
    
}
