package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int run = 0;
		int[] M = new int[13];
		int i;
		int D;
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
		D = d;
		if ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)))
		{
			run = 1;
		}
		else
		{
			run = 0;
		}
		for (i = 1;i < 13;i++)
		{
			switch (i)
			{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				M[i] = 31;
				break;
			default:
				M[i] = 30;
			}
		}
		if (run == 1)
		{
			M[2] = 29;
		}
		else
		{
			M[2] = 28;
		}
		for (i = 1;i < m;i++)
		{
			D = D + M[i];
		}
		System.out.printf("%d",D);
		return 0;
	}
}

