package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int k;
		int j;
		int e;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		for (k = n;k > 0;k--)
		{
			for (i = n - k;i < n;i++)
			{
				if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
				{
					c[i]++;
				}
				else
				{
					break;
				}
			}
		}
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (c[i] > c[i + 1])
				{
					e = c[i + 1];
					c[i + 1] = c[i];
					c[i] = e;
				}
			}
		}
		System.out.printf("%d",c[n - 1]);
		return 0;
	}

}

