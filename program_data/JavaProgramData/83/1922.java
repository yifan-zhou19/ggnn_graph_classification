package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[10];
	int[] score = new int[10];
	double[] jidian = new double[10];
	double sumxuefen;
	double sumjidian;
	int n;
	int xuefen;
	int s;

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (xuefen = 0;xuefen < n;xuefen++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[xuefen] = Integer.parseInt(tempVar2);
		}
		sumxuefen += sz[xuefen];
	}
	for (s = 0;s < n;s++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			score[s] = Integer.parseInt(tempVar3);
		}

	}
	for (s = 0;s < n;s++)
	{
		if ((90 <= score[s]) && (score[s] <= 100))
		{
			jidian[s] = 4.0;
		}
		else if ((85 <= score[s]) && (score[s] <= 89))
		{
			jidian[s] = 3.7;
		}
		else if ((82 <= score[s]) && (score[s] <= 84))
		{
			jidian[s] = 3.3;
		}
		else if ((78 <= score[s]) && (score[s] <= 81))
		{
			jidian[s] = 3.0;
		}
		else if ((75 <= score[s]) && (score[s] <= 77))
		{
			jidian[s] = 2.7;
		}
		else if ((72 <= score[s]) && (score[s] <= 74))
		{
			jidian[s] = 2.3;
		}
		else if ((68 <= score[s]) && (score[s] <= 71))
		{
			jidian[s] = 2.0;
		}
		else if ((64 <= score[s]) && (score[s] <= 67))
		{
			jidian[s] = 1.5;
		}
		else if ((60 <= score[s]) && (score[s] <= 63))
		{
			jidian[s] = 1.0;
		}
		else if (score[s] < 60)
		{
			jidian[s] = 0;
		}
		sumjidian += jidian[s] * sz[s];
	}
	double GPA;
	GPA = sumjidian / sumxuefen;
	System.out.printf("%.2lf",GPA);


	return 0;
	}





}

