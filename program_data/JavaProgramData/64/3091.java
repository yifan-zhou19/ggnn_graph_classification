package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] zb = new int[100][3];
	int a;
	int n;
	int j;
	int k;
	int i;
	double b;
	double[] jl = new double[100];
	double t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		for (k = 0;k < 3;k++)
		{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		zb[i][k] = Integer.parseInt(tempVar2);
	}
		}
	}
	for (i = 0;i < n;i++)
	{
			for (j = i + 1;j < n;j++)
			{

	jl[10 * i + j] = 0;
			}
	}


	for (i = 0;i < n;i++)
	{
		for (j = i + 1;j < n;j++)
		{


			a = ((zb[i][0] - zb[j][0]) * (zb[i][0] - zb[j][0])) + ((zb[i][1] - zb[j][1]) * (zb[i][1] - zb[j][1])) + ((zb[i][2] - zb[j][2]) * (zb[i][2] - zb[j][2]));

			jl[10 * i + j] = Math.sqrt(a);
		}
	}
	while (true)
	{
		t = 0;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (jl[10 * i + j] > t)
				{
					t = jl[10 * i + j];
				}
			}
		}
		if (t == 0)
		{
			break;
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (jl[10 * i + j] == t)
				{
					System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",zb[i][0],zb[i][1],zb[i][2],zb[j][0],zb[j][1],zb[j][2],t);
					jl[10 * i + j] = 0;
				}
			}
		}
	}
		return 0;
	}

}

