package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int y;
		int m;
		int d;
		int a;
		int n;
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
		if ((y % 4) == 0 && (y % 100) != 0 || (y % 400 == 0))
		{
			a = 1;
		}
		else
		{
			a = 0;
		}

		switch (m)
		{
			case 1:
				n = d;
				break;
			case 2:
				n = 31 + d;
				break;
			case 3:
				n = 31 + 28 + d;
				break;
			case 4:
				n = 31 + 28 + 31 + d;
				break;
			case 5:
				n = 31 + 28 + 31 + 30 + d;
				break;
			case 6:
				n = 31 + 28 + 31 + 30 + 31 + d;
				break;
			case 7:
				n = 31 + 28 + 31 + 30 + 31 + 30 + d;
				break;
			case 8:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + d;
				break;
			case 9:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + d;
				break;
			case 10:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + d;
				break;
			case 11:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + d;
				break;
			case 12:
				n = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + d;
				break;
		}

		if (a == 0)
		{
			System.out.printf("%d",n);
		}
		if (m != 1 && m != 2 && a == 1)
		{
			n = n + 1;
			System.out.printf("%d",n);
		}
		if (a == 1 && m == 1)
		{
			System.out.printf("%d",n);
		}
		if (a == 1 && m == 2)
		{
			System.out.printf("%d",n);
		}

	}


}

