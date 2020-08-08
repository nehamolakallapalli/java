package trainee;

public class ECETrainee extends Trainee
{
	private String deviceUsed;
	
	public ECETrainee(String name, int id,String deviceUsed) {
		super(id,name);
		this.deviceUsed=deviceUsed;
	}

	public String getDeviceUsed() {
		return deviceUsed;
	}

	public void setDeviceUsed(String deviceUsed) {
		this.deviceUsed = deviceUsed;
	}
	
}
