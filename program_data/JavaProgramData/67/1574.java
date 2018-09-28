package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int n;
	int i;
	int[][] sz = new int[100][2];
	double[] bj = new double[100];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				sz[i][1] = Integer.parseInt(tempVar3);
			}
		bj[i] = 1.0 * sz[i][1] / sz[i][0];
	}

	for (i = 1;i < n;i++)
	{
			if (bj[i] - bj[0] > 0.05)
			{
				System.out.print("better\n");
			}
		else if (bj[0] - bj[i] > 0.05)
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

