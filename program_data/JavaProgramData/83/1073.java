package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int t;
		int j;
		int c;
		int e = 0;
		float w = 0F;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] score = new int[10];
		float[] GPA = new float[10];
		float[] credit = new float[10];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}
			score[i] = k;
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				t = Integer.parseInt(tempVar3);
			}
			if (90 <= t != 0 && t <= 100)
			{
				GPA[j] = 4.0F;
			}
			if (85 <= t != 0 && t <= 89)
			{
				GPA[j] = 3.7F;
			}
			if (82 <= t != 0 && t <= 84)
			{
				GPA[j] = 3.3F;
			}
			if (78 <= t != 0 && t <= 81)
			{
				GPA[j] = 3.0F;
			}
			if (75 <= t != 0 && t <= 77)
			{
				GPA[j] = 2.7F;
			}
			if (72 <= t != 0 && t <= 74)
			{
				GPA[j] = 2.3F;
			}
			if (68 <= t != 0 && t <= 71)
			{
				GPA[j] = 2.0F;
			}
			if (64 <= t != 0 && t <= 67)
			{
				GPA[j] = 1.5F;
			}
			if (60 <= t != 0 && t <= 63)
			{
				GPA[j] = 1.0F;
			}
			if (t <= 60)
			{
				GPA[j] = 0F;
			}
		}
		for (c = 1;c <= n;c++)
		{
			credit[c] = score[c] * GPA[c];
			e += score[c];
			sum += credit[c];
		}
		w = sum / e;
		System.out.printf("%.2f", w);
	}



}

