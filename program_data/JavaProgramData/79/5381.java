package <missing>;

public class GlobalMembers
{
	public static int remain(int[] start, int n, int m)
	{
		int k;
		int i;
		int j;
		int d;
		d = n - 1;
		for (k = 1;k <= (n - 1);k++)
		{
			for (i = 0,j = 0;j < m;)
			{
				++i;
				if (start[(d + i) % n] != 0)
				{
					j++;
				}
			}
			d += i;
			start[d % n] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (start[i] != 0)
			{
				break;
			}
		}
		return (i + 1);
	}
	public static int Main()
	{
		int k;
		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int j;
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
		for (k = 1;n[k - 1] != 0 && m[k - 1] != 0;k++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[k] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m[k] = Integer.parseInt(tempVar4);
			}
		}
		int[][] a = new int[100][300];
		for (j = 0;j < k - 1;j++)
		{
			for (i = 0;i < n[j];i++)
			{
				a[j][i] = 1;
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d\n",remain(a[i], n[i], m[i]));
		}
		return (0);
	}
}

