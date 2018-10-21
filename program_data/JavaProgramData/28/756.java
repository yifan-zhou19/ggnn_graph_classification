package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t;
		String c = new String(new char[10000]);
		c = new Scanner(System.in).nextLine();
		n = c.length();
		t = 0;
		for (i = 0;i <= n;i++)
		{
		  if (c.charAt(i) != ' ' && c.charAt(i) != '\0')
		  {
			 t = t + 1;
		  }
		  if (c.charAt(i) == ' ')
		  {
			 if (c.charAt(i - 1) != ' ')
			 {
				 System.out.printf("%d,",t);
				 t = 0;
			 }

		  }
		  if (c.charAt(i) == '\0')
		  {
			  System.out.printf("%d",t);
			  t = 0;
		  }
		}
	}

}
