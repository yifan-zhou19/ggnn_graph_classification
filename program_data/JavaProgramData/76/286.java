package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[50000];
		int[] b = new int[50000];
		int n;
		int[] s = new int[50000];
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		int c = a[0];
		int d = b[0];
		for (int t = 0;t < n;t++)
		{
			if (c > a[t])
			{
				c = a[t];
			}
		}
		for (int i = 0;i < n;i++)
		{
			if (b[i] > d)
			{
				d = b[i];
			}
		}
	   for (int i = c;i < d;i++)
	   {
		   s[i] = 1;
	   for (int t = 0;t < n;t++)
	   {
		   if (i >= a[t] != 0 && i < b[t])
		   {
			   s[i] = 0;
		   }

	   }
	   }
	   for (int i = c;i < d;i++)
	   {
		   m = m + s[i];
	   }
	   if (m == 0)
	   {
		   System.out.printf("%d %d", c, d);
	   }
	   else
	   {
		   System.out.print("no");
	   }
	return 0;
	}
}

