package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xuefen = new int[10];
		int[] fenshu = new int[10];
		int n;
		int a = 0;
		float[] jidian = new float[10];
		float sum = 0F;
		float m;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Integer.parseInt(tempVar2);
			}
			a += xuefen[i];
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				fenshu[i] = Integer.parseInt(tempVar3);
			}
			if (fenshu[i] >= 90 && fenshu[i] <= 100)
			{
				jidian[i] = 4.0F;
			}
			if (fenshu[i] >= 85 && fenshu[i] <= 89)
			{
				jidian[i] = 3.7F;
			}
			if (fenshu[i] >= 82 && fenshu[i] <= 84)
			{
				jidian[i] = 3.3F;
			}
			if (fenshu[i] >= 78 && fenshu[i] <= 81)
			{
				jidian[i] = 3.0F;
			}
			if (fenshu[i] >= 75 && fenshu[i] <= 77)
			{
				jidian[i] = 2.7F;
			}
			if (fenshu[i] >= 72 && fenshu[i] <= 74)
			{
				jidian[i] = 2.3F;
			}
			if (fenshu[i] >= 68 && fenshu[i] <= 71)
			{
				jidian[i] = 2.0F;
			}
			if (fenshu[i] >= 64 && fenshu[i] <= 67)
			{
				jidian[i] = 1.5F;
			}
			if (fenshu[i] >= 60 && fenshu[i] <= 63)
			{
				jidian[i] = 1.0F;
			}
			if (fenshu[i] <= 60)
			{
				jidian[i] = 0F;
			}
			m = xuefen[i] * jidian[i];
			sum += m;
		}
		GPA = sum / a;
		System.out.printf("%.2f",GPA);
		return 0;
	}

}

