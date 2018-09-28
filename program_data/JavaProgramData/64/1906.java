package <missing>;

public class GlobalMembers
{
	public static float dist(int a, int b, int c, int a1, int b1, int c1)
	{
		float D;
		D = Math.sqrt((a - a1) * (a - a1) + (b - b1) * (b - b1) + (c - c1) * (c - c1));
		return (D);
	}
	public static int toi(int fi, int ni)
	{
		int ai;
		int testfi;
		int qi;
		testfi = fi;
		qi = 1;
		do
		{
			if (testfi - (ni - qi) <= 0)
			{
				ai = qi - 1;
				break;
			}
			else
			{
				testfi -= ni - qi;
				qi++;
			}
		}while (qi < ni);
		return (ai);
	}
	public static int toj(int fj, int nj)
	{
		int aj;
		int testfj;
		int qj;
		testfj = fj;
		qj = 1;
		do
		{
			if (testfj - (nj - qj) <= 0)
			{
				aj = testfj + qj - 1;
				break;
			}
			else
			{
				testfj -= nj - qj;
				qj++;
			}
		}while (qj < nj);
		return (aj);
	}

	public static int Main()
	{
		int[] x = new int[10];
		int[] y = new int[10];
		int[] z = new int[10];
		int n;
		int i;
		int j;
		int o = 1;
		int flag;
		int ansi;
		int ansj;
		float[] d = new float[46];
		float max;
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
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				d[o] = dist(x[i], y[i], z[i], x[j], y[j], z[j]);
				o++;
			}
		}
		for (i = 1;i < o;i++)
		{
			max = 0F;
			for (j = 1;j < o;j++)
			{
				if (d[j] > max)
				{
					max = d[j];
					flag = j;
				}
				else
				{
					continue;
				}
			}
			ansi = toi(flag, n);
			ansj = toj(flag, n);
			System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",x[ansi],y[ansi],z[ansi],x[ansj],y[ansj],z[ansj],max);
			d[flag] = 0F;
		}
		return 0;
	}
}

