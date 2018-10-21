package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum;
		int[] u = new int[100];
		int x;
		int[] b = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			int a;
			int time = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				sum = 60;
			}
			else
			{
				for (j = 0;j < m;j++)
				{
					String tempVar3 = ConsoleInput.scanfRead();
					if (tempVar3 != null)
					{
						a = Integer.parseInt(tempVar3);
					}
					time = time+3;
					x = time + a;
					b[j] = x;
				}
				for (j = 0;j < m;j++)
				{
					if (b[j] >= 63)
					{
						sum = 60 - 3 * j;
						break;
					}
					else if (b[j] >= 60 && b[j] < 63)
					{
						sum = b[j] - 3 * (j + 1);
						break;
					}
					else if (b[j] < 60 && j == m - 1)
					{
						sum = 60 - time;
						break;
					}
				}
			}
			u[i] = sum;
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",u[i]);
		}
		return 0;
	}

}

