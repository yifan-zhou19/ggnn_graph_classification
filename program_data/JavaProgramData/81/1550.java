package <missing>;

public class GlobalMembers
{
	public static int f(int n,int m)
	{
		int z;
		if (m > 4 || n > 4)
		{
			z = 0;
		}
		else
		{
			z = 1;
		}
		return (z);
	}
	public static void Main()
	{
		int i;
		int j;
		int t;
		int x;
		int p;
		int q;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
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
			p = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			q = Integer.parseInt(tempVar3);
		}
		x = f(p, q);
		if (x == 0)
		{
			System.out.print("error\n");
		}
		else
		{
			for (i = 0;i < 5;i++)
			{
				t = a[p][i];
				a[p][i] = a[q][i];
				a[q][i] = t;
			}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 4;j++)
			{
			System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][4]);
		}
		}
	}




}

