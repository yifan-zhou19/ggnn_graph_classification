package <missing>;

public class GlobalMembers
{
	/* Name        : ?????
	 * Version     : 1.0
	 * Date        : 2013-01-12
	 * New         : 
	 * Description : 
	 * State       : Design
	 */
	public static int Main()
	{
		int N = 0;
		double[] Num = new double[300];
		double[] Diff = new double[300];
		double[] Extre = new double[300];
		double Average = 0;
		double Sum = 0;
		double Max = 0;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < N;i++)
		{
			Num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			Sum += Num[i];
		}
		Average = Sum / (double)N;
		for (int i = 0;i < N;i++)
		{
			Diff[i] = Num[i] - Average;
			if (Diff[i] < 0)
			{
				Diff[i] = -Diff[i];
			}
			if (Max < Diff[i])
			{
				Max = Diff[i];
			}
		}
		int K = 0;
		for (int i = 0;i < N;i++)
		{
			if (Diff[i] == Max)
			{
				Extre[K] = Num[i];
				K++;
			}
		}
		for (int i = 0;i < K;i++)
		{
			for (int k = 0;k < K - 1;k++)
			{
				if (Extre[k] > Extre[k + 1])
				{
					double temp = Extre[k];
					Extre[k] = Extre[k + 1];
					Extre[k + 1] = temp;
				}
			}
		}
		System.out.print(Extre[0]);
		for (int i = 1;i < K;i++)
		{
			System.out.print(',');
			System.out.print(Extre[i]);
		}
		return 0;
	}

}

