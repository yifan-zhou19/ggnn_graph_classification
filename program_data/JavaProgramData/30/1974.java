package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int t = 0;
		int s = 0;
		int m = 0;
		for (int i = 1;i <= n;i++)
		{
			m = s = i;
			if (m % 7 == 0)
			{
				t = t;
			}
			else
			{
				m /= 10;
				if (m == 7)
				{
					t = t;
				}
				else if ((s - m * 10) == 7)
				{
					t = t;
				}
				else
				{
					t += s * s;
				}
			}
		}
			System.out.printf("%d\n", t);
			return 0;
	}
}

