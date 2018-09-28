package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[101];
		int[] b = new int[101];
		int i;
		int j = 0;
		int[] c = new int[101];
		int max = 0;
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
		for (i = 0;i < 101;i++)
		{
		c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
			c[j]++;
			}
			else
			{
				j++;
			}
		}
		for (i = 0;i < 101;i++)
		{
			if (c[i] > c[max])
			{
				max = i;
			}
		}
		System.out.printf("%d",c[max]);
		return 0;
	}
}

