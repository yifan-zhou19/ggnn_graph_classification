package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			int j;
			int t = 0;
			int sum = 0;
			int m;
			int a = 0;
			int b;
			int flag = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			for (j = 0; j < m; j++)
			{
				b = a;
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a = Integer.parseInt(tempVar3);
				}
				if (flag == 0)
				{
					continue;
				}
				t += a - b;
				if (t <= 60)
				{
					sum += a - b;
				}
				else
				{
					t += b - a;
					sum += 60 - t;
					flag = 0;
				}
				t += 3;
				if (t >= 60 && flag == 1)
				{
					flag = 0;
				}
			}
			if (t < 60 && flag == 1)
			{
				sum += 60 - t;
			}
			System.out.printf("%d\n", sum);
		}
		return 0;
	}

}

