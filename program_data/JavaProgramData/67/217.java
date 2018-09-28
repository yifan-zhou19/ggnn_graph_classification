package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int allc;
		int curc;
		int[] all = new int[100];
		int[] cur = new int[100];
		int i;
		double cp;
		double[] op = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			allc = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			curc = Integer.parseInt(tempVar3);
		}
		cp = ((double)curc) / ((double)allc) * 100;
		//printf("%lf\n",cp);
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				all[i] = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				cur[i] = Integer.parseInt(tempVar5);
			}
			op[i] = ((double)cur[i]) / ((double)all[i]) * 100;
			//printf("%lf\n",op[i]);
		}
		for (i = 0;i < n - 1;i++)
		{
			if (op[i] - cp > 5)
			{
				System.out.print("better\n");
			}
			else if (op[i] - cp < -5)
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

