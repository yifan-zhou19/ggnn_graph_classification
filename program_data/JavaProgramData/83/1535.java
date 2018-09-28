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
		float[] course = new float[10];
		float[] jidian = new float[10];
		float sum = 0F;
		float ave = 0F;
		int[] mark = new int[10];
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				course[i] = Float.parseFloat(tempVar2);
			}

		}

		for (i = 1;i <= n;i++)
		{
			sum += course[i];
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				mark[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{

			if (mark[i] >= 90 && mark[i] <= 100)
			{
				jidian[i] = 4.0F;
			}
			else if (mark[i] >= 85 && mark[i] <= 89)
			{
				jidian[i] = 3.7F;
			}
			else if (mark[i] >= 82 && mark[i] <= 84)
			{
				jidian[i] = 3.3F;
			}
			else if (mark[i] >= 78 && mark[i] <= 81)
			{
				jidian[i] = 3.0F;
			}
			else if (mark[i] >= 75 && mark[i] <= 77)
			{
				jidian[i] = 2.7F;
			}
			else if (mark[i] >= 72 && mark[i] <= 74)
			{
				jidian[i] = 2.3F;
			}
			else if (mark[i] >= 68 && mark[i] <= 71)
			{
				jidian[i] = 2.0F;
			}
			else if (mark[i] >= 64 && mark[i] <= 67)
			{
				jidian[i] = 1.5F;
			}
			else if (mark[i] >= 60 && mark[i] <= 63)
			{
				jidian[i] = 1.0F;
			}
			else
			{
				jidian[i] = 0F;
			}

		}

		for (i = 1;i <= n;i++)
		{
			ave += course[i] * jidian[i] / sum;
		}
		System.out.printf("%.2f",ave);
		return 0;






	}
}

