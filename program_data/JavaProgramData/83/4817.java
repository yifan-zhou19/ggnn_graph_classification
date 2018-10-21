package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m = 0;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		float[] c = new float[100];
		float s = 0F;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] >= 90)
			{
				s += a[i] * 4;
			}
			else if (b[i] >= 85)
			{
				s += a[i] * 3.7;
			}
			else if (b[i] >= 82)
			{
				s += a[i] * 3.3;
			}
			else if (b[i] >= 78)
			{
				s += a[i] * 3;
			}
			else if (b[i] >= 75)
			{
				s += a[i] * 2.7;
			}
			else if (b[i] >= 72)
			{
				s += a[i] * 2.3;
			}
			else if (b[i] >= 68)
			{
				s += a[i] * 2;
			}
			else if (b[i] >= 64)
			{
				s += a[i] * 1.5;
			}
			else if (b[i] >= 60)
			{
				s += a[i] * 1;
			}
			else
			{
				;
			}
		}
		for (i = 0;i < n;i++)
		{
			m += a[i];
		}
		s /= m;
		System.out.printf("%.2lf",s);
		return 0;
	}
}

