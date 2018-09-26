package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int[] sz2 = new int[100];
		int[] sz3 = new int[100];
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
	   if (n > 1)
	   {
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz2[i] = Integer.parseInt(tempVar3);
			}
		}
		int k = 0;
		int j = 0;
		for (i = 0;i < n;i++)
		{
			if ((sz[i] >= 90 && sz[i] <= 140) && (sz2[i] >= 60 && sz2[i] <= 90))
			{
				j++;
				sz3[k] = j;
			}
			else
			{
				j = 0;
				k++;
			}
		}
		int max = sz3[0];
		for (i = 0;i <= k;i++)
		{
			if (sz3[i] > max)
			{
				max = sz3[i];
			}
		}

		System.out.printf("%d",max);
	   }
	if (n == 1)
	{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sz[0] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			sz2[0] = Integer.parseInt(tempVar5);
		}
			   if ((sz[0] >= 90 && sz[0] <= 140) && (sz2[0] >= 60 && sz2[0] <= 90))
			   {
			System.out.print("1");
			   }
			else
			{
				System.out.print("0");
			}
	}


		return 0;
	}

}

