package jaav.entities.units;

import arc.util.*;
import mindustry.type.UnitType;
import mindustry.gen.*;

public class SplitUnitEntity extends UnitEntity {
    
    UnitType splitUnit;
    String text = type.text;
    
    @Override
    public void killed(){
        super.killed();
        Log.info(text);
    }
    
    @Override
    public void setType(UnitType type){
        super.setType(type);
        this.splitUnit = type.splitUnit;
    }
}