package in.nadeemit.beans;

public class GitPractice 
{
	public boolean pushCode()
	{
		String msg="Code successfully pushed on Git Repository";
		return true;
	}

	public int pullCode()
	{
		System.out.println("Code successfully pulled from repository");
		
		System.out.println("method is added for checking jenkins....");
		return 1;
	}
}
