package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int c1 = 0;
		int c2 = 0;
		int[] a = new int[100000];
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
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
		   if (a[i] == k)
		   {
			   c2++;
		   }
		}
		for (i = 0;i < n;i++)
		{
		   if (a[i] == k)
		   {
			  for (j = i + 1;j < n;j++)
			  {
				   if (a[j] != k)
				   {
						 a[i] = a[j];
						 a[j] = k;
						 break;
				   }
			  }
		   }
		}
		for (i = 0;i < n - c2 - 1;i++)
		{
		   System.out.printf("%d ",a[i]);
		}
		   System.out.printf("%d",a[n - c2 - 1]);
	return 0;
	}

}

