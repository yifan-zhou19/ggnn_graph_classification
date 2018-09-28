package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sumxuefen = 0;
		int i;
		float sumjidian = 0F;
		float sumxuefenjidian = 0F;
		float GPA;
		int[] xuefen = new int[10];
		int[] scores = new int[10];
		float[] jidian = new float[10];
		float[] xuefenjidian = new float[10];
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
				scores[i] = Integer.parseInt(tempVar3);
			}
			if (scores[i] == 100 || scores[i] == 99 || scores[i] == 98 || scores[i] == 97 || scores[i] == 96 || scores[i] == 95 || scores[i] == 94 || scores[i] == 93 || scores[i] == 92 || scores[i] == 91 || scores[i] == 90)
			{
				jidian[i] = 4.0F;
			}
			else if (scores[i] == 89 || scores[i] == 88 || scores[i] == 87 || scores[i] == 86 || scores[i] == 85)
			{
				jidian[i] = 3.7F;
			}
			else if (scores[i] == 84 || scores[i] == 83 || scores[i] == 82)
			{
				jidian[i] = 3.3F;
			}
			else if (scores[i] == 81 || scores[i] == 80 || scores[i] == 79 || scores[i] == 78)
			{
				jidian[i] = 3.0F;
			}
			else if (scores[i] == 77 || scores[i] == 76 || scores[i] == 75)
			{
				jidian[i] = 2.7F;
			}
			else if (scores[i] == 74 || scores[i] == 73 || scores[i] == 72)
			{
				jidian[i] = 2.3F;
			}
			else if (scores[i] == 71 || scores[i] == 70 || scores[i] == 69 || scores[i] == 68)
			{
				jidian[i] = 2.0F;
			}
			else if (scores[i] == 67 || scores[i] == 77 || scores[i] == 65 || scores[i] == 64)
			{
				jidian[i] = 1.5F;
			}
			else if (scores[i] == 63 || scores[i] == 62 || scores[i] == 61 || scores[i] == 60)
			{
				jidian[i] = 2.0F;
			}
			else
			{
				jidian[i] = 0F;
			}
				sumjidian = sumjidian + jidian[i];
		}
		for (i = 0;i < n;i++)
		{
			xuefenjidian[i] = jidian[i] * xuefen[i];
		}
	  for (i = 0;i < n;i++)
	  {
		  sumxuefenjidian = sumxuefenjidian + xuefenjidian[i];
	  }
			GPA = sumxuefenjidian * 1.00 / sumxuefen;
			System.out.printf("%.2f", GPA);
			return 0;
	}

}

