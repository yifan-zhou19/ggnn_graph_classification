package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int k;
		int n;
		float[] xin = new float[20];
		float[][] shuzu = new float[20][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					shuzu[i][k] = Float.parseFloat(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < 2;k++)
			{
				if (k = 1)
				{
					xin[i] = shuzu[i][k] / shuzu[i][k - 1];
				}
			}
		}
			for (i = 1;i < n - 1;i++)
			{
					if (xin[i] - xin[0] > 0.05F)
					{
						System.out.print("better\n");
					}
					else if (xin[0] - xin[i] > 0.05F)
					{
						System.out.print("worse\n");
					}
					else
					{
						System.out.print("same\n");
					}
			}
			if (xin[n - 1] - xin[0] > 0.05F)
			{
				System.out.print("berrer");
			}
			else if (xin[0] - xin[n - 1] > 0.05F)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}

	return 0;
	}

}

