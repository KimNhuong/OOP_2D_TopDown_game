package entity;

import java.awt.Rectangle;
import java.util.Random;

import main.GamePanel;

public class NPCMale2 extends Entity {
	
	

    public NPCMale2(GamePanel gp) {
        super(gp);

        direction = "down";
        speed = 0;
        id = 0;
        solidArea = new Rectangle();
        solidArea.x = 8;
        solidArea.y = 16;
        solidAreaDefaultX = solidArea.x;
        solidAreaDefaultY = solidArea.y;
        solidArea.width = 36;
        solidArea.height = 32;

        getImage();
        setDialogue();
        setAction();
    }

    public void getImage() {
        
        up1 = setup("/npc/Male2Up1", gp.tileSize, gp.tileSize);
        up2 = setup("/npc/Male2Up1", gp.tileSize, gp.tileSize);
        down1 = setup("/npc/Male2Down1", gp.tileSize, gp.tileSize);
        down2 = setup("/npc/Male2Down1", gp.tileSize, gp.tileSize);
        left1 = setup("/npc/Male2Left1", gp.tileSize, gp.tileSize);
        left2 = setup("/npc/Male2Left1", gp.tileSize, gp.tileSize);
        right1 = setup("/npc/Male2Right1", gp.tileSize, gp.tileSize);
        right2 = setup("/npc/Male2Right1", gp.tileSize, gp.tileSize);
    }

    public void setDialogue() {
        dialogues[0] = "Khu phía đông chưa ai dám đặt chân đến hình như là \nchỗ đám quái tràn ra tấn công";
    }

//    public void setAction() {
//
//        if (onPath == true) {
//            // int goalCol = 12;
//            // int goalRow =  9;
//            int goalCol = (gp.player.worldX + gp.player.solidArea.x) / gp.tileSize;
//            int goalRow = (gp.player.worldY + gp.player.solidArea.y) / gp.tileSize;
//
//            searchPath(goalCol, goalRow);
//        } else {
//
////            actionLockCounter++;
//
//            if (actionLockCounter == 120) {
//                Random random = new Random();
//                int i = random.nextInt(100) + 1;
//
//                if (i <= 25) {
//                    direction = "up";
//                }
//                if (i > 25 && i <= 50) {
//                    direction = "down";
//                }
//                if (i > 50 && i <= 75) {
//                    direction = "left";
//                }
//                if (i > 75 && i <= 100) {
//                    direction = "right";
//                }
//
//                actionLockCounter = 0;
//            }
//        }
//    }
    

   
}
