package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int p;
		int i;
		int m;
		int[] l = new int[100];
		m = 0;
		p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] z = new int[100];
		int[] q = new int[100];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			q[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < 100;i++)
		{
			l[i] = 0;
		}
			for (i = 0;i < n;i++)
			{
				if (z[i] >= 90 && z[i] <= 140 && q[i] >= 60 && q[i] <= 90)
				{
					l[m]++;
				}
				else
				{
				  m++;
				}
			}
		for (i = 0;i <= m;i++)
		{
			if (l[i] > p)
			{
			   p = l[i];
			}
		}
	System.out.printf("%d",p);
	return 0;
	}
}

