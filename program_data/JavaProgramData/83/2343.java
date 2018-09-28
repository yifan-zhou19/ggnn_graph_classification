package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num = 0;
		int[] sco = new int[10];
		int[] gra = new int[10];
		int i;
		int totalsco = 0;
		float gpa = 0.0F;
		float totalgpa = 0.0F;
		float[] jd = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sco[i] = Integer.parseInt(tempVar2);
			}
		}
		System.in.read();
		for (i = 0;i < num;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				gra[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < num;i++)
		{
			if (gra[i] >= 90 && gra[i] <= 100)
			{
				jd[i] = 4.0F;
			}
			if (gra[i] >= 85 && gra[i] <= 89)
			{
				jd[i] = 3.7F;
			}
			if (gra[i] >= 82 && gra[i] <= 84)
			{
				jd[i] = 3.3F;
			}
			if (gra[i] >= 78 && gra[i] <= 81)
			{
				jd[i] = 3.0F;
			}
			if (gra[i] >= 75 && gra[i] <= 77)
			{
				jd[i] = 2.7F;
			}
			if (gra[i] >= 72 && gra[i] <= 74)
			{
				jd[i] = 2.3F;
			}
			if (gra[i] >= 68 && gra[i] <= 71)
			{
				jd[i] = 2.0F;
			}
			if (gra[i] >= 64 && gra[i] <= 67)
			{
				jd[i] = 1.5F;
			}
			if (gra[i] >= 60 && gra[i] <= 63)
			{
				jd[i] = 1.0F;
			}
			if (gra[i] < 60)
			{
				jd[i] = 0F;
			}
			totalsco += sco[i];
			totalgpa += jd[i] * sco[i];
		}
		gpa = totalgpa / totalsco;
		System.out.printf("%.2f\n", gpa);
		return 0;
	}
}

