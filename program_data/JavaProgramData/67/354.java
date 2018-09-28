package <missing>;

public class GlobalMembers
{
	public static int Main()

	{
		int n;
		int i;
		int m = 0;
		int d;
		float j;
		float j1;
		float j2;
		float[] q = new float[100];
		float[] q1 = new float[100];
		float[] q2 = new float[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			j1 = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			j2 = Float.parseFloat(tempVar3);
		}
		j = j2 / j1;
		for (i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				q1[i] = Float.parseFloat(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				q2[i] = Float.parseFloat(tempVar5);
			}
			q[i] = q2[i] / q1[i];
			if (q[i] - j > 0.05F)
			{
				System.out.print("better\n");
			}
			else if (j - q[i] > 0.05F)
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

