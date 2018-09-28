package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] x = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   x[i] = Integer.parseInt(tempVar3);
			   }
		}

		for (j = 0;j < n;j++)
		{
				for (i = j + 1;i <= n;i++)
				{
					   if (x[j] + x[i] == k)
					   {
							  System.out.print("yes");
							  return 0;
					   }
				}
		}
		System.out.print("no");

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			n = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			k = Integer.parseInt(tempVar5);
		}
		return 0;
	}
}

