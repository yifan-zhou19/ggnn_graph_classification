package <missing>;

public class GlobalMembers
{
	public static int Xuefen(int[] xuefen, int n)
	{
		int sumxuefen = 0;
		for (int i = 0;i < n;i++)
		{
			 sumxuefen = sumxuefen + xuefen[i];
		}
		return sumxuefen;
	}
	public static double Jidian(int[] defen, int[] xuefen, int n)
	{
		double sumjidian = 0;
		double[] jidian = new double[1000];
		for (int i = 0;i < n;i++)
		{
			if (defen[i] >= 90 && defen[i] <= 100)
			{
				jidian[i] = 4.0 * xuefen[i];
			}
			if (defen[i] >= 85 && defen[i] <= 89)
			{
				jidian[i] = 3.7 * xuefen[i];
			}
			if (defen[i] >= 82 && defen[i] <= 84)
			{
				jidian[i] = 3.3 * xuefen[i];
			}
			if (defen[i] >= 78 && defen[i] <= 81)
			{
				jidian[i] = 3.0 * xuefen[i];
			}
			if (defen[i] >= 75 && defen[i] <= 77)
			{
				jidian[i] = 2.7 * xuefen[i];
			}
			if (defen[i] >= 72 && defen[i] <= 74)
			{
				jidian[i] = 2.3 * xuefen[i];
			}
			if (defen[i] >= 68 && defen[i] <= 71)
			{
				jidian[i] = 2.0 * xuefen[i];
			}
			if (defen[i] >= 64 && defen[i] <= 67)
			{
				jidian[i] = 1.5 * xuefen[i];
			}
			if (defen[i] >= 60 && defen[i] <= 63)
			{
				jidian[i] = 1.0 * xuefen[i];
			}
			if (defen[i] <= 60)
			{
				jidian[i] = 1.0 * 0 * xuefen[i];
			}
		}
		for (int i = 0;i < n;i++)
		{
			sumjidian += jidian[i];
		}
		return sumjidian;
	}
	public static int Main()
	{
		int n;
		double p;
		double q;
		double GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] xuefen = new int[100];
		int[] defen = new int[101];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[i] = Integer.parseInt(tempVar3);
			}
		}
		p = Jidian(defen, xuefen, n);
		q = 1.0 * Xuefen(xuefen, n);
		System.out.printf("%.2lf",p / q);
		return 0;
	}


}

