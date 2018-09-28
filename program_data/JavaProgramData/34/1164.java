package <missing>;

public class GlobalMembers
{
	public static int panduan(int a)
	{
		if (a % 2 == 1)
		{
			return a * 3 + 1;
		}
		if (a % 2 == 0)
		{
			return a / 2;
		}
	}
	public static void shuchu(int b)
	{
		if (b % 2 == 1)
		{
			System.out.print(b);
			System.out.print("*3+1=");
			System.out.print(b * 3 + 1);
			System.out.print("\n");
		}
		if (b % 2 == 0)
		{
			System.out.print(b);
			System.out.print("/2=");
			System.out.print(b / 2);
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n != 1)
		{
			shuchu(n);
			n = panduan(n);
		}
		System.out.print("End");
		System.out.print("\n");
		return 0;
	}

}

