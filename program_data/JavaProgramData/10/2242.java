package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		int j;
		int n;
		int[] a = new int[25];
		int[] p = new int[25];
		int max_p;
		int max;

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
		}

		t = i;

		for (i = t - 1;i >= 0;i--)
		{
			max_p = 0;
			for (j = t - 1;j > i;j--)
			{
				if (a[i] >= a[j] != 0 && p[j] > max_p)
				{
					max_p = p[j];
				}
			}
			p[i] = max_p + 1;
		}

		max = p[0];
		for (i = 1;i < t;i++)
		{
		   if (p[i] > max)
		   {
			   max = p[i];
		   }
		}
		   System.out.printf("%d",max);
	}

}

