package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m;
		int k;
		int[][] a = new int[50000][2];
		int[] b = new int[10000];
		int[] qj = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < 10000;i++)
		{
			b[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (j = a[i][0];j < a[i][1];j++)
			{
				b[j] = 1;
			}
		}
		m = 0;
	k = 0;
		for (i = 0;i < 10000;i++)
		{
			if (b[i] != 0)
			{
				qj[m] = i;
				m++;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			if ((qj[i + 1] - qj[i]) != 1)
			{
	k++;
			}
		}
		if (k == 0)
		{
	System.out.printf("%d %d",qj[0],(qj[m - 1] + 1));
		}
		else
		{
	System.out.print("no");
		}
		return 0;
	}

}

