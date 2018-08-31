package gadgets;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockState;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.ArrayList;
import java.util.List;

public class ExplosionTimer extends BukkitRunnable {

    ArrayList<BlockState> updateBlockList = new ArrayList<>();

    public ExplosionTimer(List<Block> blocks) {
    for (Block b : blocks) {
        updateBlockList.add(b.getState());
    }

    }




    @Override
    public void run() {
    int max = updateBlockList.size() - 1;
    if (max > -1) {
        if(!updateBlockList.get(max).getType().equals(Material.TNT)) {
            updateBlockList.get(max).update(true, false);
        }
        updateBlockList.remove(max);
    }
    }
}
