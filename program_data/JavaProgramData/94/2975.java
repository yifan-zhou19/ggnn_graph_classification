package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[n];
		int[] b = new int[n];

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < n;i++)
		{
						if (a[i] % 2 != 0)
						{
							b[k] = a[i];
						k++;
						}
		}
		 for (c = k - 1;c > 0;c--)
		 {
			for (d = 0;d < c;d++)
			{
			  if (b[d] > b[d + 1])
			  {
				i = b[d + 1];
			b[d + 1] = b[d];
			b[d] = i;
			  }
			}
		 }
	System.out.printf("%d",b[0]);
	for (d = 1;d < k;d++)
	{
	System.out.printf(",%d",b[d]);
	}



	return 0;
	}


}

