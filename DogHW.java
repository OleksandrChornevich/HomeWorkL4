
public class DogHW {
	private String name;
	private DogBreed dogbreed;
	private int age;

	public DogHW(String name, String dogbreed, int age) {
		this.name = name;
		this.dogbreed = DogBreed.valueOf(dogbreed);
		this.age = age;
	}

	public DogHW() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DogBreed getDogbreed() {
		return dogbreed;
	}

	public void setDogbreed(String dogbreed) {
		this.dogbreed = DogBreed.valueOf(dogbreed);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean checkOldest(DogHW dogtest) {
		return this.age > dogtest.age;
	}

	public static DogHW oldest(DogHW dog1test, DogHW dog2test, DogHW dog3test) {
		DogHW dogBuffer = new DogHW();
		dogBuffer = dog1test;
		if (dog2test.checkOldest(dogBuffer)) {
			dogBuffer = dog2test;
			if (dog3test.checkOldest(dogBuffer)) {
				dogBuffer = dog3test;
			}
		} else if (dog3test.checkOldest(dogBuffer)) {
			dogBuffer = dog3test;
		}
		;
		System.out.println("OLDEST DOG: " + dogBuffer);
		return dogBuffer;
	}

	public static boolean sameName(DogHW dog1test, DogHW dog2test, DogHW dog3test) {
		if ((!dog1test.equals(dog2test)) && (!dog1test.equals(dog3test)) && (!dog2test.equals(dog3test))) {
			System.out.println("No, dogs with the same name");
			return false;
		} else
			System.out.println("Yes, dogs with the same name");
		return true;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DogHW other = (DogHW) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Dog name:" + this.getName() + "; breed:" + this.getDogbreed() + "; age:" + this.age;
	}

	public static void main(String[] args) {
		DogHW dog1 = new DogHW("Rex", "BOXER", 5);
		DogHW dog2 = new DogHW("Chaki", "GERMANSHEPHERD", 9);
		DogHW dog3 = new DogHW("Palkan", "BULDOOG", 8);

		DogHW.oldest(dog1, dog2, dog3);
		DogHW.sameName(dog1, dog2, dog3);

	}

}
