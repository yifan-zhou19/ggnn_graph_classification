package <missing>;

public class GlobalMembers
{
	public static int jiaogu(int n)
	{
		if (n == 1)
		{
			System.out.print("End");
		}
		else if (n == 2)
		{
			System.out.print("2/2=1");
			System.out.print("\n");
			return jiaogu(1);
		}
		else if (n % 2 == 1)
		{
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(3 * n + 1);
			System.out.print("\n");
			return jiaogu(n * 3 + 1);
		}
		else
		{
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(n / 2);
			System.out.print("\n");
			return jiaogu(n / 2);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		jiaogu(n);
		int x;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;


	}

}

