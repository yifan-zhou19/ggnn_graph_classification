package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] defen = new int[10];
		int[] xuefen = new int[10];
		int sumxuefen = 0;
		int a;
		int i;
		float zhi;
		float[] jidian = new float[10];
		float b;
		float sumjidian = 0F;
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
			sumxuefen = sumxuefen + xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				defen[i] = Integer.parseInt(tempVar3);
			}
			a = defen[i];
			if (a >= 90)
			{
				b = 4.0F;
			}
			if (a >= 85 && a <= 89)
			{
				b = 3.7F;
			}
			if (a >= 82 && a <= 84)
			{
				b = 3.3F;
			}
			if (a >= 78 && a <= 81)
			{
				b = 3.0F;
			}
			if (a >= 75 && a <= 77)
			{
				b = 2.7F;
			}
			if (a >= 72 && a <= 74)
			{
				b = 2.3F;
			}
			if (a >= 68 && a <= 71)
			{
				b = 2.0F;
			}
			if (a >= 64 && a <= 67)
			{
				b = 1.5F;
			}
			if (a >= 60 && a <= 63)
			{
				b = 1.0F;
			}
			if (a < 60)
			{
				b = 0.0F;
			}
			jidian[i] = b;
			sumjidian = sumjidian + xuefen[i] * jidian[i];
		}
		zhi = sumjidian / sumxuefen;
		System.out.printf("%.2f",zhi);
	}


}

