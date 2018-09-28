package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] k = new int[101];
		int i;
		int[] q = new int[101];
		int j = 0;
		int m = 0;
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
				k[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] <= 140 && k[i] >= 90 && q[i] <= 90 && q[i] >= 60)
			{
				j++;
			}
			else
			{
				if (j > m)
				{
					m = j;
					j = 0;
				}
				else
				{
					j = 0;
				}
			}
		}
		if (j > m)
		{
				System.out.printf("%d",j);
		}
				else
				{
	System.out.printf("%d",m);
				}
		return 0;
	}

}

