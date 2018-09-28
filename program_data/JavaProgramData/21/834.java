package <missing>;

public class GlobalMembers
{
	/*
	 * sub.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: 11229
	 */

	/*
	 * ?????.cpp
	 *
	 *  Created on: 2011-12-23
	 *      Author: 11229
	 */
	public static void sort(double[] arr, int len)
	{
		double[] pa = arr;
		double temp = 0;
		int i;
		int j;
		for (i = 0;i < len - 1;i++)
		{
			for (j = 0;j < len - i - 1;j++)
			{
				if (pa[j] > pa[j + 1])
				{
					temp = pa[j];
					pa[j] = (pa + j + 1);
					pa[j + 1] = temp;
				}
			}
		}
		for (i = 0;i < len - 1;i++)
		{
			System.out.print((pa + i));
			System.out.print(',');
		}
		System.out.print((pa + len - 1));
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		int imax = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double sum = 0;
		double[] array = new double[301];
		double average = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *p=null;
		double p = null;
		double[] distant = new double[301];
		double[] pdis = distant;
		double MAXdis = 0;
		double[] maxnum = new double[100];
		double[] pmax = maxnum;
		p = array;
		for (i = 0;i < n;i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
			sum += *(p + i);
		}
		average = sum / (double)(n);
		for (i = 0;i < n;i++)
		{
			pdis[i] = Math.abs(*(p + i) - average);
			if (pdis[i] > MAXdis)
			{
				MAXdis = pdis[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (pdis[i] == MAXdis)
			{
				pmax[imax] = (p + i);
				imax++;
			}
		}
		sort(maxnum, imax);
		return 0;
	}


}

