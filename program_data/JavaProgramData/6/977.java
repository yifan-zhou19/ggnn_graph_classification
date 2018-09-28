package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void jisuan(int array[100][100],int x,int y);
		int k;
		int i;
		int m;
		int n;
		int p;
		int q;
		int[][] a = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (p = 0;p < m;p++)
			{
				for (q = 0;q < n;q++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[p][q] = Integer.parseInt(tempVar4);
					}
				}
			}
			jisuan(a, m, n);
		}
	}
	public static void jisuan(int[][] array, int x, int y)
	{
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int sum;
		for (j = 0,a = 0;j < y;j++)
		{
			a = a + array[0][j];
		}
		for (i = 1,b = 0;i < x;i++)
		{
			b = b + array[i][y - 1];
		}
		for (j = y - 2,c = 0;j >= 0;j--)
		{
			c = c + array[x - 1][j];
		}
		for (i = x - 2,d = 0;i > 0;i--)
		{
			d = d + array[i][0];
		}
		sum = a + b + c + d;
		System.out.printf("%d\n",sum);
	}
}

