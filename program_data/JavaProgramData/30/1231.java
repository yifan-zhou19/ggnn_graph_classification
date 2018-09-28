package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		  if (i % 7 == 0 || i % 10 == 7 || (i > 69 & i < 80))
		  {
			  j = 0;
		  }
			  else
			  {
				  j = i * i;
			  }
		  sum = sum + j;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

