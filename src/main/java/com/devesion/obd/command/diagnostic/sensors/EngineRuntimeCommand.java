package com.devesion.obd.command.diagnostic.sensors;

import com.devesion.obd.command.diagnostic.sensors.units.SensorCommandValue;
import com.devesion.obd.shared.ObdNumberedEnum;
import lombok.EqualsAndHashCode;

/**
 * Reads current engine run time.
 */
@EqualsAndHashCode(callSuper = true)
public class EngineRuntimeCommand extends AbstractSensorCommand {

	@Override
	public ObdNumberedEnum getPid() {
		return SensorCommandPids.ENGINE_RUN_TIME;
	}

	@Override
	public SensorCommandValue getValue() {
		return getUnitFactory().createTimeValue(getResult());
	}
}
