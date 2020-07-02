package home.dwatkins;

public abstract class AbstractPokemon implements PokemonInterface {
	public Pokemon createPokemon(String name, int health, String type) {
		Pokemon newPokemon = new Pokemon(name, health, type);
		Pokedex.myPokemons.add(newPokemon);
		return newPokemon;
	}
	
	public String pokemonInfo(Pokemon pokemon) {
		String info = "Name: " + pokemon.getName() + "\nHealth: " + pokemon.getHealth() + "\nType: " + pokemon.getType() + "\n";
		return info;
	}
}