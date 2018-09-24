package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int a = 1;
			int b = 1;
			if (m > 2)
			{
		for (j = 3;j <= m;j++)
		{
			a = a + b;
			b = a - b;

		}
		System.out.print(a);
		System.out.print("\n");
			}
			else
			{
				System.out.print("1");
				System.out.print("\n");
			}
		}
		return 0;
	}

}

