package spring.beggining.ch5;

public interface SpitterRepository {

	void save(Spitter spitter);

	Spitter findByUsername(String username);

}
