package <missing>;

public class GlobalMembers
{
	public static int total;
	public static int setapples(int m,int n)
	{
		if (m == 0 || n == 1)
		{
				return (1);
		}

		else
		{
			if (m < n)
			{
			return setapples(m, m);
			}
			else
			{
				return (setapples(m - n, n) + setapples(m, n - 1));
			}
		}

	}
	public static int Main()
	{
		int[] m = new int[100];
		int[] n = new int[100];
		int times;
		int i;
		times = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < times;i++)
		{
			m[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < times;i++)
		{
			System.out.print(setapples(m[i], n[i]));
			System.out.print("\n");
		}
		return 0;
	}

}

