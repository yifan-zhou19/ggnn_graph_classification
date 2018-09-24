package <missing>;

public class GlobalMembers
{
	//
	//  main.c
	//  ????
	//
	//  Created by ?  on 12-12-30.
	//  Copyright (c) 2012? ? . All rights reserved.
	//


	public static int Main()
	{
		int n;
		int m;
		int i;
		double[] a = new double[100];
		double ave;
		double sum;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		double * p;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			p = a;
			sum = 0;
			s = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (;p < n + a;p++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					p = Double.parseDouble(tempVar3);
				}
				sum = sum + *p;
			}
			ave = sum / n;
			p = a;
			for (;p < n + a;p++)
			{
				s = s + (ave - *p) * (ave - *p);
			}
			s = s / n;
			s = Math.sqrt(s);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

