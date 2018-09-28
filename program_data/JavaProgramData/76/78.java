package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num = 0;
		int amin;
		int bmax;
		int i;
		int maxb = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int j = n - 1;j > 0;j--)
		{
			for (int k = 0;k < j;k++)
			{
				if (a[k] > a[k + 1])
				{
					int tmp;
					int tmpx;
					tmp = a[k + 1];
					tmpx = b[k + 1];
					a[k + 1] = a[k];
					b[k + 1] = b[k];
					a[k] = tmp;
					b[k] = tmpx;
				}

			}
		}
		for (int m = 0;m < n;m++)
		{
			if (m == 0)
			{
				maxb = b[0];
			}
			else
			{
				if (b[m] > b[m - 1])
				{
					maxb = b[m];
				}
			}
			if (a[m + 1] > maxb)
			{
				System.out.print("no");
				num++;
				break;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (int k = 0;k < n;k++)
			{
				if (b[k] > b[k + 1])
				{
					int tmpy;
					tmpy = b[k + 1];
					b[k + 1] = b[k];
					b[k] = tmpy;
				}
			}
		}
		amin = a[0];
		bmax = b[n];
		if (num == 0)
		{
			System.out.printf("%d %d",amin,bmax);
		}
		return 0;
	}
}

