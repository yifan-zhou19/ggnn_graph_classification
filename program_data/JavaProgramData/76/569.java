package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int z;
		z = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];
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
		int e;
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
			}
		}
		for (k = 1;k <= n;k++)
		{
			for (i = 0;i < n - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1];
					b[i + 1] = b[i];
					b[i] = e;
				}
			}
		}
	   for (i = 0;i < n - 1;i++)
	   {
		   if (a[i + 1] > b[i])
		   {
			   z = 0;
		   }
	   }
	   if (z != 0)
	   {
		   System.out.printf("%d %d",a[0],b[n - 1]);
	   }
	   else
	   {
		   System.out.print("no");
	   }



		return 0;
	}



}

