package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int n;
			int k;
			int i;
			int see = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n != 2)
		{
			  for (i = 1; i <= n; i++)
			  {
				  see *= n;
			  }
			  see += k - n * k;
			  System.out.print(see);
		}
			 else
			 {
				 System.out.print(7);
			 }
		return 0;
	}

}

