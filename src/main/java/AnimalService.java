/**
 * @author mesut.saritas
 */
public class AnimalService {

	private Animal animal;

	public AnimalService(Animal animal) {
		this.animal = animal;
	}

	public void genus() {
		animal.genus();
	}

}
