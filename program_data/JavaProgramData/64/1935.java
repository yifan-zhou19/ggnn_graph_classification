package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int d = 1;
		int t;
		int[] x = new int[12];
		int[] y = new int[12];
		int[] z = new int[12];
		float g;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct juli
	//	{
	//		int a;
	//		int b;
	//		float jl;
	//	}
	//	l[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				y[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				z[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				l[d].jl = Math.sqrt(((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])) * 1.0);
				l[d].a = i;
				l[d].b = j;
				d++;
			}
		}
		d--;
		for (i = 1;i <= d - 1;i++)
		{
			for (j = 1;j <= d - i;j++)
			{
				if (l[j].jl < l[j + 1].jl)
				{
					g = l[j].jl;
					l[j].jl = l[j + 1].jl;
					l[j + 1].jl = g;
					t = l[j].a;
					l[j].a = l[j + 1].a;
					l[j + 1].a = t;
					t = l[j].b;
					l[j].b = l[j + 1].b;
					l[j + 1].b = t;
				}
			}
		}
		for (i = 1;i <= d;i++)
		{
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[l[i].a],y[l[i].a],z[l[i].a],x[l[i].b],y[l[i].b],z[l[i].b],l[i].jl);
		}
		return 0;
	}
}

