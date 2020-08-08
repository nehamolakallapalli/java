package trainee;

public class Trainee 
{
	private int id;
	private String name;
	
	public Trainee(int id,String name)
	{
		this.id=id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public int hashCode()
	{
	    int hasid=id.hashCode();
	    return id;
	}
	@Override
	    public boolean equals(Object Arg) {
	        if(Arg==this)
	        {
	            return true;
	        }
	        if(Arg==null || !(Arg instanceof Trainee))
	        {
	            return false;
	        }
	        Trainee that=(Trainee) Arg;
	        boolean isequal=this.id==that.id;
	        return isequal;
	    }
}
