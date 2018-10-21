package <missing>;

public class GlobalMembers
{
	// ????.cpp : ??????????????
	//
	///#include "stdafx.h"

	public static int Main()
	{
	//int _tmain(int argc, _TCHAR* argv[])
		int k;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int t = 0;t < k;t++)
		{
		double[] a = new double[100];
		double sum = 0.0;
		double arr;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
			sum += a[i];
		}

		arr = sum / n;
		sum = 0.0;
		for (int i = 0;i < n;i++)
		{
			sum += (a[i] - arr) * (a[i] - arr);
		}
		sum = Math.sqrt(sum / n);
//C++ TO JAVA CONVERTER TODO TASK: The cout 'showpoint' manipulator is not converted by C++ to Java Converter:
//ORIGINAL LINE: cout<<fixed<<showpoint<<setprecision(5)<<sum<<"\n";
		System.out.printf("%.5f", sum);
		System.out.printf("%.5f", "\n");
		}
		return 0;
	}


}

