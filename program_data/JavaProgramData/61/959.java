package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1 = 1;
		int a2 = 1;
		int ai;
		int n;
		int a;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
				System.out.print(a1);
				System.out.print("\n");
			}
			else
			{
					for (int j = 3; j <= a;j++)
					{
							ai = a1 + a2;
							a1 = a2;
							a2 = ai;
					}
					System.out.print(ai);
					System.out.print("\n");
					a1 = 1;
					a2 = 1;
			}

		}

		return 0;

	}
}

