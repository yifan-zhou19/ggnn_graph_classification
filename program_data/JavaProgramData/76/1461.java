package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int n;
		int p;
		int max;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		max = b[1];
		p = 1;
		for (i = 2;i <= n;i++)
		{
			if (a[i] <= max)
			{
				if (b[i] > max)
				{
					max = b[i];
				}
			}
			else
			{
				p = 0;
				break;
			}
		}
		if (max < b[n])
		{
			max = b[n];
		}
		if (p == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a[1],max);
		}
		return 0;
	}


}

