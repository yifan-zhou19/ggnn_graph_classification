package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int max;
		int min;
		int n;
		int i;
		int j;
		int x = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sx = new int[50001];
		int[] sy = new int[50001];
		int[] sz = new int[50001];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   (sx[i]) = Integer.parseInt(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   (sy[i]) = Integer.parseInt(tempVar3);
		   }
		}
		min = sx[0];
		max = sy[0];
		for (i = 1;i < n;i++)
		{
			if (min > sx[i])
			{
				min = sx[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (max < sy[i])
			{
				max = sy[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = sx[i];j < sy[i];j++)
			{
				sz[j] = 1;
			}
		}
		for (i = min;i < max;i++)
		{
			if (sz[i] != 1)
			{
				x++;
			}
		}
		if (x == 0)
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

