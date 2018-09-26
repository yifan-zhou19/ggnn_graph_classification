package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] sz = new double[1000];
		double[] sa = new double[1000];
		for (i = 0;i < n;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i] = Double.parseDouble(tempVar2);
		   }
		   String tempVar3 = ConsoleInput.scanfRead(" ");
		   if (tempVar3 != null)
		   {
			   sa[i] = Double.parseDouble(tempVar3);
		   }
		if (i > 0)
		{
			if (sa[i] / sz[i] - sa[0] / sz[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (sa[0] / sz[0] - sa[i] / sz[i] > 0.05)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		}
		return 0;
	}

}

