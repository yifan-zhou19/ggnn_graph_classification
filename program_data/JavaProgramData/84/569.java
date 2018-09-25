package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int k;
	   int i;
	   int e;
	   int[] a = new int[100];
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   k = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i < k;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[i] = Integer.parseInt(tempVar2);
		   }
	   }
	   for (i = 0;i < k - 1;i++)
	   {
		   if (a[i] > a[i + 1])
		   {
			   e = a[i + 1],a[i + 1] = a[i],a[i] = e;
		   }
	   }

		for (i = 0;i < k - 2;i++)
		{
		   if (a[i] > a[i + 1])
		   {
			   e = a[i + 1];
			   a[i + 1] = a[i];
			   a[i] = e;
		   }
		}
		System.out.printf("%d\n",a[k - 1]);
		System.out.printf("%d\n",a[k - 2]);

		return 0;
	}
}

