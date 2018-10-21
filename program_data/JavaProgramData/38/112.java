package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[] len = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * q = 0;
		double[] s = new double[101];
		double[] a = new double[101];
		double[] sum = new double[101];
		double[] qsum = new double[101];
		double[] p = new double[1000];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < k; i++)
		{
			len[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			q = p;
			for (; q < p + len[i]; q++)
			{
				*q = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				sum[i] += *q;
				qsum[i] += (*q) * (*q);
			}
			a[i] = sum[i] / len[i];
			qsum[i] -= len[i] * a[i] * a[i];
			s[i] = Math.sqrt(qsum[i] / len[i]);
			System.out.printf("%.5f", s[i]);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

