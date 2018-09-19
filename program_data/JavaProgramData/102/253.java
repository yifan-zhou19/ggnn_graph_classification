package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int malecount = 0;
		int femalecount = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float t;
		char[][] a = new char[41][6];
		float[] b = new float[41];
		float[] m = new float[41];
		float[] f = new float[41];
		int i;
		int j;
		for (i = 1 ; i <= n ; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (a[i][0] == 'm')
			{
				   malecount++;
				m[malecount] = b[i];
			}
			else
			{
				femalecount++;
				f[femalecount] = b[i];
			}
		}
		for (i = 1 ; i <= malecount - 1 ; i++)
		{
			for (j = 1 ; j <= malecount - i ; j++)
			{
				if (m[j] > m[j + 1])
				{
					t = m[j];
					m[j] = m[j + 1];
					m[j + 1] = t;
				}
			}
		}
		for (i = 1 ; i <= femalecount - 1 ; i++)
		{
			for (j = 1 ; j <= femalecount - i ; j++)
			{
				if (f[j] < f[j + 1])
				{
					t = f[j];
					f[j] = f[j + 1];
					f[j + 1] = t;
				}
			}
		}
		System.out.printf("%.2f", m[1]);
		for (i = 2 ; i <= malecount ; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", m[i]);
		}
		for (i = 1 ; i <= femalecount ; i++)
		{
			System.out.printf("%.2f", " ");
			System.out.printf("%.2f", f[i]);
		}
		return 0;
	}
}

