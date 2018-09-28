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
		int[] hz = new int[1000];
		int[] zy = new int[1000];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			hz[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			zy[0] = Integer.parseInt(tempVar3);
		}
		double a;
		double[] result = new double[1000];
		a = zy[0] * 1.0 / hz[0] * 1.0;
		int i;
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				hz[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				zy[i] = Integer.parseInt(tempVar5);
			}
			result[i] = zy[i] * 1.0 / hz[i] * 1.0;
			if (result[i] - a > 0.05)
			{
				System.out.print("better\n");
			}
			 else if (result[i] - a < -0.05)
			 {
				System.out.print("worse\n");
			 }
			 else if (result[i] - a >= -0.05 && result[i] - a <= 0.05)
			 {
				System.out.print("same\n");
			 }
		}
		return 0;
	}
}

