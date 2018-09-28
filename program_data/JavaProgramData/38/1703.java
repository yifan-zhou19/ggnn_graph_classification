package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double[] a = new double[100];
		double s = 0;
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;k > 0;k--)
		{
					 s = 0;
					 double[] p = a;
					 double ave = 0;
					 double sum = 0;
					 int n;
					 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					 for (int i = 0;i < n;i++)
					 {
							 p[i] = ConsoleInput.readToWhiteSpace(true);
							 ave += p[i];
					 }
					 ave /= n;
					 for (int i = 0;i < n;i++)
					 {
					 sum += (p[i] - ave) * (p[i] - ave);
					 }
					 s = Math.sqrt(sum / n);
					 System.out.printf("%.5f\n",s);
		}

		return 0;
	}

}

