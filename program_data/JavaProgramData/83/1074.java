package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] score = new int[10];
		int i;
		int n;
		double[] a = new double[10];
		double sum = 0;
		double SUM = 0;
		double GPA;
		double t = 0;
		double p;
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
				a[i] = Double.parseDouble(tempVar2);
			}
			SUM += a[i];
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			score[i] = Integer.parseInt(tempVar3);
		}
		if (90 <= score[i])
		{
			p = 4.0;
		}
		else if (85 <= score[i])
		{
			p = 3.7;
		}
		else if (82 <= score[i])
		{
			p = 3.3;
		}
		else if (78 <= score[i])
		{
			p = 3.0;
		}
		else if (75 <= score[i])
		{
			p = 2.7;
		}
		else if (72 <= score[i])
		{
			p = 2.3;
		}
		else if (68 <= score[i])
		{
			p = 2.0;
		}
		else if (64 <= score[i])
		{
			p = 1.5;
		}
		else if (60 <= score[i])
		{
			p = 1.0;
		}
			else
			{
			p = 0;
			}
		t = p * a[i];
		sum += t;
		}
		GPA = (double)sum / SUM;
		System.out.printf("%.2lf",GPA);
		return 0;
	}


}

