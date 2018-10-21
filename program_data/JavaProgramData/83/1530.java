package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c;
		float b;
		float GPAN;
		int i;
		int[] xuefen = new int[10];
		int[] score = new int[10];
		float[] GPA = new float[10];
		float[] GPAbiao = {4.0F, 3.7F, 3.3F, 3.0F, 2.7F, 2.3F, 2.0F, 1.5F, 1.0F, 0F};
		b = 0F;
		c = 0;
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
				score[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			  if (score[i] >= 90)
			  {
				  GPA[i] = GPAbiao[0] * xuefen[i];
			  }
			  else if (score[i] >= 85 && score[i] < 90)
			  {
				  GPA[i] = GPAbiao[1] * xuefen[i];
			  }
			  else if (score[i] >= 82 && score[i] < 85)
			  {
				  GPA[i] = GPAbiao[2] * xuefen[i];
			  }
			  else if (score[i] >= 78 && score[i] < 82)
			  {
				  GPA[i] = GPAbiao[3] * xuefen[i];
			  }
			  else if (score[i] >= 75 && score[i] < 78)
			  {
				  GPA[i] = GPAbiao[4] * xuefen[i];
			  }
			  else if (score[i] >= 72 && score[i] < 75)
			  {
				  GPA[i] = GPAbiao[5] * xuefen[i];
			  }
			  else if (score[i] >= 68 && score[i] < 72)
			  {
				  GPA[i] = GPAbiao[6] * xuefen[i];
			  }
			  else if (score[i] >= 64 && score[i] < 68)
			  {
				  GPA[i] = GPAbiao[7] * xuefen[i];
			  }
			  else if (score[i] >= 60 && score[i] < 64)
			  {
				  GPA[i] = GPAbiao[8] * xuefen[i];
			  }
			  else
			  {
				  GPA[i] = GPAbiao[9] * xuefen[i];
			  }
		}
		for (i = 0;i < n;i++)
		{
			b = b + GPA[i];
			c = c + xuefen[i];
		}
		GPAN = b / c;
		System.out.printf("%.2f", GPAN);
		return 0;
	}

}

