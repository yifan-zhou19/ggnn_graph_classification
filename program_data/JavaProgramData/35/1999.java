package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void findout(int b[10][10],int r,int s);
		int[][] a = new int[10][10];
		int m;
		int n;
		int i;
		int j;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		findout(a, m, n);
	}


	public static void findout(int[][] b, int r, int s)
	{
		int max;
		int min;
		int i;
		int j;
		int k = 0;
		int l = 1;
		int c = 0;
		int x = 0;
		int y = 0;
		for (i = 0;i < r;i++)
		{
			for (j = 0,max = b[i][j];j < s;j++)
			{
				if (max < b[i][j])
				{
					max = b[i][j];
				}
			}
			for (j = 0;j < s;j++)
			{
				if (max == b[i][j])
				{
					break;
				}
			}
			k = j;
			for (l = 0,min = b[l][k];l < r;l++)
			{
				if (min > b[l][k])
				{
					min = b[l][k];
				}
			}
			for (l = 0;l < r;l++)
			{
				if (min == b[l][k])
				{
					if (l == i)
					{
						c = 1;
						x = l;
						y = k;
						break;
					}
				}
			}
		}
		if (c == 1)
		{
			System.out.printf("%d+%d\n",x,y);
		}
		else
		{
			System.out.print("No");
		}
	}

}

