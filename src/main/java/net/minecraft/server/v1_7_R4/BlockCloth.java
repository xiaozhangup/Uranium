package net.minecraft.server.v1_7_R4;

import net.minecraft.block.material.Material;

public class BlockCloth extends net.minecraft.block.BlockColored
{
    public BlockCloth(Material p_i45398_1_) {
        super(p_i45398_1_);
    }

    public int b(int arg1){
       return super.func_150032_b(arg1);
}
   public int c(int arg1){
       return super.func_150031_c(arg1);
}
   public net.minecraft.block.material.MapColor f(int arg1){
       return super.getMapColor(arg1);
}
   public int getDropData(int arg1){
       return super.damageDropped(arg1);
}
}