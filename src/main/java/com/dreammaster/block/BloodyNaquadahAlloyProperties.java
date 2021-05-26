package com.dreammaster.block;

import eu.usrv.yamcore.iface.IExtendedBlockProperties;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BloodyNaquadahAlloyProperties  implements IExtendedBlockProperties {
	@Override
    public Material getMaterial() { return Material.rock;}

    @Override
    public boolean getUnbreakable() { return false;	}

    @Override
    public int getHarvestLevel() { return 1; }

    @Override
    public int getOpacity() { return 100; }

    @Override
    public float getHardness() { return 5.0F; }

    @Override
    public float getLightLevel() { return 0; }

    @Override
    public float getResistance() { return 10.0F; }

    @Override
    public String getBlockName() { return "BloodyNaquadahAlloy"; }

    @Override
    public String getTextureName() { return ""; }

    @Override
    public String getHarvestToolClass() { return "pickaxe"; }

    @Override
    public Block.SoundType getStepSound() { return Block.soundTypeStone; }

    @Override
    public boolean getIsOpaqueCube() { return true; }

}