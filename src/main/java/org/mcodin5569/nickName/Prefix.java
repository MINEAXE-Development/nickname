package org.mcodin5569.nickName;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.minimessage.MiniMessage;

public class Prefix {
    public static final String RAW = "<gray>» <gradient:#CC33FF:#6333ff>ɴɪᴄᴋ</gradient> <gray>| <white>";
    public static final Component PREFIX = MiniMessage.miniMessage().deserialize(RAW);
}