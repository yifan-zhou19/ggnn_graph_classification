package <missing>;

public class GlobalMembers
{
	public static float ji(int a)
	{
		if (a >= 90 && a <= 100)
		{
		return 4.0F;
		}
		else if (a >= 85 && a <= 89)
		{
		return 3.7F;
		}
		else if (a >= 82 && a <= 84)
		{
		return 3.3F;
		}
		else if (a >= 78 && a <= 81)
		{
		return 3.0F;
		}
		else if (a >= 75 && a <= 77)
		{
		return 2.7F;
		}
		else if (a >= 72 && a <= 74)
		{
		return 2.3F;
		}
		else if (a >= 68 && a <= 71)
		{
		return 2.0F;
		}
		else if (a >= 64 && a <= 67)
		{
		return 1.5F;
		}
		else if (a >= 60 && a <= 63)
		{
		return 1.0F;
		}
		else
		{
			return 0.0F;
		}
	}
	public static int Main()
	{
		int n;
		int[] defen = new int[N];
		int[] xuefen = new int[N];
		int sum = 0;
		int i;
		float[] jidian = new float[N]; //?????????????GPA
		float GPA = 0F;
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
			sum += xuefen[i];
		}
		for (i = 0;i < n;i++)
		{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					defen[i] = Integer.parseInt(tempVar3);
				}
				jidian[i] = ji(defen[i]);
				GPA = GPA + jidian[i] * xuefen[i];
		}
		GPA = GPA / sum;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

