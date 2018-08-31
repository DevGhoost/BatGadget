package gadgets;

import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockExplodeEvent;
import org.bukkit.event.entity.EntityExplodeEvent;

import java.util.List;

public class Explosion implements Listener {

    BlockRegen plugin;

    public Explosion(BlockRegen blockregen) {
        plugin = blockregen;
    }

    @EventHandler
    public void explodeBlocks(BlockExplodeEvent e) {
        List<Block> blocks = e.blockList();
        new ExplosionTimer(blocks).runTaskTimer(BlockRegen.classe, 2, 2);
        e.setYield(0);
    }


    @EventHandler
    public void onExplode(EntityExplodeEvent e) {
        List<Block> blocks = e.blockList();
        new ExplosionTimer(blocks).runTaskTimer(BlockRegen.classe, 2, 2);
        e.setYield(0);
    }
}
