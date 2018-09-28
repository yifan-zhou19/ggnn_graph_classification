package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int[] p = new int[100];
		int[] pcu = new int[100];
		double[] per = new double[100];
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
				p[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				pcu[i] = Integer.parseInt(tempVar3);
			}
			per[i] = (double)pcu[i] / p[i] * 100;
		}
		for (i = 1;i < n;i++)
		{
			if (per[i] - per[0] > 5)
			{
				System.out.print("better\n");
			}
			else if (per[0] - per[i] > 5)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}


	}

}

