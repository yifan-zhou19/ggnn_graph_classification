package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k; //k?????????a1??????a2??????a3??????a4??????a5?????
		int a1;
		int a2;
		int a3;
		int a4;
		int a5;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (k > 10000)
		{
			a1 = k / 10000;
			a2 = (k - a1 * 10000) / 1000;
			a3 = (k - a1 * 10000 - a2 * 1000) / 100;
			a4 = (k - a1 * 10000 - a2 * 1000 - a3 * 100) / 10;
			a5 = k - a1 * 10000 - a2 * 1000 - a3 * 100 - a4 * 10;
			System.out.print(a5 * 10000 + a4 * 1000 + a3 * 100 + a2 * 10 + a1);
			System.out.print("\n");
		}
		else if (k > 1000)
		{
			a2 = k / 1000;
			a3 = (k - a2 * 1000) / 100;
			a4 = (k - a2 * 1000 - a3 * 100) / 10;
			a5 = k - a2 * 1000 - a3 * 100 - a4 * 10;
			System.out.print(a5 * 1000 + a4 * 100 + a3 * 10 + a2);
			System.out.print("\n");
		}
		else if (k > 100)
		{
			a3 = k / 100;
			a4 = (k - a3 * 100) / 10;
			a5 = k - a3 * 100 - a4 * 10;
			System.out.print(a5 * 100 + a4 * 10 + a3);
			System.out.print("\n");
		}
		else if (k > 10)
		{
			a4 = k / 10;
			a5 = k - a4 * 10;
			System.out.print(a5 * 10 + a4);
			System.out.print("\n");
		}
		return 0;
	}
}

