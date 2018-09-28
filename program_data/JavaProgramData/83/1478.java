package <missing>;

public class GlobalMembers
{
	public static float GPA(int x)
	{
		if (x >= 90 && x <= 100)
		{
			return 4.0F;
		}
		else if (x >= 85 && x <= 89)
		{
			return 3.7F;
		}
		else if (x >= 82 && x <= 84)
		{
			return 3.3F;
		}
		else if (x >= 78 && x <= 81)
		{
			return 3.0F;
		}
		else if (x >= 75 && x <= 77)
		{
			return 2.7F;
		}
		else if (x >= 72 && x <= 74)
		{
			return 2.3F;
		}
		else if (x >= 68 && x <= 71)
		{
			return 2.0F;
		}
		else if (x >= 64 && x <= 67)
		{
			return 1.5F;
		}
		else if (x >= 60 && x <= 63)
		{
			return 1.0F;
		}
		else
		{
			return 0F;
		}
	}
	public static int Main()
	{
		int i;
		int n;
		int[] cj = new int[50];
		int[] jd = new int[50];
		int jdsum = 0;
		float sum = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		//????
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				jd[i] = Integer.parseInt(tempVar2);
			}
		}

		//????
		for (i = 0; i < n; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				cj[i] = Integer.parseInt(tempVar3);
			}
		}

		//?????????
		for (i = 0; i < n; i++)
		{
			sum += GPA(cj[i]) * jd[i];
			jdsum += jd[i];
		}

		//????
		System.out.printf("%.2f", sum / jdsum);

		return 0;
	}
}

