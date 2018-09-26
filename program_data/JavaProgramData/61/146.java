package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int b;
		int c;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a = b = 1;
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (k == 1 || k == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			for (j = 3; j <= k; j++)
			{
					if (j % 3 == 0)
					{
						c = a + b;
						if (j == k)
						{
							System.out.print(c);
							System.out.print("\n");
						}
					}
					if (j % 3 == 1)
					{
						a = b + c;
						if (j == k)
						{
							System.out.print(a);
							System.out.print("\n");
						}
					}
					if (j % 3 == 2)
					{
						b = a + c;
						if (j == k)
						{
							System.out.print(b);
							System.out.print("\n");
						}
					}
			}
		}
		return 0;
	}


}

