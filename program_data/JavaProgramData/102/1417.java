package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		double h;
		double t;
		double[] f = new double[40];
		double[] m = new double[40];
		String sex = new String(new char[6]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int count1 = 0;
		int count2 = 0;
		for (i = 0;i < n;i++)
		{
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			h = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'f')
			{
				f[count1++] = h;
			}
			else
			{
				m[count2++] = h;
			}
		} //??count1?count2??????????????
		for (i = 0;i < count1 - 1;i++) //???????????,??
		{
			for (j = count1 - 1;j > i;j--)
			{
				if (f[j] > f[j - 1])
				{
					t = f[j];
					f[j] = f[j - 1];
					f[j - 1] = t;
				}
			}
		}
		for (i = 0;i < count2 - 1;i++) //???????????
		{
			for (j = count2 - 1;j > i;j--)
			{
				if (m[j] < m[j - 1])
				{
					t = m[j];
					m[j] = m[j - 1];
					m[j - 1] = t;
				}
			}
		}
		for (i = 0;i < count2;i++) //??????
		{
			System.out.printf("%.2f", m[i]);
			System.out.printf("%.2f", ' ');
		}
		for (i = 0;i < count1 - 1;i++) //??????
		{
			System.out.printf("%.2f", f[i]);
			System.out.printf("%.2f", ' ');
		}
		System.out.printf("%.2f", f[count1 - 1]);
		return 0;
	}
}

