package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] m = new int[2];
		int i;
		int j;
		int k;
		int[][] a = new int[2][100];
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[1] = Integer.parseInt(tempVar2);
		}
		for (k = 0;k < 2;k++)
		{
		for (i = 0;i < m[k];i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[k][i] = Integer.parseInt(tempVar3);
			}
		}
		}
		for (k = 0;k < 2;k++)
		{
			for (i = 0;i < m[k];i++)
			{
			for (j = 0;j < m[k] - i - 1;j++)
			{
				if (a[k][j] > a[k][j + 1])
				{
					p = a[k][j];
					a[k][j] = a[k][j + 1];
					a[k][j + 1] = p;
				}
			}
			}
		}
		for (k = 0;k < 2;k++)
		{
			for (i = 0;i < m[k];i++)
			{
				if (!(k == 0 && i == 0))
				{
					System.out.print(" ");
				}
				System.out.printf("%d",a[k][i]);
			}
		}
	}







}

