package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : ex5.4.cpp
	// Author      : Zhang Yu
	// Version     :
	// Copyright   : Your copyright notice
	// Description : ?????
	//============================================================================


	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] num = new double[n];
		double sum = 0;
		for (int i = 0;i <= n - 1;++i)
		{
			num[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			sum += num[i];
		}
		double average = sum / n;
		double[] men = new double[n];
		for (int i = 0;i <= n - 1;++i)
		{
			men[i] = -1;
		}
		double deltamax = 0;
		for (int i = 0;i <= n - 1;++i)
		{
			if (deltamax < Math.abs(average - num[i]))
			{
				deltamax = Math.abs(average - num[i]);
			}
		}
		int k = 0;
		for (int i = 0;i <= n - 1;++i)
		{
			if (deltamax == Math.abs(average - num[i]))
			{
				men[k++] = num[i];
			}
		}
		sort(men,men + k);
		for (int i = 0;i <= k - 1;++i)
		{
			if (i == 0)
			{
				System.out.print(men[i]);
			}
			else
			{
				System.out.print(",");
				System.out.print(men[i]);
			}
		}
		return 0;
	}

}

