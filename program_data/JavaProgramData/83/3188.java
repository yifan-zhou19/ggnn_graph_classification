package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] xf = new int[10];
		int[] cj = new int[10];
		int n;
		int i = 0;
		int r = 0;
		int a = 0;
		double gpa = 0;
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
				(xf[i]) = Integer.parseInt(tempVar2);
			}
			a += xf[i];
		}
		for (r = 0;r < n;r++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(cj[r]) = Integer.parseInt(tempVar3);
			}
			if (cj[r] >= 90 && cj[r] <= 100)
			{
				gpa += 4.0 * xf[r];
			}
			else if (cj[r] <= 89 && cj[r] >= 85)
			{
				gpa += 3.7 * xf[r];
			}
			else if (cj[r] >= 82 && cj[r] <= 84)
			{
				  gpa += 3.3 * xf[r];
			}
			else if (cj[r] >= 78 && cj[r] <= 81)
			{
				  gpa += 3.0 * xf[r];
			}
			else if (cj[r] >= 75 && cj[r] <= 77)
			{
				  gpa += 2.7 * xf[r];
			}
			else if (cj[r] >= 72 && cj[r] <= 74)
			{
				  gpa += 2.3 * xf[r];
			}
			else if (cj[r] >= 68 && cj[r] <= 71)
			{
				  gpa += 2.0 * xf[r];
			}
			else if (cj[r] >= 64 && cj[r] <= 67)
			{
				  gpa += 1.5 * xf[r];
			}
			else if (cj[r] >= 60 && cj[r] <= 63)
			{
				  gpa += 1.0 * xf[r];
			}
			else
			{
				gpa += 0;
			}

		}
			gpa = gpa / a;

			System.out.printf("%.2lf",gpa);
			return 0;
	}



}

