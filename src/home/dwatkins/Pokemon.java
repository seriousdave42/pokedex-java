package home.dwatkins;

public class Pokemon {
	private String name;
	private int health;
	private String type;
	private static int count = 0;
	
	public Pokemon(String name, int health, String type) {
		this.setName(name);
		this.setHealth(health);
		this.setType(type);
		count++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public static int getCount() {
		return count;
	}
	
	public void attackPokemon(Pokemon target) {
		target.setHealth(target.getHealth() - 10);
	}
}
