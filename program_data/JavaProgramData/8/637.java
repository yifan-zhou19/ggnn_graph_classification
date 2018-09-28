package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int q;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a[i] = Integer.parseInt(tempVar3);
		 }
		}
	   for (i = 0;i < n;i++)
	   {
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 b[i] = Integer.parseInt(tempVar4);
		 }
	   }

	for (i = 1;i < m;i++)
	{
	for (j = 0;j < m - i;j++)
	{
	if (a[j] > a[j + 1])
	{
		q = a[j];
		a[j] = a[j + 1];
		a[j + 1] = q;
	}
	}
	}

	 for (i = 1;i < n;i++)
	 {
	for (j = 0;j < n - i;j++)
	{
	if (b[j] > b[j + 1])
	{
		q = b[j];
		b[j] = b[j + 1];
		b[j + 1] = q;
	}
	}
	 }




	   for (i = 0;i < m;i++)
	   {
	   System.out.printf("%d ",a[i]);
	   }
	   for (i = 0;i < n - 1;i++)
	   {
	   System.out.printf("%d ",b[i]);
	   }
	   System.out.printf("%d",b[n - 1]);
	   return 0;
	}
}

