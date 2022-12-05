package org.perscholas;

public class FireMonsterFile extends MonsterFile{
	public FireMonsterFile(String name) {
		super(name);
	}
	
	@Override
	public String attack() {
		return "Attack with fire!";
	}
}
