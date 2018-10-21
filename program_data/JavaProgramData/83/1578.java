package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		float GPA;
		float[] fen = new float[10];
		float jh = 0F;
		float[] xd = new float[10];
		float xh = 0F;
		float[] xf = new float[10];
		float[] score = new float[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xf[i] = Float.parseFloat(tempVar2);
			}
			xh = xh + xf[i];
		}
		for (i = 0;i <= n - 1;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			score[i] = Float.parseFloat(tempVar3);
		}
		if (score[i] >= 90F)
		{
			fen[i] = 4.0F;
		}
		else if (score[i] >= 85F)
		{
			fen[i] = 3.7F;
		}
		else if (score[i] >= 82F)
		{
			fen[i] = 3.3F;
		}
		else if (score[i] >= 78F)
		{
			fen[i] = 3.0F;
		}
		else if (score[i] >= 75F)
		{
			fen[i] = 2.7F;
		}
		else if (score[i] >= 72F)
		{
			fen[i] = 2.3F;
		}
		else if (score[i] >= 68F)
		{
			fen[i] = 2.0F;
		}
		else if (score[i] >= 64F)
		{
			fen[i] = 1.5F;
		}
		else if (score[i] >= 60F)
		{
			fen[i] = 1.0F;
		}
		else
		{
			fen[i] = 0F;
		}
		xd[i] = fen[i] * xf[i];
		jh = jh + xd[i];
		}
		GPA = jh / xh;
		System.out.printf("%.2f",GPA);
	}


}

