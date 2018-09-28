package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		double[] c = new double[MAX];
		int t;
		double s;
		double GPA;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			if (b[i] >= 90)
			{
				c[i] = 4.0;
			}
			else if (b[i] >= 85 && b[i] < 90)
			{
				c[i] = 3.7;
			}
			else if (b[i] >= 82 && b[i] < 85)
			{
				c[i] = 3.3;
			}
			else if (b[i] >= 78 && b[i] < 82)
			{
				c[i] = 3.0;
			}
			else if (b[i] >= 75 && b[i] < 78)
			{
				c[i] = 2.7;
			}
			else if (b[i] >= 72 && b[i] < 75)
			{
				c[i] = 2.3;
			}
			else if (b[i] >= 68 && b[i] < 72)
			{
				c[i] = 2.0;
			}
			else if (b[i] >= 64 && b[i] < 68)
			{
				c[i] = 1.5;
			}
			else if (b[i] >= 60 && b[i] < 64)
			{
				c[i] = 1.0;
			}
			else
			{
				c[i] = 0;
			}
		}
			s = 0;
			t = 0;
			for (i = 0;i < n;i++)
			{
				s = s + a[i] * c[i];
			}
			for (i = 0;i < n;i++)
			{
				t = t + a[i];
			}
			GPA = s / t;
			System.out.printf("%.2lf\n",GPA);
			return 0;
	}

}

