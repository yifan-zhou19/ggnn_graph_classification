package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int l = 0;
		int min = 50000;
		int max = 0;
		int[] sz = new int[60000];
		int[] szz = new int[60000];
		int[] szzz = new int[60000];
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
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				szz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (min > sz[i])
			{
				min = sz[i];
			}
			if (max < sz[i])
			{
				max = sz[i];
			}
			if (min > szz[i])
			{
				min = szz[i];
			}
			if (max < szz[i])
			{
				max = szz[i];
			}
		}
		float[] x = new float[60000];
		for (i = 0;i < n;i++)
		{
			for (j = sz[i],x[i] = sz[i] + 0.5;j < szz[i];j++)
			{
		   if (x[i] < szz[i])
		   {
			   szzz[j]++;
		   }
		   x[i]++;
			}
		}
		for (j = min;j < max;j++)
		{
			if (szzz[j] == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",min,max);
		return 0;
	}

}

