package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		double[] a = new double[1001];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p=null;
		double p = null;
		double s = 0;
		double ss = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			p = a;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < m;j++)
			{
				*(p + j) = ConsoleInput.readToWhiteSpace(true);
				s += *(p + j);
			}
			s /= m;
			for (j = 0;j < m;j++)
			{
				ss += Math.pow(*(p + j) - s,2);
			}
			ss /= m;
			ss = Math.sqrt(ss);
			System.out.printf("%.5lf\n",ss);
			s = 0;
			ss = 0;
		}
		return 0;
	}
}

