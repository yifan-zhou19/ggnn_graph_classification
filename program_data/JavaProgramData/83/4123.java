package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float zong;
		float sump = 0.0F;
		int sumxuefen = 0;
		float[] p = new float[10];
		int[] g = new int[10];
		int[] xuefen = new int[10];
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
				xuefen[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Integer.parseInt(tempVar3);
			}
			if (g[i] >= 90)
			{
				p[i] = 4.0 * xuefen[i];
			}
			else if (g[i] >= 85)
			{
				p[i] = 3.7 * xuefen[i];
			}
			else if (g[i] >= 82)
			{
				p[i] = 3.3 * xuefen[i];
			}
			else if (g[i] >= 78)
			{
				p[i] = 3.0 * xuefen[i];
			}
			else if (g[i] >= 75)
			{
				p[i] = 2.7 * xuefen[i];
			}
			else if (g[i] >= 72)
			{
				p[i] = 2.3 * xuefen[i];
			}
			else if (g[i] >= 68)
			{
				p[i] = 2.0 * xuefen[i];
			}
			else if (g[i] >= 64)
			{
				p[i] = 1.5 * xuefen[i];
			}
			else if (g[i] >= 60)
			{
				p[i] = 1.0 * xuefen[i];
			}
			else
			{
				p[i] = 0.0F;
			}
		}
		for (i = 0;i < n;i++)
		{
			sump += p[i];
			sumxuefen += xuefen[i];
		}
		zong = (float)sump / sumxuefen;
		System.out.printf("%.2f",zong);
		return 0;
	}
}

