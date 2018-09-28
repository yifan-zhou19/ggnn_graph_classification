package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		double[] A = new double[100];
		double ave;
		double s = 0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 0;j < k;j++)
		{
			s = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p=&A[0];
			double p = A[0];
			ave = 0;
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < n;i++)
			{
				A[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
				ave += A[i];
			}
			ave = ave / n;
			for (int i = 0;i < n;i++)
			{
				s += (A[i] - ave) * (A[i] - ave);

			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f", s);
			System.out.printf("%.5f", "\n");
		}
		return 0;
	}
}

