package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int geshu(int c);
	public static int Main()
	{
		String a = new String(new char[number]);
		char ch1;
		char ch2;
		char max1;
		char max2;
		String tmp = new String(new char[100003]);
		int k;
		int m;
		int n;
		int[] sz = new int[number];
		int[] sz1 = new int[number];
		int i;
		int j;
		int b;
		double[] high = new double[100];
		double[] high2 = new double[100];
		double mc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		m = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				high[m] = Double.parseDouble(tempVar3);
			}
			if (a.charAt(0) == 'f')
			{
				high2[k] = high[m];
				k++;
				m--;
			}
			m++;
		}

		for (j = 0;j < m - 1;j++)
		{
			for (b = 0;b < m - j - 1;b++)
			{
				if (high[b] > high[b + 1])
				{
					mc = high[b];
					high[b] = high[b + 1];
					high[b + 1] = mc;
				}
			}
		}

		for (j = 0;j < k - 1;j++)
		{
			for (b = 0;b < k - j - 1;b++)
			{
				if (high2[b] < high2[b + 1])
				{
					mc = high2[b];
					high2[b] = high2[b + 1];
					high2[b + 1] = mc;
				}
			}
		}


		for (i = 0;i < m;i++)
		{
			System.out.printf("%.2lf ", high[i]);
		}
		for (i = 0;i < k;i++)
		{
			if (i == k - 1)
			{
				System.out.printf("%.2lf", high2[i]);
			}
			else
			{
				System.out.printf("%.2lf ", high2[i]);
			}
		}
		return 0;
	}

}

