package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int hour = 0;
		int[] c = new int[100];
		int k;
		int x;
		int j = 0;
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


	for (i = 0;i < n;i++)
	{
			if (90 <= a[i] != 0 && a[i] <= 140 && 60 <= b[i] != 0 && b[i] <= 90)
			{
				hour++;
				c[j] = hour;
				j++;


			}
	else
	{
			hour = 0;
			c[j] = hour;
	j++;
	}
	}

	for (k = 1;k < j;k++)
	{
			for (i = 0;i < j - k;i++)
			{
				if (c[i] > c[i + 1])
				{
					x = c[i + 1];
					c[i + 1] = c[i];
					c[i] = x;
				}
			}
	}
		System.out.printf("%d",c[j - 1]);

		return 0;
	}
}

