package <missing>;

public class GlobalMembers
{
	// work2 1.cpp : Defines the entry point for the console application.
	//

	///#include "stdafx.h"


	public static void Main(String[] args)
	{
		int n;
		int[] arr = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int j;

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				arr[i] = Integer.parseInt(tempVar2);
			}
		}

		int t;
		int k = 0;

		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (arr[i] < arr[j])
				{
				t = arr[i];
				arr[i] = arr[j];
				arr[j] = t;
	//			for (k=0;k<n;i++) {
	//		printf("%d  ",arr[i]);
	//	}
				}
			}
		}

		for (i = 0;i < 2;i++)
		{
			System.out.printf("%d\n",arr[i]);
		}
	}

}

