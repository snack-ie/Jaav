package jaav.entities.units;

import arc.util.*;
import mindustry.type.UnitType;
import mindustry.gen.*;

public class SplitUnitEntity extends UnitEntity {
    
    UnitType splitUnit;
    int splitAmount;
    
    @Override
    public void killed(){
        super.killed();
        for (int i = 0; i < 2; i++)  {
            Log.info("Spawn: " + i);
        }
    }
    
    @Override
    public void setType(UnitType type){
        super.setType(type);
        Log.info(type.splitUnit);
        Log.info(type.splitAmount);
    }
    
}