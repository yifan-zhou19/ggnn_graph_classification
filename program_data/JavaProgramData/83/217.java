package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		float[] b = new float[10];
		int n;
		int i;
		int m;
		float GPA;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			if (m >= 90 && m <= 100)
			{
				b[i] = 4.0 * a[i];
			}
			else if (m >= 85 && m <= 89)
			{
				b[i] = 3.7 * a[i];
			}
			else if (m >= 82 && m <= 84)
			{
				b[i] = 3.3 * a[i];
			}
			else if (m >= 78 && m <= 81)
			{
				b[i] = 3.0 * a[i];
			}
			else if (m >= 75 && m <= 77)
			{
				b[i] = 2.7 * a[i];
			}
			else if (m >= 72 && m <= 74)
			{
				b[i] = 2.3 * a[i];
			}
			else if (m >= 68 && m <= 71)
			{
				b[i] = 2.0 * a[i];
			}
			else if (m >= 64 && m <= 70)
			{
				b[i] = 1.5 * a[i];
			}
			else if (m >= 60 && m <= 63)
			{
				b[i] = 1.0 * a[i];
			}
			else
			{
				b[i] = 0F;
			}
		}
		m = 0;
		GPA = 0F;
		for (i = 0;i <= n - 1;i++)
		{
			m = m + a[i];
			GPA = GPA + b[i];
		}
		GPA = GPA / m;
		System.out.printf("%.2f\n",GPA);
	}



}

