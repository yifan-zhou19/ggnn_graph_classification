package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[100000];
		int[] b = new int[100000];
		int x;
		int y;
		int m;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			i = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			j = Integer.parseInt(tempVar3);
		}
		m = 0;
		for (k = 0;k < n;k++)
		{
			a[k] = 0;
			b[k] = 0;
		}
		while ((i == 0 && j != 0) || (i != 0 && j == 0) || (i != 0 && j != 0))
		{
				  for (k = 0;k < n;k++)
				  {
					  if (i == k)
					  {
						 b[i]--;
					  }
				  }
				  for (k = 0;k < n;k++)
				  {
					   if (j == k)
					   {
							  b[j]++;
					   }
				  }

				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  i = Integer.parseInt(tempVar4);
				  }
				  String tempVar5 = ConsoleInput.scanfRead(" ");
				  if (tempVar5 != null)
				  {
					  j = Integer.parseInt(tempVar5);
				  }
		}
		for (k = 0;k < n;k++)
		{
						  if (b[k] == n - 1)
						  {
									   m++;
									   System.out.printf("%d\n",k);
						  }
		}
		if (m == 0)
		{
			System.out.print("NOT FOUND");
		}
		System.in.read();
		System.in.read();
	}
}

