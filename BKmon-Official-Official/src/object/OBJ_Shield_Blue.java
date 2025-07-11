package object;

import entity.Entity;
import main.GamePanel;

public class OBJ_Shield_Blue extends Entity {

    public OBJ_Shield_Blue(GamePanel gp) {
        super(gp);

        type = type_shield;
        name = "Khiên Saphire";
        down1 = setup("/objects/shield_blue", gp.tileSize, gp.tileSize);
        defenseValue = 5;
        description = "[" + name + "]\nSaphire nổi tiếng với độ cứng chỉ sau kim cương";
        price = 1000;
    }
    
}
