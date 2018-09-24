package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int num;
		int[] n = new int[100];
		int[] m = new int[100];
		float[] w = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[i] = Integer.parseInt(tempVar3);
			}
		}
		w[0] = (float)m[0] / n[0];
		for (i = 1;i < num;i++)
		{
			w[i] = (float)m[i] / n[i];
			if (w[i] - w[0] > 0.05F)
			{
				System.out.print("better\n");
			}
			if (w[0] - w[i] > 0.05F)
			{
				System.out.print("worse\n");
			}
			if (w[0] - w[i] <= 0.05F && w[i] - w[0] <= 0.05F)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}

}

