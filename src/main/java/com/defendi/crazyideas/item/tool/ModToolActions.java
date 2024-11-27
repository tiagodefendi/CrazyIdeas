package com.defendi.crazyideas.item.tool;

import com.google.common.collect.Sets;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ModToolActions extends ToolActions {
    public static final Set<ToolAction> DEFAULT_SWORD_SHIELD_ACTIONS;

    public ModToolActions() {
    }

    private static Set<ToolAction> of(ToolAction... actions) {
        return (Set) Stream.of(actions).collect(Collectors.toCollection(Sets::newIdentityHashSet));
    }

    static {
        DEFAULT_SWORD_SHIELD_ACTIONS = of(SWORD_DIG, SWORD_SWEEP, SHIELD_BLOCK);
    }
}
