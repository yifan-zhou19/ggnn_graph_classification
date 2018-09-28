package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int sum1 = 0;
		int n;
		int[] c = new int[10];
		int[] shiji = new int[10];
	float[] g = new float[10];
	float[] shidejidian = new float[10];
	float sum2 = 0F;
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
				c[i] = Integer.parseInt(tempVar2);
			}
			sum1 += c[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				shiji[i] = Integer.parseInt(tempVar3);
			}
		if (shiji[i] > 89)
		{
			g[i] = 4.0F;
		}
		else if (shiji[i] > 84)
		{
			g[i] = 3.7F;
		}
		else if (shiji[i] > 81)
		{
			g[i] = 3.3F;
		}
		else if (shiji[i] > 77)
		{
			g[i] = 3.0F;
		}
		else if (shiji[i] > 74)
		{
			g[i] = 2.7F;
		}
		else if (shiji[i] > 71)
		{
			g[i] = 2.3F;
		}
		else if (shiji[i] > 67)
		{
			g[i] = 2.0F;
		}
		else if (shiji[i] > 63)
		{
			g[i] = 1.5F;
		}
		else if (shiji[i] > 59)
		{
			g[i] = 1.0F;
		}
		else
		{
			g[i] = 0F;
		}
		shidejidian[i] = g[i] * c[i];
		sum2 += shidejidian[i];
		}
		System.out.printf("%.2f",(float)sum2 / sum1);





	}
}

