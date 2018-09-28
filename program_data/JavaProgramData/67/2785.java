package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float j;
		float k;
		float l;
		float m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			k = Float.parseFloat(tempVar3);
		}
		l = 0.05 + k / j;
		m = -0.05 + k / j;
		float[][] a = new float[100][2];
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i][0] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				a[i][1] = Float.parseFloat(tempVar5);
			}
			if (a[i][1] / a[i][0] > l)
			{
				System.out.print("better\n");
			}
			else
			{
				if (a[i][1] / a[i][0] < m)
				{
					System.out.print("worse\n");
				}
				else
				{
					System.out.print("same\n");
				}
			}
		}
		return 0;
	}

}

