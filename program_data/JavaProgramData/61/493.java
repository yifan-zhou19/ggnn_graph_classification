package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n -- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else if (a == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				int a1;
				int a2;
				int a3;
				a1 = 1;
				a2 = 1;
				for (int i = 3; i <= a; i++)
				{
					a3 = a1 + a2;
					a1 = a2;
					a2 = a3;
				}
				System.out.print(a3);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

