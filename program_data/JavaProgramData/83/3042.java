package <missing>;

public class GlobalMembers
{
	///#include<iostream>
	//using namespace std;

	public static int Main()
	{
		int n;
		int i;
		int[] xuefen = new int[15];
		int[] chengji = new int[15];
		int sum;
		float[] jidian = new float[15];
		float sum2;
		float tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		sum = 0;
		sum2 = 0F;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				xuefen[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + xuefen[i];
		}
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				chengji[i] = Integer.parseInt(tempVar3);
			}
			if (chengji[i] >= 90 && chengji[i] <= 100)
			{
				jidian[i] = 4.0F;
			}
			else if (chengji[i] >= 85 && chengji[i] <= 89)
			{
				jidian[i] = 3.7F;
			}
			else if (chengji[i] >= 82 && chengji[i] <= 84)
			{
				jidian[i] = 3.3F;
			}
			else if (chengji[i] >= 78 && chengji[i] <= 81)
			{
				jidian[i] = 3.0F;
			}
			else if (chengji[i] >= 75 && chengji[i] <= 77)
			{
				jidian[i] = 2.7F;
			}
			else if (chengji[i] >= 72 && chengji[i] <= 74)
			{
				jidian[i] = 2.3F;
			}
			else if (chengji[i] >= 68 && chengji[i] <= 71)
			{
				jidian[i] = 2.0F;
			}
			else if (chengji[i] >= 64 && chengji[i] <= 67)
			{
				jidian[i] = 1.5F;
			}
			else if (chengji[i] >= 60 && chengji[i] <= 63)
			{
				jidian[i] = 1.0F;
			}
			else
			{
				jidian[i] = 0F;
			}
		}
		sum2;
		for (i = 1;i <= n;i++)
		{
			sum2 = sum2 + jidian[i] * xuefen[i];
		}
		tmp = sum2 / sum;
		System.out.printf("%.2f",tmp);
		return 0;
	}
}

