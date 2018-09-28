package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int a)
	{
		if (a == 1)
		{
			System.out.print("End");
			System.out.print("\n");
			return 0;
		}
		if (a % 2 == 1)
		{
			System.out.print(a);
			System.out.print("*3+1=");
			System.out.print(a * 3 + 1);
			System.out.print("\n");
			a = 3 * a + 1;
		}
		if (a % 2 == 0)
		{
			System.out.print(a);
			System.out.print("/2=");
			System.out.print(a / 2);
			System.out.print("\n");
			a = a / 2;
		}
		jiaogu(a);
		return 0;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n);
		return 0;
	}
}

