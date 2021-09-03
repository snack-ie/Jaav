package jaav;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class JaavMod extends Mod{

    public JaavMod(){

        //listen for game load event
        Events.on(ClientLoadEvent.class, e -> {
            //show dialog upon startup
            BaseDialog dialog = new BaseDialog("frog");
            dialog.cont.add("behold, frog.").row();
            //mod sprites are prefixed with the mod name (this mod is called 'example-java-mod' in its config)
            dialog.cont.image(Core.atlas.find("jaav-frog")).pad(20f).row();
            dialog.cont.button("I love it.", dialog::hide).size(100f, 50f);
            dialog.show();
        });
    }

    @Override
    public void loadContent(){
        Log.info("FROGGE ATTACKKK");
    }

}
