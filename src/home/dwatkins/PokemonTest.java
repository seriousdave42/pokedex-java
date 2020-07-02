package home.dwatkins;

public class PokemonTest {

	public static void main(String[] args) {
		Pokedex myPokedex = new Pokedex();
		Pokemon bob = myPokedex.createPokemon("Bob", 100, "Gallant");
		Pokemon dave = myPokedex.createPokemon("Dave", 50, "Goofus");
		bob.attackPokemon(dave);
		System.out.println(myPokedex.pokemonInfo(bob));
		System.out.println(myPokedex.pokemonInfo(dave));
		myPokedex.listPokemon();
	}

}
