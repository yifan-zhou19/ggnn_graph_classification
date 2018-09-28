package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int k;
		int t;
		int[][] a = new int[2][10];
		float sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < 2;k++)
		{
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[k][i] = Integer.parseInt(tempVar2);
			}
		}
		}

		sum = 0F;
		for (i = 0;i < n;i++)
		{
			if (a[1][i] <= 100 && a[1][i] >= 90)
			{
				sum = sum + 4.0 * a[0][i];
			}
			else if (a[1][i] <= 89 && a[1][i] >= 85)
			{
				sum = sum + 3.7 * a[0][i];
			}
			else if (a[1][i] <= 84 && a[1][i] >= 82)
			{
				sum = sum + 3.3 * a[0][i];
			}
			else if (a[1][i] <= 81 && a[1][i] >= 78)
			{
				sum = sum + 3.0 * a[0][i];
			}
			else if (a[1][i] <= 77 && a[1][i] >= 75)
			{
				sum = sum + 2.7 * a[0][i];
			}
			else if (a[1][i] <= 74 && a[1][i] >= 72)
			{
				sum = sum + 2.3 * a[0][i];
			}
			else if (a[1][i] <= 71 && a[1][i] >= 68)
			{
				sum = sum + 2.0 * a[0][i];
			}
		   else if (a[1][i] <= 67 && a[1][i] >= 64)
		   {
				sum = sum + 1.5 * a[0][i];
		   }
			else if (a[1][i] <= 63 && a[1][i] >= 60)
			{
				sum = sum + 1.0 * a[0][i];
			}
		else if (a[1][i] <= 60)
		{
				sum = sum;
		}
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
			t = t + a[0][i];
		}
		sum = sum / t;
		System.out.printf("%.2f",sum);
	}


}

