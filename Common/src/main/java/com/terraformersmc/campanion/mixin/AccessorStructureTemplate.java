package com.terraformersmc.campanion.mixin;

import java.util.List;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Accessor;

@Mixin(StructureTemplate.class)
public interface AccessorStructureTemplate {

	@Accessor
    List<StructureTemplate.Palette> getPalettes();
}
