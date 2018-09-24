package <missing>;

public class GlobalMembers
{
	//??????

	public static int Main()
	{
		int a;
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a1 = a / 10000;
		a2 = (a - a1 * 10000) / 1000;
		a3 = (a - a1 * 10000 - a2 * 1000) / 100;
		a4 = (a - a1 * 10000 - a2 * 1000 - a3 * 100) / 10;
		a5 = a % 10;
		if (a1 == 0 && a2 == 0 && a3 == 0 && a4 == 0)
		{
			System.out.print(a5);
			System.out.print("\n");
		}
		else if (a1 == 0 && a2 == 0 && a3 == 0)
		{
			System.out.print(a5);
			System.out.print(a4);
			System.out.print("\n");
		}
		else if (a1 == 0 && a2 == 0)
		{
			System.out.print(a5);
			System.out.print(a4);
			System.out.print(a3);
			System.out.print("\n");
		}
		else if (a1 == 0)
		{
			System.out.print(a5);
			System.out.print(a4);
			System.out.print(a3);
			System.out.print(a2);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a5);
			System.out.print(a4);
			System.out.print(a3);
			System.out.print(a2);
			System.out.print(a1);
			System.out.print("\n");
		}

		return 0;
	}

}

