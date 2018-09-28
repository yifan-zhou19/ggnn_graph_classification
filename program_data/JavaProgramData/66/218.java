package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int q;
		int i;
		int j;
		int s = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		int[] x = new int[12];
		x[0] = 31;
		x[2] = 31;
		x[3] = 30;
		x[5] = 30;
		x[4] = 31;
		x[6] = 31;
		x[7] = 31;
		x[8] = 30;
		x[10] = 30;
		x[9] = 31;
		x[11] = 31;
		if (a <= 2000)
		{
			for (i = 1;i < a;i++)
			{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				d = d + 1;
			}
			}
		s = (a - 1 - d) * 365 + d * 366;
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			x[1] = 29;
		}
		else
		{
			x[1] = 28;
		}
		}
		else
		{
			a = a % 2000;
			for (i = 1;i < a;i++)
			{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				d = d + 1;
			}
			}
		s = (a - 1 - d) * 365 + d * 366;
		if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
		{
			x[1] = 29;
		}
		else
		{
			x[1] = 28;
		}
		}

		for (j = 0;j < b - 1;j++)
		{
			s = s + x[j];
		}
		s = s + c;
		q = s % 7;
		switch (q)
		{
		case 0:
			System.out.print("Sun.\n");
			break;
		case 1:
			System.out.print("Mon.\n");
			break;
		case 2:
			System.out.print("Tue.\n");
			break;
		case 3:
			System.out.print("Wed.\n");
			break;
		case 4:
			System.out.print("Thu.\n");
			break;
		case 5:
			System.out.print("Fri.\n");
			break;
		case 6:
			System.out.print("Sat.\n");
			break;
		}
		return 0;
	}

}

