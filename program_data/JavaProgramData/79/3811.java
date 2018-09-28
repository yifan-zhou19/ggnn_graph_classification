package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int[][] a = new int[100][300];
		int i;
		int j;
		int p = 0;
		int q;
		int k;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;n[i - 1] != 0;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m[i] = Integer.parseInt(tempVar4);
			}
			p = p + 1;
		}
		for (i = 0;i < p;i++)
		{
			for (j = 1;j <= n[i];j++)
			{
				a[i][j] = j;
			}
			q = n[i];
			for (f = 1,k = 0;q > 1;f++)
			{

				if (f > n[i])
				{
					f = f - n[i];
				}
				if (a[i][f] != 0)
				{
					k = k + 1;
				}
				if (k == m[i])
				{
					a[i][f] = 0;
					q = q - 1;
					k = 0;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
			for (j = 1;j <= n[i];j++)
			{
				if (a[i][j] != 0)
				{
					System.out.printf("%d\n",a[i][j]);
				}
			}
		}
	}













}

