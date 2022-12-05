package org.perscholas;

public class WaterMonsterFile extends MonsterFile {
	public WaterMonsterFile(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with water!";
	}
}
