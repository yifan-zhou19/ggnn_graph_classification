package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int[] score = new int[10];
		int i;
		int[] grade = new int[10];
		int zongfen = 0;
	double zong = 0;
	double[] jidian = new double[10];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n - 1;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		grade[i] = Integer.parseInt(tempVar2);
	}
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		grade[n - 1] = Integer.parseInt(tempVar3);
	}
	for (i = 0;i < n - 1;i++)
	{
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		score[i] = Integer.parseInt(tempVar4);
	}
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		score[n - 1] = Integer.parseInt(tempVar5);
	}
	for (i = 0;i < n;i++)
	{
		if (90 <= score[i] != 0 && score[i] <= 100)
		{
			jidian[i] = 4.0 * grade[i];
		}
		else if (85 <= score[i] != 0 && score[i] <= 89)
		{
			jidian[i] = 3.7 * grade[i];
		}
		else if (82 <= score[i] != 0 && score[i] <= 84)
		{
			jidian[i] = 3.3 * grade[i];
		}
		else if (78 <= score[i] != 0 && score[i] <= 81)
		{
			jidian[i] = 3.0 * grade[i];
		}
		else if (75 <= score[i] != 0 && score[i] <= 77)
		{
			jidian[i] = 2.7 * grade[i];
		}
		else if (72 <= score[i] != 0 && score[i] <= 74)
		{
			jidian[i] = 2.3 * grade[i];
		}
		else if (68 <= score[i] != 0 && score[i] <= 71)
		{
			jidian[i] = 2.0 * grade[i];
		}
		else if (64 <= score[i] != 0 && score[i] <= 67)
		{
			jidian[i] = 1.5 * grade[i];
		}
		else if (60 <= score[i] != 0 && score[i] <= 63)
		{
			jidian[i] = 1.0 * grade[i];
		}
		else if (score[i] < 60)
		{
			jidian[i] = 0 * grade[i];
		}
		zong += jidian[i];
		zongfen += grade[i];
	}
	double GPA = zong / zongfen;
	System.out.printf("%.2lf\n",GPA);



	}

}

