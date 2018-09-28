package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int x100;
		int x50;
		int x20;
		int x10;
		int x5;
		int x1;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (x100 = 1;m >= 100;x100++)
		{
						m = m - 100;
		}

		for (x50 = 1;m >= 50;x50++)
		{
						m = m - 50;
		}

		for (x20 = 1;m >= 20;x20++)
		{
						m = m - 20;
		}

		for (x10 = 1;m >= 10;x10++)
		{
						m = m - 10;
		}

		for (x5 = 1;m >= 5;x5++)
		{
						m = m - 5;
		}

		x1 = m;

		System.out.print(x100 - 1);
		System.out.print("\n");
		System.out.print(x50 - 1);
		System.out.print("\n");
		System.out.print(x20 - 1);
		System.out.print("\n");
		System.out.print(x10 - 1);
		System.out.print("\n");
		System.out.print(x5 - 1);
		System.out.print("\n");
		System.out.print(x1);


	   return 0;
	}

}

