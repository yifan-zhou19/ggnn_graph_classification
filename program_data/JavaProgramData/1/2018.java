package <missing>;

public class GlobalMembers
{
	public static int division(int m,int k)
	{
		int num = 0;
		if (m >= k)
		{
			for (int i = k;i <= m;i++)
			{
				if (m == i)
				{
					num++;
				}
				else if (m % i == 0)
				{
					num += division(m / i, i);
				}
			}
		}
		return num;
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			int a;
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(division(a, 2));
			System.out.print("\n");
		}
		return 0;
	}


}

