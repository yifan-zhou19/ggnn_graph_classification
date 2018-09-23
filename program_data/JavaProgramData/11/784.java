package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int sum;
		int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
		}
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
		a[1] = 29;
		}
		else
		{
		a[1] = 28;
		}
		sum = 0;
		for (i = 0;i < m;i++)
		{
		  sum = sum + a[i];
		}
		  sum = sum - a[i - 1] + d;
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
		return 0;
	}



}

