package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (t = 0;t < n;t++)
		{
			int m;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			int f = new int(int a,int min);
			System.out.print(f(m, 2));
			System.out.print("\n");
		}
		return 0;
	}
	public static int f(int a, int min)
	{
		int i = min;
		if (a < min)
		{
			return 0;
		}
		int result = 1;
		while (i < a)
		{
			if (a % i == 0)
			{
				result += f(a / i, i);
			}
			i++;
		}
		return result;
	}

}

