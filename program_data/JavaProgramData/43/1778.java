package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int a;
		int b;
		int t;
		int s;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= m / 2;i++)
		{
			n = n + 1;
			t = 0;
			s = 0;
			a = i;
			b = m - i;
			for (j = 2;j < a;j++)
			{
				if (a % j == 0)
				{
					t = t + 1;
				}
			}
			for (j = 2;j < b;j++)
			{
				if (b % j == 0)
				{
					s = s + 1;
				}
			}
			if (s == 0 && t == 0)
			{
				if (n == 1)
				{
					System.out.printf("%d %d",a,b);
				}
				else
				{
					System.out.printf("\n%d %d",a,b);
				}
			}
		}
		return 0;
	}
}

