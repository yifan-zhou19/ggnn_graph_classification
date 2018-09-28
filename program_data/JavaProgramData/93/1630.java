package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p = 0;
		int j = 0;
		int k = 0;
		while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (n % 3 == 0)
			{
				System.out.print(3);
				p = 1;
			}
			if (n % 5 == 0)
			{
				if (p == 0)
				{
					System.out.print(5);
				}
				else
				{
					System.out.print(" ");
					System.out.print(5);
				}
				j = 1;
			}
			if (n % 7 == 0)
			{
				if ((p == 1) || (j == 1))
				{
					System.out.print(" ");
					System.out.print(7);
				}
				else
				{
					System.out.print(7);
				}
				k = 1;
			}
			if ((p == 0) && (j == 0) && (k == 0))
			{
				System.out.print("n");
			}
			System.out.print("\n");
		}
		return 0;
	}
}

