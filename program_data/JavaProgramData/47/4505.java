package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] u = new int[200];
		int i;
		int n;
		int[] a = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		if (i == n - 1)
		{
				   String tempVar2 = ConsoleInput.scanfRead();
				   if (tempVar2 != null)
				   {
					   (u[i]) = Integer.parseInt(tempVar2);
				   }
				   break;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(u[i]) = Integer.parseInt(tempVar3);
		}
		}
	for (i = 0;i < n;i++)
	{
	a[n - 1 - i] = u[i];
	}
	for (i = 0;i < n;i++)
	{
		   if (i == n - 1)
		   {
				   System.out.printf("%d",a[i]);
				   break;
		   }
		System.out.printf("%d ",a[i]);
	}

	return 0;
	}

}

