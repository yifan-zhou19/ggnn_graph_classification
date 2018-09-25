package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] z = new int[100];
		int n;
		int i;
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
				z[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1,max = z[0],min = z[0];i < n;i++)
		{
			if (z[i] > max)
			{
				min = max;
				max = z[i];
			}
			else if (z[i] < max && z[i]> min)
			{
				min = z[i];
			}
		}
		System.out.printf("%d\n%d\n",max,min);
		return 0;
	}

}

