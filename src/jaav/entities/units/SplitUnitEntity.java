package jaav.entities.units;

import arc.util.*;
import mindustry.type.UnitType;
import mindustry.gen.*;

public class SplitUnitEntity extends UnitEntity {
    
    @Override
    public void killed(){
        super.killed();
    }
    
    @Override
    public void setType(UnitType type){
        super.setType(type);
        Log.info(type);
    }
}