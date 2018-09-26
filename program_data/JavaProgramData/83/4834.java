package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int[][] a = new int[3][10];
		float gpa;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1,x = 0;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[1][i] = Integer.parseInt(tempVar2);
			}
			x = x + a[1][i];
		}
		for (i = 1,gpa = 0F;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[2][i] = Integer.parseInt(tempVar3);
			}
			if (a[2][i] >= 90)
			{
				gpa = gpa + 4.0 * a[1][i];
			}
			else if (a[2][i] >= 85)
			{
				gpa = gpa + 3.7 * a[1][i];
			}
			else if (a[2][i] >= 82)
			{
				gpa = gpa + 3.3 * a[1][i];
			}
			else if (a[2][i] >= 78)
			{
				gpa = gpa + 3.0 * a[1][i];
			}
			else if (a[2][i] >= 75)
			{
				gpa = gpa + 2.7 * a[1][i];
			}
			else if (a[2][i] >= 72)
			{
				gpa = gpa + 2.3 * a[1][i];
			}
			else if (a[2][i] >= 68)
			{
				gpa = gpa + 2.0 * a[1][i];
			}
			else if (a[2][i] >= 64)
			{
				gpa = gpa + 1.5 * a[1][i];
			}
			else if (a[2][i] >= 60)
			{
				gpa = gpa + 1.0 * a[1][i];
			}

		}
		gpa = gpa / x;
		System.out.printf("%.2f",gpa);

	}
}

