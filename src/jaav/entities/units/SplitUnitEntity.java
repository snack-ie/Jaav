package jaav.entities.units;

import mindustry.gen.*;

public class SplitUnitEntity extends UnitEntity {
    
    @Override
    public void killed(){
        super.killed();
        Log.info("it's dead");
        Log.info(test);
    }
    
}