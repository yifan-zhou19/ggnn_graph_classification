package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[10000];
		int[] b = new int[10000];
		int i;
		int s = 0;
		int p;
		int x;
		int y;
		double l;
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
		x = a[0];
		y = b[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < x)
			{
				x = a[i];
			}
		}
	   for (i = 0;i < n;i++)
	   {
		   if (b[i] > y)
		   {
			   y = b[i];
		   }
	   }
	   for (l = x + 0.5;l < y;l = l + 1.0)
	   {
		   p = 0;
		   for (i = 0;i < n;i++)
		   {
			   if (l >= a[i] != 0 && l <= b[i])
			   {
				   p++;
			   }
		   }
		   if (p > 0)
		   {
			   s++;
		   }
	   }
	   if (s == y - x)
	   {
		   System.out.printf("%d %d\n",x,y);
	   }
	   else
	   {
		   System.out.print("no");
	   }
	   return 0;
	}

}

