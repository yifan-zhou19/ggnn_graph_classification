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
		int[] xf = new int[10];
		int[] chj = new int[10];
		int xh;
		float[] gpa = new float[10];
		float sum;
		float GPA;
		sum = 0F;
		xh = 0;
		for (i = 0;i <= n - 1;i++)
		{
			if (i == 0)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xf[i] = Integer.parseInt(tempVar2);
				}
			}
			else
			{
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					xf[i] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					chj[i] = Integer.parseInt(tempVar4);
				}
			}
			else
			{
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				chj[i] = Integer.parseInt(tempVar5);
			}
			}
			if (chj[i] <= 100 && chj[i] >= 90)
			{
				gpa[i] = 4.0F;
			}
			else if (chj[i] <= 89 && chj[i] >= 85)
			{
				gpa[i] = 3.7F;
			}
			else if (chj[i] <= 84 && chj[i] >= 82)
			{
				gpa[i] = 3.3F;
			}
			else if (chj[i] <= 81 && chj[i] >= 78)
			{
				gpa[i] = 3.0F;
			}
			else if (chj[i] <= 77 && chj[i] >= 75)
			{
				gpa[i] = 2.7F;
			}
			else if (chj[i] <= 74 && chj[i] >= 72)
			{
				gpa[i] = 2.3F;
			}
			else if (chj[i] <= 71 && chj[i] >= 68)
			{
				gpa[i] = 2.0F;
			}
			else if (chj[i] <= 67 && chj[i] >= 64)
			{
				gpa[i] = 1.5F;
			}
			else if (chj[i] <= 63 && chj[i] >= 60)
			{
				gpa[i] = 1.0F;
			}
			else
			{
				gpa[i] = 0F;
			}
		}

		for (i = 0;i <= n - 1;i++)
		{
			sum = sum + gpa[i] * xf[i];
			xh = xh + xf[i];
		}
		  GPA = sum / xh;
		  System.out.printf("%.2f", GPA);
		  return 0;
	}
}

