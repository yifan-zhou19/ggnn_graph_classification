package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] sz = new int[100];
		int[] sa = new int[100];
		double[] sd = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sa[i] = Integer.parseInt(tempVar3);
			}
			sd[i] = (sa[i] * 1.0) / sz[i];
		}
		for (int i = 1;i < n;i++)
		{
			if ((sd[i] - sd[0]) > 0.05)
			{
				System.out.print("better\n");
			}
			 else if ((sd[0] - sd[i]) > 0.05)
			 {
				 System.out.print("worse\n");
			 }
			  else
			  {
				  System.out.print("same\n");
			  }
		}
		return 0;
	}
}

