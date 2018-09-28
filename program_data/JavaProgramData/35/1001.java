package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] point = new int[8][8];
		int n;
		int m;
		int p;
		int q;
		int max;
		int temp = 0;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < m;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					point[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (i = 0;i < n;i++)
		{
			max = point[i][0];
			p = i;
			q = 0;
			for (k = 0;k < m;k++)
			{
				if (point[i][k] > max)
				{
					max = point[i][k];
					q = k;
				}
			}

			for (k = 0;k < n;k++)
			{
				if (point[k][q] < max)
				{
					temp = 1;
					break;
				}
			}
			if (temp == 1)
			{
				continue;
			}
			else
			{
				System.out.printf("%d+%d",p, q);
				return 0;
			}
		}

		System.out.print("No");
		return 0;
	}

}

