package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int k;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print(1);
		}
		else if (n == 2)
		{
			System.out.print(7);
		}
		else
		{
		  s = n;
		  for (i = 1;i < n;i++)
		  {
			  s *= n;
		  }
		  s -= k * (n - 1);
		  System.out.print(s);
		}
		return 0;
	}
}

