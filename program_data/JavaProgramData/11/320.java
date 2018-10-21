package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Y;
		int M;
		int D;
		int x;
		int y = 0;
		int i;
		int[] a = new int[12];
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			D = Integer.parseInt(tempVar3);
		}
		a[0] = 31;
		a[2] = 31;
		a[4] = 31;
		a[6] = 31;
		a[7] = 31;
		a[9] = 31;
		a[11] = 31;
		a[3] = 30;
		a[5] = 30;
		a[8] = 30;
		a[10] = 30;
		if (Y % 4 != 0)
		{
		a[1] = 28;
		}
		else if (Y % 4 == 0 && Y % 100 != 0)
		{
		a[1] = 29;
		}
		else if (Y % 4 == 0 && Y % 100 == 0 && Y % 400 == 0)
		{
		a[1] = 29;
		}
		else
		{
			a[1] = 28;
		}
	  for (i = 1; i <= M; i++)
	  {
		 x = a[M - i];
		y = y + x;
	  }
	 sum = y + D - a[M - 1];
		System.out.printf("%d", sum);
		return 0;
	}



}

