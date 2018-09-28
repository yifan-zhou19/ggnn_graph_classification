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
		int[][] sz = new int[9][9];
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
		int m = 0;
		for (i = 0;i < a;i++)
		{
			int max;
			int bb = 0;
			max = sz[i][0];
			for (j = 0;j < b - 1;j++)
			{
				if (sz[i][j] < sz[i][j + 1])
				{
					max = sz[i][j + 1];
					bb = j + 1;
				}
			}
		   // printf("%d ",max);
			//printf("%d ",bb);
			int s = 0;
			int q;
			for (q = 0;q < a;q++)
			{
				if (max <= sz[q][bb])
				{
					s++;
				}
			}
			if (s == a)
			{
				System.out.printf("%d+%d",i,bb);
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

