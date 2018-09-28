package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		float a;
		float b;
		float ji;
		float[] c = new float[100];
		float[] d = new float[100];
		float[] qita = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Float.parseFloat(tempVar3);
		}
		ji = b / a;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				d[i] = Float.parseFloat(tempVar5);
			}
			qita[i] = d[i] / c[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if (qita[i] - ji > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (ji - qita[i] > 0.05F)
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

