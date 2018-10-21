package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[10];
		int i;
		int j;
		int n;
		int[] df = new int[10];
		float gd;
		int sum1 = 0;
		float sum2 = 0F;
		float GPA;
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
				sz[i] = Integer.parseInt(tempVar2);
			}

		}
		for (i = 0;i < n;i++)
		{
			sum1 += sz[i];

		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				df[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (df[i] >= 90 && df[i] <= 100)
			{
				gd = 4.0F;
			}
			if (df[i] >= 85 && df[i] <= 89)
			{
				gd = 3.7F;
			}
			if (df[i] >= 82 && df[i] <= 84)
			{
				gd = 3.3F;
			}
			if (df[i] >= 78 && df[i] <= 81)
			{
				gd = 3.0F;
			}
			if (df[i] >= 75 && df[i] <= 77)
			{
				gd = 2.7F;
			}
			if (df[i] >= 72 && df[i] <= 74)
			{
				gd = 2.3F;
			}
			if (df[i] >= 68 && df[i] <= 71)
			{
				gd = 2.0F;
			}
			if (df[i] >= 64 && df[i] <= 67)
			{
				gd = 1.5F;
			}
			if (df[i] >= 60 && df[i] <= 63)
			{
				gd = 1.0F;
			}
			if (df[i] < 60)
			{
				gd = 0F;
			}
			sum2 += gd * sz[i];
		}
		GPA = sum2 / sum1;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

