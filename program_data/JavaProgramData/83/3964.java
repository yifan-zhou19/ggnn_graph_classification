package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int sum = 0;
		int i;
		int j;
		int k;
		int m;
		double SUM;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		int[] credit = new int[ECO];
		int[] point = new int[ECO];
		double[] gpa = new double[ECO];
		for (i = 0;i < a;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(credit[i]) = Integer.parseInt(tempVar2);
			}
			sum = sum + credit[i];

		}
		for (j = 0;j < a;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(point[j]) = Integer.parseInt(tempVar3);
			}
		}
		for (k = 0;k < a;k++)
		{
			if (point[k] >= 90)
			{
				gpa[k] = 4.0 * credit[k];
			}
			else if (point[k] >= 85)
			{
				gpa[k] = 3.7 * credit[k];
			}
			else if (point[k] >= 82)
			{
				gpa[k] = 3.3 * credit[k];
			}
			else if (point[k] >= 78)
			{
				gpa[k] = 3.0 * credit[k];
			}
			else if (point[k] >= 75)
			{
				gpa[k] = 2.7 * credit[k];
			}
			else if (point[k] >= 72)
			{
				gpa[k] = 2.3 * credit[k];
			}
			else if (point[k] >= 68)
			{
				gpa[k] = 2.0 * credit[k];
			}
			else if (point[k] >= 64)
			{
				gpa[k] = 1.5 * credit[k];
			}
			else if (point[k] >= 60)
			{
				gpa[k] = 1.0 * credit[k];
			}
			else
			{
				gpa[k] = 0 * credit[k];
			}
		}
		for (m = 0,SUM = 0;m < a;m++)
		{
			SUM = SUM + gpa[m];
		}
		System.out.printf("%.2lf",1.0 * SUM / sum);
		return 0;
	}

}

