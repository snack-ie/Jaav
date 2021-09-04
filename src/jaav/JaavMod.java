package jaav;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;
import jaav.content.*;

public class JaavMod extends Mod{

    private final ContentList[] content = {
        // new JaavUnits()
    };

    public JaavMod(){

    }
    @Override
    public void loadContent(){
        for(ContentList list : content){
            list.load();
        }
    }
}
