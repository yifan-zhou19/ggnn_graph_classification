package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[][] a = new int[2][10];
		float m;
		float k;
		float s;
		float GPA;
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
				a[0][i] = Integer.parseInt(tempVar2);
			}
		}
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[1][j] = Integer.parseInt(tempVar3);
			}
		}
		for (s = 0F,k = 0F,i = 0;i < n;i++)
		{
			if (a[1][i] >= 90)
			{
				m = a[0][i] * 4.0;
			}
			else if (a[1][i] >= 85)
			{
				m = a[0][i] * 3.7;
			}
			else if (a[1][i] >= 82)
			{
				m = a[0][i] * 3.3;
			}
			else if (a[1][i] >= 78)
			{
				m = a[0][i] * 3.0;
			}
			else if (a[1][i] >= 75)
			{
				m = a[0][i] * 2.7;
			}
			else if (a[1][i] >= 72)
			{
				m = a[0][i] * 2.3;
			}
			else if (a[1][i] >= 68)
			{
				m = a[0][i] * 2.0;
			}
			else if (a[1][i] >= 64)
			{
				m = a[0][i] * 1.5;
			}
			else if (a[1][i] >= 60)
			{
				m = a[0][i] * 1.0;
			}
			else
			{
				m = 0F;
			}
			s = s + m;
			k = k + a[0][i];
		}
		GPA = s / k;
		System.out.printf("%.2f\n",GPA);

	}


}

