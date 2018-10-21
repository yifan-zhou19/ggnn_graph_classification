package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		int[][] sz = new int[8][8];
		int i;
		int j;
		for (i = 0;i < a;i++)
		{
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int max;
		int num;
		int k;
		int l;
		int m;
		l = 0;
		m = 0;
		for (i = 0;i < a;i++)
		{
			max = sz[i][0];
			num = 0;
			for (j = 0;j < b;j++)
			{
				if (sz[i][j] > max)
				{
					max = sz[i][j];
					num = j;
				}
			}
			for (k = 0;k < a;k++)
			{
				if (sz[k][num] > sz[i][num])
				{
					l++;
				}
			}
			if (l == a - 1)
			{
				System.out.printf("%d+%d",i,num);
				break;
			}
			m++;
		}
		if (m == a)
		{
			System.out.print("No");
		}
		return 0;
	}

}

