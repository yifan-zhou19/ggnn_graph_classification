package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int k;
		int i;
		int j = 0;
		int e;
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
			for (i = 0;i < n;i++)
			{
				if ((a[i]) % 2 != 0)
				{
					b[j] = a[i],j++;
				}
			}

		  for (k = 1;k < n;k++)
		  {
			for (i = 0;i < j - k;i++)
			{
				if (b[i] > b[i + 1])
				{
					e = b[i + 1],b[i + 1] = b[i],b[i] = e;
				}
			}
		  }
		  for (i = 0;i < j;i++)
		  {
			  System.out.printf("%d",b[i]);
			  if (i < j - 1)
			  {
				  System.out.print(",");
			  }
		  }
		return 0;
	}
}

