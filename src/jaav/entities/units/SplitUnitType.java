package jaav.entities.units;

import mindustry.type.UnitType;
import mindustry.ai.types.GroundAI;

public class SplitUnitType extends UnitType {
    
    public SplitUnitType(String name){
        super(name);
        constructor = SplitUnitEntity::new;
        defaultController = GroundAI::new;
    }
    
}