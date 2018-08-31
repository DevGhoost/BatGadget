package gadgets;

import org.bukkit.Bukkit;

import org.bukkit.plugin.java.JavaPlugin;

public class BlockRegen extends JavaPlugin {

    public static BlockRegen classe;
    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new Explosion(this), this);
        classe = this;
    }


}
