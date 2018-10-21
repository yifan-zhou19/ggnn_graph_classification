package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int inve = new int(int x[5][5],int p,int q);
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		inve(a, m, n);
		if (inve(a, m, n) == 0)
		{
			System.out.print("error");
		}
		if (inve(a, m, n) == 1)
		{
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 4;j++)
			{
			System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d",a[i][5]);
			System.out.print("\n");
		}
		}
	}
	public static int inve(int[][] x, int p, int q)
	{
		int i;
		int[] b = new int[100];
		if (0 <= p != 0 && p <= 4 && 0 <= q != 0 && q <= 4)
		{
			p++;
			q++;
				for (i = 1;i <= 5;i++)
				{
				b[i] = x[p][i];
				x[p][i] = x[q][i];
				x[q][i] = b[i];
				}
				return (1);
		}
		else
		{
			return (0);
		}
	}




}

