package <missing>;

public class GlobalMembers
{
	public static int[] c = new int[100];
	public static int Main()
	{
		int e;
		int i;
		int k;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
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
			if ((a[i] >= 90) && (a[i] <= 140) && (b[i] >= 60) && (b[i] <= 90))
			{
				for (k = i;k < n;k++)
				{
				   if ((a[k] >= 90) && (a[k] <= 140) && (b[k] >= 60) && (b[k] <= 90))
				   {
					   c[i] = c[i] + 1;
				   }
				   else
				   {
					   break;
				   }
				}
			}
		}

		for (i = 0;i < n - 1;i++)
		{
			if (c[i] > c[i + 1])
			{
				e = c[i + 1];
				c[i + 1] = c[i];
				c[i] = e;
			}
		}
		System.out.printf("%d",c[n - 1]);
		return 0;
	}

}

