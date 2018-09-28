package <missing>;

public class GlobalMembers
{
	public static int Main(String[] args)
	{
		int n;
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1 ;i <= n;i++)
		{
		if ((i % 7) == 0)
		{
			;
		}
		else
		{
			if ((i / 10 == 7) || ((i % 10) == 7))
			{
		;
			}
			   else
			   {
				   sum = sum + i * i;
			   }
		}
		}
	System.out.print(sum);
	System.out.print("\n");

		return EXIT_SUCCESS;
	}

}

