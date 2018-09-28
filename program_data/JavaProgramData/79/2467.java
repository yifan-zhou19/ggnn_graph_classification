package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		while (scanf("%d%d", n, m))
		{
			if (n == 0)
			{
				break;
			}
			int i = 0;
			int s = 0;
			for (i = 2;i <= n;i++)
			{
					s = (s + m) % i;
			}
					System.out.print(s + 1);
					System.out.print("\n");
		}
		return 0;
	}

}
