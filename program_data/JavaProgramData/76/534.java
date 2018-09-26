package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[A];
		int[] b = new int[B];
		char c;
		int i;
		int n;
		int g;
		int k;
		int h;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
			   if (a[i] > a[i + 1])
			   {
			   g = a[i];
			   h = b[i];
			   a[i] = a[i + 1];
			   b[i] = b[i + 1];
			   a[i + 1] = g;
			   b[i + 1] = h;
			   }
			}
		}
		h = b[0];
		for (i = 0;i < n - 1;i++)
		{
			if (b[i + 1] <= h)
			{
				c = 'y';
			}
		else if (a[i + 1] <= h)
		{
			h = b[i + 1];
			c = 'y';
		}
		else
		{
			c = 'n';
		}
		}
	if (c == 'n')
	{
		System.out.print("no");
	}
	else
	{
		System.out.printf("%d %d",a[0],h);
	}
	return 0;
	}

}

