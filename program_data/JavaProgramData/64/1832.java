package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int dx;
		int dy;
		int dz;
		int o = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		double[] ji = new double[100];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(x[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(y[i]) = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(z[i]) = Integer.parseInt(tempVar4);
		}
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//struct pp
	//{
	//	int xi[2],yi[2],zi[2];
	//	double jl;
	//	}
	//	pp[100],e;
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
			dx = x[j] - x[i];
			dy = y[j] - y[i];
			dz = z[j] - z[i];
			pp[o].xi[0] = x[i];
			pp[o].xi[1] = x[j];
			pp[o].yi[0] = y[i];
			pp[o].yi[1] = y[j];
			pp[o].zi[0] = z[i];
			pp[o].zi[1] = z[j];
			pp[o].jl = Math.sqrt(dx * dx + dy * dy + dz * dz);
			o++;
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
			for (j = n * (n - 1) / 2 - 1;j >= i + 1;j--)
			{
				if (pp[j].jl > pp[j - 1].jl)
				{
					e = pp[j - 1];
					pp[j - 1] = pp[j];
					pp[j] = e;
				}
			}
		}
		for (i = 0;i < n * (n - 1) / 2;i++)
		{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",pp[i].xi[0],pp[i].yi[0],pp[i].zi[0],pp[i].xi[1],pp[i].yi[1],pp[i].zi[1],pp[i].jl);
		}
		return 0;
	}
}

