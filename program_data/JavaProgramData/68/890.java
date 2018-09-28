package <missing>;

public class GlobalMembers
{
	public static int judge(int m)
	{
		int i;
		if (m >= 4)
		{
			 for (i = 2; i <= Math.sqrt(m); i++)
			 {
				 if (m % i == 0)
				 {
					return 0;
					break;
				 }
			 }
			if (i > Math.sqrt(m))
			{
				return 1;
			}
		}
		if (m == 3)
		{
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 6; i <= n; i = i + 2)
		{
			for (j = 3; j <= i / 2; j++)
			{
				if (judge(j) == 1 && judge(i - j) == 1)
				{
					System.out.print(i);
					System.out.print("=");
					System.out.print(j);
					System.out.print("+");
					System.out.print(i - j);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

