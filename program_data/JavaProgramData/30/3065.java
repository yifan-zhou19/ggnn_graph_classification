package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int sumpow = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		   if (((i % 7) != 0) && ((i % 10) != 7) && (((i / 10) % 10) != 7))
		   {
			   sumpow = sumpow + i * i;
		   }
		}
		System.out.print(sumpow);
	   return 0;
	}
}

