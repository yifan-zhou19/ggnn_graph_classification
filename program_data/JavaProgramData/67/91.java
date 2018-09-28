package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] z = new int[1000];
		int[] y = new int[1000];
		int a;
		int b;
		float d;
		float[] e = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		d = b * 1.0 / a;
		for (i = 0;i < n - 1;i++)
		{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		z[i] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y[i] = Integer.parseInt(tempVar5);
	}
		e[i] = y[i] * 1.0 / z[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (e[i] - d > 0.05F)
			{
			System.out.print("better\n");
			}
			else if (d - e[i] > 0.05F)
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

