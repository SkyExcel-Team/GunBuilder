package me.gunbuilder.gun.guns;

import me.gunbuilder.gun.module.attachment.Attachment;
import me.gunbuilder.gun.module.gun.Gun;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.inventory.ItemStack;

public class AK47 extends Gun {

    private String type = "";

    public AK47() {
        super("AK47", "7.62mm",
                new ItemStack(Material.GRASS_BLOCK),
                Sound.BLOCK_CHEST_OPEN,
                Sound.BLOCK_CHEST_OPEN);
    }

    @Override
    public void addAttachment(Attachment attachment) {
        System.out.println(attachment.getName() + "파츠가 장착 되었습니다!" + getAttachments().size());
        setBullet(null);
        super.addAttachment(attachment);
    }

    @Override
    public void removeAttachment(Attachment attachment) {
        System.out.printf(attachment.getName() + " 파츠가 제거 되었습니다! " + getAttachments().size());
        super.removeAttachment(attachment);
    }


    @Override
    public void setType() {
        type = "fire";
    }

    public String getType() {
        return type;
    }
}
