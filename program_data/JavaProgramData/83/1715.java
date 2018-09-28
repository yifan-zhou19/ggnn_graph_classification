package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] score = new int[10];
	int[] grade = new int[10];
	int a = 0;
	int b = 0;
	double c = 0;
	double d = 0;
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			score[i] = Integer.parseInt(tempVar2);
		}
		a += score[i];
	}
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			grade[i] = Integer.parseInt(tempVar3);
		}
	if (90 <= grade[i])
	{
		c += score[i] * 4.0;
	}
	else if (85 <= grade[i])
	{
		c += score[i] * 3.7;
	}
	else if (82 <= grade[i])
	{
		c += score[i] * 3.3;
	}
	else if (78 <= grade[i])
	{
		c += score[i] * 3.0;
	}
	else if (75 <= grade[i])
	{
		c += score[i] * 2.7;
	}
	else if (72 <= grade[i])
	{
		c += score[i] * 2.3;
	}
	else if (68 <= grade[i])
	{
		c += score[i] * 2.0;
	}
	else if (64 <= grade[i])
	{
		c += score[i] * 1.5;
	}
	else if (60 <= grade[i])
	{
		c += score[i] * 1.0;
	}
	else
	{
		c += score[i] * 0;
	}
	}

	d = c / a;

	System.out.printf("%.2lf",d);
	return 0;
	}
}

