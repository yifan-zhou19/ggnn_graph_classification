package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int d;
		int y;
		int m;
		int k;
		int x;
		String[] a = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
		int[] m1 = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365, 0};
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
		x = y % 2800 - 1;
		k = x * 365 + m1[m] + y / 4 + x / 400 - y / 100 + d;
		k = k % 7;
		System.out.printf("%s",a[k]);

		return 0;
	}
}

