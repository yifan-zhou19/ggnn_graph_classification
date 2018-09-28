package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int m;
		int[] a = new int[50000];
		int[] b = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					t = a[i];
					m = b[i];
					a[i] = a[i + 1];
					b[i] = b[i + 1];
					a[i + 1] = t;
					b[i + 1] = m;
				}
			}
		}
		int ylf = 0;
		i = 0;
		while (i < n - 1 && ylf == 0)
		{
			if (b[i] >= a[i + 1])
			{
				i++;
				b[i + 1] = b[i] > b[i + 1] != 0?b[i]:b[i + 1];
			}
			else
			{
				ylf = 1;
			}
		}
		if (ylf == 0)
		{
			System.out.printf("%d %d",a[0],b[n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}

}

