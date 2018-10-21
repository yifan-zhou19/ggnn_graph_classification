package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		int i;
		int m;
		int[] sz = new int[50000];
		int[] a = new int[50000];
		int[] b = new int[50000];
		int max;
		int min;
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
		 max = b[0];
		 for (i = 0;i < n;i++)
		 {
				  if (b[i] >= max)
				  {
					  max = b[i];
				  }
		 }

		min = a[0];
		 for (i = 0;i < n;i++)
		 {
				  if (a[i] <= min)
				  {
					  min = a[i];
				  }
		 }
		for (i = 0;i <= max;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (m = a[i];m < (b[i]);m++)
			{
			sz[m] = 1;
			}
		}
		for (i = 0;i <= max;i++)
		{
			s += sz[i];
		}
		 if (s == (max - min))
		 {
			 System.out.printf("%d %d",min,max);
		 }
		 else
		 {
			 System.out.print("no");
		 }
		 return 0;

	}

}

