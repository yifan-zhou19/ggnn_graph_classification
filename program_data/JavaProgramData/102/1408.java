package <missing>;

public class GlobalMembers
{
	/*
	 * practice.cpp
	 *
	 *  Created on: 2014-1-4
	 *      Author: 111
	 */

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		float[] male = new float[100];
		float[] female = new float[100];
		int m = 0;
		int f = 0;
		for (int i = 1;i <= n;i++)
		{
			String sex = new String(new char[10]);
			float height;
			sex = ConsoleInput.readToWhiteSpace(true).charAt(0);
			height = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			if (sex.charAt(0) == 'm')
			{
				male[m] = height;
				m++;
			}
			else
			{
				female[f] = height;
				f++;
			}
		} //cout << m << endl << f << endl;
		for (int i = 0;i < m;i++)
		{
			for (int j = i + 1;j < m;j++)
			{
				if (male[i] > male[j])
				{
					float temp = male[i];
					male[i] = male[j];
					male[j] = temp;
				}
			}
		}

		for (int i = 0;i < f;i++)
		{
			for (int j = i + 1;j < f;j++)
			{
				if (female[i] < female[j])
				{
					float temp = female[i];
					female[i] = female[j];
					female[j] = temp;
				}
			}
		}
		System.out.printf("%.2f", male[0]);
		for (int i = 1;i < m;i++)
		{
			System.out.printf("%.2f", ' ');
			System.out.printf("%.2f", male[i]);
		}
		for (int i = 0;i < f;i++)
		{
			System.out.printf("%.2f", ' ');
			System.out.printf("%.2f", female[i]);
		}
		return 0;
	}

}

