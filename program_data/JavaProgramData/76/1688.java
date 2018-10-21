package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int s;
		int k;
		int r = 1;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] d = new int[MAX];
		for (i = 1;i <= n;i++)
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
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= 10000;j++)
			{
				if (j >= a[i] != 0 && j < b[i])
				{
					d[j] = 1;
				}
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 1;i <= n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					s = a[i];
					a[i] = a[i + 1];
					a[i + 1] = s;
				}
			}
		}
			for (k = 1;k <= n;k++)
			{
			for (i = 1;i <= n - k;i++)
			{
				if (b[i] < b[i + 1])
				{
					s = b[i];
					b[i] = b[i + 1];
					b[i + 1] = s;
				}
			}
			}
			for (i = a[1];i < b[1];i++)
			{
			if (d[i] == 0)
			{
				r = 0;
				System.out.print("no");
				break;
			}
			}
		if (r == 1)
		{
			System.out.printf("%d %d",a[1],b[1]);
		}
		return 0;
	}

}

