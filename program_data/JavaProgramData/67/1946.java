package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] zong = new int[100];
		int[] youxiao = new int[100];
		double[] lv = new double[100];
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
				zong[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				youxiao[i] = Integer.parseInt(tempVar3);
			}
			lv[i] = (0.01 * youxiao[i]) / (0.01 * zong[i]);
		}
		for (int j = 1;j < n;j++)
		{
			if (lv[j] - lv[0] > 0.05)
			{
				System.out.print("better\n");
			}
			else if (lv[0] - lv[j] > 0.05)
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

