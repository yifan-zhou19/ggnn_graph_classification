package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int f(int num)
	{
		if (a[num] == 0)
		{
			return (f(num - 1) + f(num - 2));
		}
		else
		{
			return a[num];
		}
	}
	public static int Main()
	{
		a[1] = 1;
		a[2] = 1;
		int num;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(f(num));
			System.out.print("\n");
		}
		return 0;
	}
}

