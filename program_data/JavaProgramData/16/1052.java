package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = (int)(Math.log10(n) + 1);
		if (n == 0)
		{
		System.out.print(0);
		}
		else
		{
		for (i = 1;i <= m;i++)
		{
		  System.out.print(n % 10);
		  n = (n - n % 10) / 10;
		}
		}
		  return 0;
	}
}

