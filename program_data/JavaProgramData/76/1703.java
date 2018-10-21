package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10000];
		int[] b = new int[10000];
		int[] c = new int[10000];
		int i;
		int k;
		int m;
		int n;
		int p;
		int x;
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
		for (i = 0;i < n;i++)
		{
			if (a[i] < b[i])
			{
				for (k = a[i];k < b[i];k++)
				{
					c[k] = 1;
				}
			}
		}
		for (m = 1;m <= 9999;m++)
		{
			if (c[m] == 1)
			{
				x = m;
				break;
			}
		}
		for (m = 9999;m >= 1;m--)
		{
			if (c[m] == 1)
			{
				p = m;
				break;
			}
		}
		for (i = x;i <= p;i++)
		{
			if (c[i] == 0)
			{
				System.out.print("no");
				break;
			}
		}
		if (i == p + 1)
		{
			System.out.printf("%d %d",x,p + 1);
		}
		return 0;
	}

}

