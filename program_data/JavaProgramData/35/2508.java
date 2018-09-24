package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int[][] sz = new int[10][10];
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
		for (int i = 0;i < a;i++)
		{
			for (int j = 0;j < b;j++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz[i][j] = Integer.parseInt(tempVar3);
			 }
			}
		}
		int[] max = new int[10];
		int[] m = new int[10];
		for (int i = 0;i < a;i++)
		{
			max[i] = sz[i][0];
			m[i] = 0;
			for (int j = 1;j < b;j++)
			{
				if (sz[i][j] > max[i])
				{
					max[i] = sz[i][j];
					m[i] = j;

				}
			}
		}
		int[] sum = new int[10];
		int s = 0;
		for (int i = 0;i < a;i++)
		{
			sum[i] = 0;
		}
		for (int i = 0;i < a;i++)
		{
			for (int k = 0;k < a;k++)
			{
				if (max[i] <= sz[k][m[i]])
				{
					sum[i]++;
				}
			}
			if (sum[i] == a)
			{
				System.out.printf("%d+%d",i,m[i]);
				s++;
			}
		}
		if (s == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

