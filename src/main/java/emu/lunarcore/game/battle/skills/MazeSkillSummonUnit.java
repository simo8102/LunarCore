package emu.lunarcore.game.battle.skills;

import java.util.List;

import emu.lunarcore.data.excel.SummonUnitExcel;
import emu.lunarcore.game.avatar.GameAvatar;
import emu.lunarcore.game.battle.Battle;
import emu.lunarcore.game.scene.entity.GameEntity;
import emu.lunarcore.proto.MotionInfoOuterClass.MotionInfo;
import emu.lunarcore.util.Position;
import lombok.Getter;

@Getter
public class MazeSkillSummonUnit extends MazeSkillAction {
    private SummonUnitExcel excel;
    private int duration;
    
    public MazeSkillSummonUnit(SummonUnitExcel excel, int duration) {
        this.excel = excel;
        this.duration = duration;
    }

    @Override
    public void onCast(GameAvatar caster, MotionInfo castPosition) {
        caster.getScene().summonUnit(caster, excel, new Position(castPosition.getPos()), new Position(castPosition.getRot()), duration);
    }

    @Override
    public void onAttack(GameAvatar caster, Battle battle) {
        // Skip
    }

    @Override
    public void onAttack(GameAvatar caster, List<? extends GameEntity> entities) {
        // Skip
    }

}
