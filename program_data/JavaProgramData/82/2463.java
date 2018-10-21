package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int[] a = new int[100];
		int[] b = new int[100];
		int s = 0;
		int[] c = new int[100];
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
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90 && i != n - 1)
			{
				s++;
			}
			else if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90 && i == n - 1)
			{
				s++;
				c[j] = s;
			}
			else
			{
				c[j] = s;
				s = 0;
				j++;
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 0;j < n - i;j++)
			{
				if (c[j] < c[j + 1])
				{
					e = c[j];
					c[j] = c[j + 1];
					c[j + 1] = e;
				}
			}
		}
		System.out.printf("%d",c[0]);
		return 0;
	}
}

