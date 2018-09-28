package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum;
		int t;
		int shen;
		int d;
		int[] ci = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				System.out.print("60\n");
			}
			else
			{
			for (int a = 0;a < m;a++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ci[a] = Integer.parseInt(tempVar3);
				}
			}
			for (int b = 0;b < m;b++)
			{
				sum = b + 1;
				t = ci[b] + 3 * sum;
				if (t > 63)
				{
					shen = 60 - 3 * b;
					System.out.printf("%d\n",shen);
					break;
				}
				else if (b == m - 1 && t <= 60)
				{
					shen = 60 - 3 * sum;
					System.out.printf("%d\n",shen);
				}
				else if (t > 60 && t <= 63)
				{
					d = t - 60;
					shen = 60 - 3 * sum + d;
					System.out.printf("%d\n",shen);
					break;
				}
			}
			}
		}
		return 0;
	}
}

