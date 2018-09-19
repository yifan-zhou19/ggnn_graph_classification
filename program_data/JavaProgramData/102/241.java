package <missing>;

public class GlobalMembers
{
	//xyx3.cpp : Defines the entry point for the console application.
	//

	///#include "stdafx.h"





	public static int Main()
	{
		int fnum = 0;
		int mnum = 0;
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		float temp;
		float[] fe = new float[50];
		float[] ma = new float[50];
		float height;
		float[] res = new float[50];
		char[][] xinbie = new char[50][10];
		for (i = 1; i <= num; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				xinbie[i] = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				height = Float.parseFloat(tempVar2);
			}
			if (xinbie[i][0] == 'f')
			{
				fnum += 1;
				fe[fnum] = height;
			}
			else
			{
				mnum += 1;
				ma[mnum] = height;
			}
		}


		for (i = fnum; i > 1; i--)
		{
			for (j = 1; j < i; j++)
			{
				if (fe[j] > fe[j + 1])
				{
					temp = fe[j];
					fe[j] = fe[j + 1];
					fe[j + 1] = temp;
				}
			}
		}
		for (i = mnum; i > 1; i--)
		{
			for (j = 1; j < i; j++)
			{
				if (ma[j] > ma[j + 1])
				{
					temp = ma[j];
					ma[j] = ma[j + 1];
					ma[j + 1] = temp;
				}
			}
		}

		String out = new String(new char[10]);
		for (i = 1; i <= mnum ; i++)
		{
			System.out.printf("%.2f ", ma[i]);
		}
		for (i = fnum; i >= 2; i--)
		{
			System.out.printf("%.2f ", fe[i]);
		}
		System.out.printf("%.2f", fe[1]);
	//	cin >> j;
		return 0;
	}


}

