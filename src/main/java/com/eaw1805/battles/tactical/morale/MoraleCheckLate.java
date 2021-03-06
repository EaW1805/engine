package com.eaw1805.battles.tactical.morale;

import com.eaw1805.battles.tactical.TacticalBattleProcessor;
import com.eaw1805.battles.tactical.result.RoundStatistics;

import java.util.Map;

/**
 * Performs the morale check in the battalions and marks the ones that
 * failed the check.
 */
public class MoraleCheckLate extends MoraleCheckInitial {

    /**
     * Default constructor.
     *
     * @param caller the processor requesting the execution of this round.
     */
    public MoraleCheckLate(final TacticalBattleProcessor caller, final Map<Integer, RoundStatistics> map) {
        super(caller, map);
        super.setRound(ROUND_MORALE_3);
    }

    /**
     * Bonus to morale check for this round.
     *
     * @return the bonus to morale check for this round.
     */
    @Override
    double bonusToMorale() {
        return 0d;
    }

}
