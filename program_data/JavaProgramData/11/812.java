package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int s = 0;
		int[] a = new int[12];
		int i;
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
		if ((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0))
		{
		a[1] = 29;
		}
		else
		{
		a[1] = 28;
		}
		a[0] = a[2] = a[4] = a[6] = a[7] = a[9] = a[11] = 31;
		a[3] = a[5] = a[8] = a[10] = 30;
		for (i = 0;i < m - 1;i++)
		{
			s = s + a[i];
		}
		s = s + d;
		System.out.printf("%d",s);
	}

}

