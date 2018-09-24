package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int h = 0;
		int i = 0;
		int j = 0;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] x = new char[n][10];
		float[] a = new float[n];
		float[] m = new float[n];
		float[] f = new float[n];
		float t;
		do
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Float.parseFloat(tempVar3);
			}
			i = i + 1;
		} while (i < n);
		i = 0;
		do
		{
			if (x[i][0] == 'm')
			{
				m[j] = a[i];
				j = j + 1;
			}
			else
			{
				f[k] = a[i];
				k = k + 1;
			}
			i = i + 1;
		} while (i < n);
		for (h = 0;h < j - 1;h++)
		{
			for (i = 0;i < j - 1 - h;i++)
			{
				if (m[i] > m[i + 1])
				{
					t = m[i];
					m[i] = m[i + 1];
					m[i + 1] = t;
				}
			}
		}
		for (h = 0;h < k - 1;h++)
		{
			for (i = 0;i < k - 1 - h;i++)
			{
				if (f[i] < f[i + 1])
				{
					t = f[i];
					f[i] = f[i + 1];
					f[i + 1] = t;
				}
			}
		}
		System.out.printf("%.2f",m[0]);
		if (j > 1)
		{
			i = 1;
			do
			{
			System.out.printf(" %.2f",m[i]);
			i = i + 1;
			} while (i < j);
		}
		i = 0;
		do
		{
			System.out.printf(" %.2f",f[i]);
			i = i + 1;
		} while (i < k);
	}





}

