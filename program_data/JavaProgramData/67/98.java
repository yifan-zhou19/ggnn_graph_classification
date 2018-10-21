package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s = 0;
		float x;
		float[] y = new float[300];
		float[] a = new float[300];
		float[] b = new float[300];
		float m;
		float p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p = Float.parseFloat(tempVar3);
		}
		x = p / m;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				b[i] = Float.parseFloat(tempVar5);
			}
			y[i] = b[i] / a[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			if ((y[i] - x) > 0.05)
			{
				System.out.print("better\n");
				s++;
			}
			else if ((x - y[i]) > 0.05)
			{
				System.out.print("worse\n");
				s++;
			}
			else
			{
				System.out.print("same\n");
				s++;
			}

		}
		return 0;
	}
}

