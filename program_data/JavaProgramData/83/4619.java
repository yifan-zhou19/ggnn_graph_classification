package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int[][] course = new int[15][2];
	public static int credit;
	public static float GPA;
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		credit = 0;
		for (i = 0; i < N; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				course[i][0] = Integer.parseInt(tempVar2);
			}
			credit += course[i][0];
		}
		for (i = 0; i < N; i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				course[i][1] = Integer.parseInt(tempVar3);
			}
		}

		for (i = 0; i < N; i++)
		{
			float point;
			if (course[i][1] >= 90)
			{
				point = 4F;
			}
			else if (course[i][1] >= 85)
			{
				point = 3.7F;
			}
			else if (course[i][1] >= 82)
			{
				point = 3.3F;
			}
			else if (course[i][1] >= 78)
			{
				point = 3.0F;
			}
			else if (course[i][1] >= 75)
			{
				point = 2.7F;
			}
			else if (course[i][1] >= 72)
			{
				point = 2.3F;
			}
			else if (course[i][1] >= 68)
			{
				point = 2.0F;
			}
			else if (course[i][1] >= 64)
			{
				point = 1.5F;
			}
			else if (course[i][1] >= 60)
			{
				point = 1.0F;
			}
			else
			{
				point = 0F;
			}
			GPA += course[i][0] * point;
		}
		GPA /= credit;
		System.out.printf("%.2f\n",GPA);

		return 0;
	}

}

