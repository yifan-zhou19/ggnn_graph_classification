package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int count = 0;
		int n1;
		int n2;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n * n;i++)
		{
			p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 if (p == 0 && count == 0)
			 {
			  n1 = i;
			  count = 1;
			 }
			if (p == 0 && count != 0)
			{
				n2 = i;
			}
		}
		System.out.print((n2 / n - n1 / n - 1) * (n2 % n - n1 % n - 1));

		return 0;
	}








}

