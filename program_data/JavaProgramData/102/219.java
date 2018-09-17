package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int s = 0;
		int t = 0;
		float temp;
		float[] m = new float[10000];
		float[] f = new float[10000];
		String tempchar = new String(new char[10]);
		for (i = 0;i < n;i++)
		{
			tempchar = ConsoleInput.readToWhiteSpace(true).charAt(0);
			if (tempchar.charAt(0) == 'm')
			{
				m[s++] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
			else
			{
				f[t++] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0;i < s - 1;i++)
		{
			for (j = s - 1;j > i;j--)
			{
				if (m[j] < m[j - 1])
				{
					temp = m[j];
					m[j] = m[j - 1];
					m[j - 1] = temp;
				}
			}
		}

		for (i = 0;i < t - 1;i++)
		{
			for (j = t - 1;j > i;j--)
			{
				if (f[j] > f[j - 1])
				{
					temp = f[j];
					f[j] = f[j - 1];
					f[j - 1] = temp;
				}
			}
		}
		for (i = 0;i < s;i++)
		{
			System.out.printf("%.2f",m[i]);
			System.out.print(' ');
		}
		for (i = 0;i < t - 1;i++)
		{
			System.out.printf("%.2f",f[i]);
			System.out.print(' ');
		}
		System.out.printf("%.2f",f[i]);
		return 0;
	}


}

