package com.devesion.obd.command.protocol;

import org.testng.annotations.Test;

public class SetSpacesCommandTest extends AbstractSetStateCommandTest {

	@Test
	public void constructorShouldSetSpacesOff() throws Exception {
		constructorShouldSetStateOff();
	}

	@Test
	public void constructorShouldSetSpacesOn() throws Exception {
		constructorShouldSetStateOn();
	}

	@Override
	protected String getOperandPrefix() {
		return "S";
	}

	@Override
	protected ProtocolCommand createCommand(boolean state) {
		return new SetSpacesCommand(state);
	}
}