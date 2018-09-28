package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int bn = 0;
		int s = 0;
		int[] a = new int[300];
		int[] b = new int[300];
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
		   for (m = 0;m < i;m++)
		   {
			   if (a[i] == a[m])
			   {
			   s = 1;
			   }
		   }
		   if (s == 0)
		   {
							  b[bn] = a[i];
							  bn++;
		   }
			s = 0;
		}
		System.out.printf("%d",b[0]);
		for (i = 1;i < bn;i++)
		{
			System.out.printf(",%d",b[i]);
		}
			 return 0;
	}

}

