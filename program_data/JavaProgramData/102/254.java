package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[40];
		float[] b = new float[40];
		float t;
		char[][] c = new char[41][7];
		int i;
		int j;
		int n;
		int m;
		int N;
		n = 0;
		m = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= N; i++)
		{
			c[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (c[i][0] == 'm')
			{
				n++;
				a[n] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
			if (c[i][0] == 'f')
			{
				m++;
				b[m] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j < i; j++)
			{
				if (a[i] < a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 1; i <= m; i++)
		{
			for (j = 1; j < i; j++)
			{
				if (b[i] > b[j])
				{
					t = b[i];
					b[i] = b[j];
					b[j] = t;
				}
			}
		}
	   for (i = 1; i <= n; i++)
	   {
		   System.out.printf("%.2f", a[i]);
		   System.out.printf("%.2f", " ");
	   }
		for (i = 1; i <= m; i++)
		{
		   System.out.printf("%.2f", b[i]);
		   if (i != m)
		   {
			   System.out.printf("%.2f", " ");
		   }
		}
		return 0;
	}
}

