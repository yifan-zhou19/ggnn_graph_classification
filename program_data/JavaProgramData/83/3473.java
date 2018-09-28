package <missing>;

public class GlobalMembers
{
	public static double score(int i)
	{
		double p;
		if (90 <= i != 0 && i <= 100)
		{
			p = 4.0;
		}
		if (85 <= i != 0 && i <= 89)
		{
			p = 3.7;
		}
		if (82 <= i != 0 && i <= 84)
		{
			p = 3.3;
		}
		if (78 <= i != 0 && i <= 81)
		{
			p = 3.0;
		}
		if (75 <= i != 0 && i <= 77)
		{
			p = 2.7;
		}
		if (72 <= i != 0 && i <= 74)
		{
			p = 2.3;
		}
		if (68 <= i != 0 && i <= 71)
		{
			p = 2.0;
		}
		if (64 <= i != 0 && i <= 67)
		{
			p = 1.5;
		}
		if (60 <= i != 0 && i <= 63)
		{
			p = 1.0;
		}
		if (i < 60)
		{
			p = 0.0;
		}
		return p;
	}
	public static void Main()
	{
		double gpa;
		gpa = 0;
		int n;
		int i;
		int[] nm = new int[10];
		int[] sc = new int[10];
		int s;
		s = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				nm[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sc[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			//printf("%.2lf\n",score(sc[i]));
			gpa = gpa + score(sc[i]) * nm[i];
			s = s + nm[i];
		}
		//printf("%.2f\n",gpa);
		//printf("%d\n",s);
		gpa = gpa / s;
		System.out.printf("%.2f\n",gpa);
	}
}

