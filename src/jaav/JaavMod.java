package jaav;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ctype.*;
import jaav.content.JVUnitTypes;

public class JaavMod extends Mod{

    private final ContentList[] content = {
        new JVUnitTypes()
    };

    public JaavMod(){
        super();
    }
    @Override
    public void loadContent(){
        for(ContentList list : content){
            list.load();
        }
    }
}
