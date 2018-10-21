package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < k;i++)
		{
			int n;
			int j;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			double[] a = new double[110];
			double aver;
			double s = 0.0;
			double x = 0.0;
			for (j = 0;j < n;j++)
			{
				a[j] = ConsoleInput.readToWhiteSpace(true);
				x = x + a[j];
			}
			aver = x / n;
		//	cout<<aver<<endl;

			for (j = 0;j < n;j++)
			{
				s = s + (a[j] - aver) * (a[j] - aver);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5lf\n",s);
				System.out.print("\n");
		}
		return 0;
	}



}

