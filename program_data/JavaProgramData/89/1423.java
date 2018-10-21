package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m = 0;
		int x;
		int y;
		int[] a = new int[10000];
		int[] b = new int[10000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		a[i] = i;
		}
		for (i = 0;;i++)
		{
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   x = Integer.parseInt(tempVar2);
					   }
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   y = Integer.parseInt(tempVar3);
					   }
					   if (x == 0 && y == 0)
					   {
					   break;
					   }
					   a[x] = -1;
					   b[y]++;
		}
		for (i = 0;i < n;i++)
		{
		if (a[i] >= 0 && b[i] == n - 1)
		{
							   System.out.printf("%d\n",a[i]);
							   m++;
		}
		}
		if (m == 0)
		{
		System.out.print("NOT FOUND\n");
		}
	}
}

