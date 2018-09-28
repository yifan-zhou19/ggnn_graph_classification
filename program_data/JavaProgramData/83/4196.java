package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int n;
		int i;
		int s;
		int xfh = 0;
		double jd;
		double jdh = 0;
		double gpa;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			xfh += a[i];
		}
		for (s = 0;s < n;s++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[s] = Integer.parseInt(tempVar3);
			}
			if ((b[s] <= 100) && (b[s] >= 90))
			{
				jd = 4.0 * a[s];
			}
			else if ((b[s] <= 89) && (b[s] >= 85))
			{
				jd = 3.7 * a[s];
			}
			else if ((b[s] <= 84) && (b[s] >= 82))
			{
				jd = 3.3 * a[s];
			}
			else if ((b[s] <= 81) && (b[s] >= 78))
			{
				jd = 3.0 * a[s];
			}
			else if ((b[s] <= 77) && (b[s] >= 75))
			{
				jd = 2.7 * a[s];
			}
			else if ((b[s] <= 74) && (b[s] >= 72))
			{
				jd = 2.3 * a[s];
			}
			else if ((b[s] <= 71) && (b[s] >= 68))
			{
				jd = 2.0 * a[s];
			}
			else if ((b[s] <= 67) && (b[s] >= 64))
			{
				jd = 1.5 * a[s];
			}
			else if ((b[s] <= 63) && (b[s] >= 60))
			{
				jd = 4.0 * a[s];
			}
			else
			{
				jd = 0.0;
			}
			jdh += jd;
		}
		gpa = jdh / xfh;
		System.out.printf("%.2lf",gpa);
		return 0;
	}
}

