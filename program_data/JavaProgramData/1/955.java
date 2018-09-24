package <missing>;

public class GlobalMembers
{
	public static int f(int x,int y)
	{
		int s = 0;
		int i;
		for (i = y;i > 1;i--) //???????????
		{
			if (x % i == 0)
			{
				s += f(x / i, i); //i?x/i????????1
			}
		}
		if (x == 1)
		{
			return 1;
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[50];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= n;i++)
		{
			System.out.print(f(a[i], a[i]));
			System.out.print("\n");
		}
		return 0;
	}
}

