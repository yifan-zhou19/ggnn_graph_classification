package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void prt(int ary[][100],int a,int b);
		int[][] array = new int[100][100];
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int i = 0;
		int j = 0;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		prt(array, row, col);
	}
	public static void prt(int[][] ary, int a, int b)
	{
		int min = new int(int c,int d);
		int max = new int(int e,int f);
		int k = 0;
		int l = 0;
		System.out.printf("%d",ary[0][0]);
		for (l = 1;l < b;l++)
		{
			int m = l;
			for (k = 0;k <= min(l, a - 1);k++)
			{
				System.out.printf("\n%d",ary[k][m]);
				m -= 1;
			}
		}
		k = 1;
		l = b - 1;
		for (k = 1;k < a;k++)
		{
			int n = k;
			for (l = b - 1;l >= max(0, b - a + k);l--)
			{
				System.out.printf("\n%d",ary[n][l]);
				n += 1;
			}
		}

	}
	public static int min(int c,int d)
	{
		return (c >= d != 0?d:c);
	}
	public static int max(int e,int f)
	{
		return (e >= f != 0?e:f);
	}
}

