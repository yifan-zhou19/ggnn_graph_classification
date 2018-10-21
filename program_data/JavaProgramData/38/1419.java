package <missing>;

public class GlobalMembers
{
	//???????????
	public static int Main()
	{
		int k;
		int n;
		int i;
		int j;
		double[] x = new double[1000];
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p;
		double p;
		double average;
		double s;
		p = x[0];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			s = 0.0;
			average = 0.0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < n;j++)
			{
				*(p + j) = ConsoleInput.readToWhiteSpace(true);
				average += (*(p + j)) / n; //???
			}
			for (j = 0;j < n;j++)
			{
				s += ((*(p + j)) - average) * ((*(p + j)) - average) / n;
			}
			s = Math.sqrt(s); //???
			System.out.printf("%.5f\n", s);
		}
		return 0;
	}
}

