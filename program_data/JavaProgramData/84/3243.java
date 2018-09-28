package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] p = new int[100];
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = Integer.parseInt(tempVar2);
			}
		}
		int max;
		int max2;
		max = 0;
		max2 = 0;
		for (i = 1;i <= n;i++)
		{
			if (p[i] > max)
			{
				max2 = max;
				 max = p[i];
			}
			else if (p[i] > max2)
			{
				max2 = p[i];
			}
		}
		System.out.printf("%d\n%d\n",max,max2);
		return 0;
	}
}

