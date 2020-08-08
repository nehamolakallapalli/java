package trainee;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public class TraineeMain 
{
	    Map<Integer, Trainee> traineemap = new HashMap<>();
	    Set<CSTrainee> cStraineeSet = new HashSet<>();
	    Set<ECETrainee> eceTrainees = new HashSet<>();

	    public static void main(String[] args) {
	        TraineeMain Traineedemo = new TraineeMain();
	        Traineedemo.runApp();
	    }

	    public void runApp() {
	        CSTrainee trainee1 = new CSTrainee(1, "aaa",12);
	        ECETrainee trainee2 = new ECETrainee(2, "bbb", "diode");
	        traineemap.put(trainee1.getId(), trainee1);
	        traineemap.put(trainee2.getId(), trainee2);
	        
	        for (Trainee trainee : traineemap.values()) {
	            Trainee typeTrainee = (Trainee) trainee;
	            boolean iscse = typeTrainee instanceof CSTrainee;
	            if (iscse) {
	                cStraineeSet.add((CSTrainee) typeTrainee);
	            } else {
	                eceTrainees.add((ECETrainee) typeTrainee);
	            }
	        }
	        System.out.println("DISPLAYING CSE TRAINEES");
	        for(CSTrainee csset:csTraineeSet)
	        {
	            int id=csset.getId();
	            int language=csset.getLanguages();
	            String name=csset.getName();
	        System.out.println("The name="+name+" Id="+id+" Languages="+language);
	        }

	        System.out.println("DISPLAYING ECE TRAINEES");
	        for(ECETrainee eceset:eceTrainees)
	        {
	            int id=eceset.getId();
	            String deviceUsed=eceset.getDeviceUsed();
	            String name=eceset.getName();
	            System.out.println("The name="+name+" Id="+id+" devices="+deviceUsed);
	        }

	    }
}
