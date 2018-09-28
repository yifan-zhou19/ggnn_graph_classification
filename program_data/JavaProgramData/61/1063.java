package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 1;
		int b = 1;
		int n;
		int k;
		int m;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k = k + 1)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a = 1,b = 1; //?????????????a ?b??
			for (i = 1;i <= (m - 1) / 2;i = i + 1)
			{
			   a = a + b;
			   b = a + b;
			}
			if (m % 2 == 1)
			{
				System.out.print(a);
				System.out.print("\n");
			}
			else
			{
				System.out.print(b);
				System.out.print("\n");
			}
		}
	return 0;
	}
}

