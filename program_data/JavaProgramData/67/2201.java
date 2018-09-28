package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double biao;
		double x;
		double[][] shuzu = new double[20][2];
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
				shuzu[i][0] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				shuzu[i][1] = Double.parseDouble(tempVar3);
			}
		}
		biao = shuzu[0][1] / shuzu[0][0];
		for (i = 1;i < n;i++)
		{
			x = shuzu[i][1] / shuzu[i][0];
			if (x - biao > 0.05)
			{
			   System.out.print("better\n");
			}
			else if (biao - x > 0.05)
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

