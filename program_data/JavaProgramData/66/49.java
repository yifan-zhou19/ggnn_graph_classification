package <missing>;

public class GlobalMembers
{
	public static int days(int n)
	{
		int i;
		int sum = 0;
		for (i = 1;i < n;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
			sum = sum + 2; //366%7==2,????????????
			}
			else
			{
				sum++; //??,365%7==1,?????1
			}
		}
		return sum;
	}
	public static int Main()
	{
		int y;
		int m;
		int d;
		int i;
		int totaldays = 0;
			int w;
		int[] k = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

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
		if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
		{
			k[1] = 29;
		}
		y %= 400;
		if (y == 0)
		{
			y = 400;
		}
		for (i = 0;i < m - 1;i++)
		{
				totaldays = totaldays + k[i];
		}
			totaldays = totaldays + d + days(y);

			w = totaldays % 7;
			switch (w)
			{
				  case 0:
					   System.out.print("Sun.");
					   break;
				  case 1:
					   System.out.print("Mon.");
					   break;
				  case 2:
					   System.out.print("Tue.");
					   break;
				  case 3:
					   System.out.print("Wed.");
					   break;
				case 4:
					  System.out.print("Thu.");
						break;
				case 5:
					  System.out.print("Fri.");
						break;
				case 6:
					  System.out.print("Sat.");
						break;
			}
		return 0;
	}
}

