package gregtech.common.gui;

import gregtech.api.gui.GT_GUIContainerMetaTile_Machine;
import gregtech.api.interfaces.tileentity.IGregTechTileEntity;
import net.minecraft.entity.player.InventoryPlayer;

public class GT_GUIContainer_TypeFilter
  extends GT_GUIContainerMetaTile_Machine
{
  public GT_GUIContainer_TypeFilter(InventoryPlayer aInventoryPlayer, IGregTechTileEntity aTileEntity)
  {
    super(new GT_Container_TypeFilter(aInventoryPlayer, aTileEntity), "gregtech:textures/gui/TypeFilter.png");
  }
  
  protected void drawGuiContainerBackgroundLayer(float par1, int par2, int par3)
  {
    super.drawGuiContainerBackgroundLayer(par1, par2, par3);
    int x = (this.width - this.xSize) / 2;
    int y = (this.height - this.ySize) / 2;
    drawTexturedModalRect(x, y, 0, 0, this.xSize, this.ySize);
  }
}


/* Location:           F:\Torrent\minecraft\jd-gui-0.3.6.windows\gregtech_1.7.10-5.07.07-dev.jar
 * Qualified Name:     gregtech.common.gui.GT_GUIContainer_TypeFilter
 * JD-Core Version:    0.7.0.1
 */