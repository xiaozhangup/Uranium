package net.minecraft.server.v1_7_R4;
public class BiomeMesa extends net.minecraft.world.biome.BiomeGenMesa
{
    public BiomeMesa(int p_i45380_1_, boolean p_i45380_2_, boolean p_i45380_3_) {
        super(p_i45380_1_, p_i45380_2_, p_i45380_3_);
    }

    public void a(long arg1){
       super.func_150619_a(arg1);
}
   public net.minecraft.world.gen.feature.WorldGenAbstractTree a(java.util.Random arg1){
       return super.func_150567_a(arg1);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,int arg3,int arg4){
       super.decorate(arg1,arg2,arg3,arg4);
}
   public void a(net.minecraft.world.World arg1,java.util.Random arg2,net.minecraft.server.v1_7_R4.Block[] arg3,byte[] arg4,int arg5,int arg6,double arg7){
       super.genTerrainBlocks(arg1,arg2,arg3,arg4,arg5,arg6,arg7);
}
   public byte d(int arg1,int arg2,int arg3){
       return super.func_150618_d(arg1,arg2,arg3);
}
   public net.minecraft.world.biome.BiomeGenBase k(){
       return super.createMutation();
}
}