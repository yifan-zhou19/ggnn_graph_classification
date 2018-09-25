package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] c = new int[100];
		int[] x = new int[100];
		int i;
		int k;
		int sum = 0;
		double[] j = new double[100];
		double gpa = 0;
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
				x[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (c[i] <= 100 && c[i]>89)
			{
				j[i] = 4.0;
			}
			else if (c[i] <= 89 && c[i]>84)
			{
				j[i] = 3.7;
			}
			else if (c[i] <= 84 && c[i]>81)
			{
				j[i] = 3.3;
			}
			else if (c[i] <= 81 && c[i]>77)
			{
				j[i] = 3.0;
			}
			else if (c[i] <= 77 && c[i]>74)
			{
				j[i] = 2.7;
			}
			else if (c[i] <= 74 && c[i]>71)
			{
				j[i] = 2.3;
			}
									else if (c[i] <= 71 && c[i]>67)
									{
										j[i] = 2.0;
									}
									else if (c[i] <= 67 && c[i]>63)
									{
										j[i] = 1.5;
									}
									else if (c[i] <= 63 && c[i]>59)
									{
										j[i] = 1.0;
									}
									else
									{
										j[i] = 0;
									}
									gpa += (double)j[i] * x[i];
									sum += x[i];
		}
		GPA = gpa / sum;
		System.out.printf("%.2lf",GPA);
	}

}

