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
		float[] all = new float[100];
		float[] fun = new float[100];
		float[] per = new float[100];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				all[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fun[i] = Float.parseFloat(tempVar3);
			}
			per[i] = fun[i] / all[i];
		}
		for (i = 1;i < n - 1;i++)
		{
			if (per[i] >= per[0])
			{
				if (per[i] - per[0] > 0.05F)
				{
					System.out.print("better\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
			if (per[i] < per[0])
			{
				if (per[0] - per[i] > 0.05F)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
		if (per[n - 1] >= per[0])
		{
				if (per[i] - per[0] > 0.05F)
				{
					System.out.print("better");
				}
				else
				{
					System.out.print("same");
				}
		}
			if (per[n - 1] < per[0])
			{
				if (per[0] - per[i] > 0.05F)
				{
					System.out.print("worse");
				}
				else
				{
					System.out.print("same");
				}
			}
		return 0;
	}

}

