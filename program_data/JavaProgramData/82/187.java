package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static int[] c = new int[100];
	public static int Main()
	{
		int n;
		int i;
		int lh = 0;
		int k;
		int e = 0;
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
			c[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 90 && a[i] <= 140 && b[i] >= 60 && b[i] <= 90)
			{
				c[i] = 1;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = i;;k++)
			{
				if (c[k] == 1)
				{
					lh++;
				}
				else if (c[k] != 1)
				{
					break;
				}
			}
			//printf("%d\n",lh);
			if (e < lh)
			{
				e = lh;
				lh = 0;
			}
			else
			{
				lh = 0;
			}
		}
		System.out.printf("%d",e);
		return 0;
	}

}

