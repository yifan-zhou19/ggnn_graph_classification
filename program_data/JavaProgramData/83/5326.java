package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] xf = new int[MAX];
		int[] df = new int[MAX];
		int i;
		int a;
	double[] jd = new double[MAX];
	double b;
	double GPA;
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
				xf[i] = Integer.parseInt(tempVar2);
			}
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
				jd[i] = 4.0;
			}
		 if (df[i] >= 85 && df[i] <= 89)
		 {
			 jd[i] = 3.7;
		 }
		 if (df[i] >= 82 && df[i] <= 84)
		 {
			 jd[i] = 3.3;
		 }
		 if (df[i] >= 78 && df[i] <= 81)
		 {
			 jd[i] = 3.0;
		 }
		 if (df[i] >= 75 && df[i] <= 77)
		 {
			 jd[i] = 2.7;
		 }
		 if (df[i] >= 72 && df[i] <= 74)
		 {
			 jd[i] = 2.3;
		 }
		 if (df[i] >= 68 && df[i] <= 71)
		 {
			 jd[i] = 2.0;
		 }
		 if (df[i] >= 64 && df[i] <= 67)
		 {
			 jd[i] = 1.5;
		 }
		 if (df[i] >= 60 && df[i] <= 63)
		 {
			 jd[i] = 1.0;
		 }
		 if (df[i] >= 0 && df[i] < 60)
		 {
			 jd[i] = 0.0;
		 }
	}
	a = 0;
				 for (i = 0;i < n;i++)
				 {
					 a = a + xf[i];
				 }
	b = 0.0;
					for (i = 0;i < n;i++)
					{
						b = b + 1.0 * xf[i] * jd[i];
					}
	GPA = b / a;
	System.out.printf("%.2f",GPA);
	return 0;
	}
}

