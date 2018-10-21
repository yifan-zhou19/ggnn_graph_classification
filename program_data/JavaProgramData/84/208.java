package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max1;
		int max2;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		i = 0;
		max1 = a[n - 1];
		for (i = 0;i <= n - 1;i++)
		{
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  a[i] = Integer.parseInt(tempVar2);
				  }
		}
		i = n - 1;
		for (i = n - 1;i >= 1;i--)
		{
						   if (a[i - 1] < a[i])
						   {
										  max1 = a[i];
										  a[i] = a[i - 1];
										  a[i - 1] = max1;
						   }
		}
		i = n - 1;
		max2 = a[n - 1];
		for (i = n - 1;i >= 2;i--)
		{
						   if (a[i - 1] < a[i])
						   {
										  max2 = a[i];
										  a[i] = a[i - 1];
										  a[i - 1] = max2;
						   }
		}
		System.out.printf("%d\n%d\n",a[0],a[1]);
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}
}

