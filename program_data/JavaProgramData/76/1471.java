package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int s = 0;
		int[] sz = new int[M];
		int[] a = new int[M];
		int[] b = new int[M];
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
			  for (k = i + 1;k < n;k++)
			  {
				  if (b[k] >= max)
				  {
					  max = b[k];
				  }
			  }
		 }

		min = a[0];
		 for (i = 0;i < n;i++)
		 {
			  for (k = i + 1;k < n;k++)
			  {
				  if (a[k] <= min)
				  {
					  min = a[k];
				  }
			  }
		 }
		for (i = 0;i <= max;i++)
		{
			sz[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			for (k = a[i];k < (b[i]);k++)
			{
			sz[k] = 1;
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

