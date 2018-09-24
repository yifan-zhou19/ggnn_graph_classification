package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int y;
		int m;
		int d;
		int s;

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
		if (((y % 4 == 0) && (y % 100 > 0)) || (y % 400 == 0))
		{
			a[2] = 29;
		}
		  else
		  {
			  a[2] = 28;
		  }

		a[1] = 31;
		a[3] = 31;
		a[5] = 31;
		a[7] = 31;
		a[8] = 31;
		a[10] = 31;
		a[12] = 31;
		a[4] = 30;
		a[6] = 30;
		a[9] = 30;
		a[11] = 30;
		s = 0;
		for (i = 1;i < m;i++)
		{
		  s = s + a[i];
		}
		s = s + d;
		System.out.printf("%d\n",s);
		return 0;
	}


}

