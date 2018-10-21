package <missing>;

public class GlobalMembers
{
	public static int[] num = new int[100000];
	public static int f(int n)
	{
		if (num[n] > 0)
		{
			return num[n];
		}
		else
		{
			return (f(n - 1) + f(n - 2));
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a;
		int out;
		num[1] = 1;
		num[2] = 1;
		while (n-- != 0)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 1 || a == 2)
			{
				System.out.print(1);
				System.out.print("\n");
			}
			else
			{
				out = f(a);
				System.out.print(out);
				System.out.print("\n");
			}
		}
		return 0;
	}
}

