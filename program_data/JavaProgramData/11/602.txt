package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
	int d;
	int y;
	int i;
	int m;
	int s = 0;
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

	if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
	{
		if (m == 1 || m == 2)
		{
		 s = a[m - 1] + d;
		}
		else
		{
			s = a[m - 1] + d + 1;
		}
	}
	else
	{
	s = a[m - 1] + d;
	}






		System.out.printf("%d",s);
		return 0;
	}
}

