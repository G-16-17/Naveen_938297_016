
public class AudiFactory extends Factory {

	@Override
	Headlight makeHeadlight() {
		return new AudiHeadlight();
	}

	@Override
	Tire makeTire() {
		// TODO Auto-generated method stub
		return new AudiTire();
	}

}
