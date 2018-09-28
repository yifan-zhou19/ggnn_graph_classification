package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	 int[][] sz = new int[8][8];
	 int i;
	 int n;
	 int k;
	 int l;
	 int[] max = new int[8];
	 int[] min = new int[8];
	 int p = 0;
	 int[] q = new int[8];
	 int[] ma = new int[1];
	 int sum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < n;i++)
	{
		for (l = 0;l < k;l++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sz[i][l]) = Integer.parseInt(tempVar3);
		}
		}
	}


	for (i = 0;i < n;i++)
	{
		ma[0] = 0;
	for (l = 0;l < k;l++)
	{
	if (sz[i][l] > ma[0])
	{
		ma[0] = sz[i][l];
	ma[1] = l;

	}
	}
	max[i] = ma[1];
	}
	for (i = 0;i < n;i++)
	{
		q[i] = 1;
	}
	for (p = 0;p < n;p++)
	{
	for (i = 0;i < n;i++)
	{
		min[0] = sz[p][max[p]];
	if (sz[i][max[p]] < min[0])
	{
	q[p] = 0;
	break;
	}
	}
	if (q[p] == 1)
	{
		System.out.printf("%d+%d",p,max[p]);
	break;
	}
	}

	for (i = 0;i < n;i++)
	{
		sum += q[i];
	}
	if (sum == 0)
	{
		System.out.print("No");
	}

	  return 0;
	}

}

