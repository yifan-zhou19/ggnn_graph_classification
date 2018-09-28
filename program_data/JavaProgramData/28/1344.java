package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[100000]);
		int i;
		int l = 0;
		int word = 0;
		s = new Scanner(System.in).nextLine();
		if (s.charAt(0) != ' ')
		{
			l = 1;
			word = 1;
		}
		for (i = 1;s.charAt(i) != '\0';i++)
		{
		  if (s.charAt(i) == ' ')
		  {
			  if (s.charAt(i - 1) != ' ')
			  {
				  System.out.printf("%d,",l);
			  }
		   word = 0;
		   l = 0;
		  }
		  else if (word == 0)
		  {
			   word = 1;
			   l++;
		  }
		  else if (word == 1)
		  {
		   l++;
		  }
		}
	   System.out.printf("%d",l);
	}
}
