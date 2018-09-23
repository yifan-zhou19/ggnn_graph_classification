package <missing>;

public class GlobalMembers
{
	// ???.cpp : Defines the entry point for the console application.
	//


	public static int Main()
	{
		int y = 0;
		int m = 0;
		int d = 0;
		int[] dd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n = 0;
		int i;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
		{
			dd[1] = 29;
		}

		for (i = 0;i < m - 1;i++)
		{
			n = n + dd[i];
		}

		n = n + d;
		System.out.printf("%d",n);
		return 0;
	}

}

