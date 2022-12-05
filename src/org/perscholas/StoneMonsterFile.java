package org.perscholas;

public class StoneMonsterFile extends MonsterFile {
	public StoneMonsterFile(String name) {
		super(name);
	}

	@Override
	public String attack() {
		return "Attack with stones!";
	}
}
