package <missing>;

public class GlobalMembers
{
	public static double fun(int x)
	{

		if (x >= 90)
		{
			return 4.0;
		}
		if (x >= 85)
		{
			return 3.7;
		}
		if (x >= 82)
		{
			return 3.3;
		}
		if (x >= 78)
		{
			return 3.0;
		}
		if (x >= 75)
		{
			return 2.7;
		}
		if (x >= 72)
		{
			return 2.3;
		}
		if (x >= 68)
		{
			return 2.0;
		}
		if (x >= 64)
		{
			return 1.5;
		}
		if (x >= 60)
		{
			return 1.0;
		}
		return 0;
	}
	public static int Main()
	{
	  int n;
	  int i;
	  int[] course = new int[10];
	  int[] grade = new int[10];
	  int[] mark = new int[10];
	  double jdsum = 0;
	  int csum = 0;
	  double[] jd = new double[10];
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
				 course[i] = Integer.parseInt(tempVar2);
			 }
		csum += course[i];
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mark[i] = Integer.parseInt(tempVar3);
			}
		 jd[i] = fun(mark[i]);
		 jdsum += course[i] * jd[i];
		}
		 GPA = 1.0 * jdsum / csum;
		 System.out.printf("%.2lf",GPA);


		return 0;
	}
}

