package <missing>;

public class GlobalMembers
{
	//
	//  main.cpp
	//  ????
	//
	//  Created by ???? on 13-12-25.
	//  Copyright (c) 2013? ????. All rights reserved.
	//

	public static int Main()
	{
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct dis
	//	{
	//		int x;
	//		int y;
	//		double dis;
	//	}
	//	a[2000];

		double[][] num = new double[2000][2];
		double max = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			num[i][0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			num[i][1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}

		int t = 1;

		for (int i = 1;i <= n;i++)
		{
				for (int j = i;j <= n;j++)
				{
						a[t].x = i;
						a[t].y = j;
						a[t].dis = Math.sqrt((num[i][0] - num[j][0]) * (num[i][0] - num[j][0]) + (num[i][1] - num[j][1]) * (num[i][1] - num[j][1]));
						t++;
						//cout<<a[t].dis<<endl;
				}
		}

		for (int i = 1;i < n * n;i++)
		{
			if (a[i].dis >= max)
			{
				max = a[i].dis;
			}
			//cout<<max;
		}

		System.out.printf("%.4f\n",max);


		return 0;
	}

}

