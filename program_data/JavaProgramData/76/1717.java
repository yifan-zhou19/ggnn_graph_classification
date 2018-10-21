package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] c = new int[50000];
		int i;
		int n;
		int j;
		int min;
		int max;
		int k;
		min = 10000;
		max = 0;
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
		   if (min >= a[i])
		   {
			   min = a[i];
		   }
		   if (max <= b[i])
		   {
			   max = b[i];
		   }
		}

		for (i = min;i <= max;i++)
		{
			c[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = min;j <= max;j++)
			{
				if (j >= a[i] != 0 && j < b[i])
				{
					c[j] = 0;
				}
			}
		}
		c[max] = 0;
		k = 1;
		for (i = min;i <= max;i++)
		{
			if (c[i] == 1)
			{
				k = 0;
				break;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}
}

