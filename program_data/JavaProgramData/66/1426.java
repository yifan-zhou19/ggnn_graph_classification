package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		int j;
		int k = 0;
		int a;
		int b;
		int c;
		int num = 0;
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
		m = a / 400;
		a = a % 400;
		if (a == 0)
		{
			num += 5;
		}
		for (i = 1;i < a;i++)
		{
			if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
			{
				num += 2;
			}
			else
			{
				num += 1;
			}
		}
		for (j = 1;j < b;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
			{
				num += 3;
			}
			if (j == 2)
			{
				if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
				{
				num += 1;
				}
			else
			{
				num += 0;
			}
			}
			if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				num += 2;
			}
		}
		num += c;
		k = num % 7;
		switch (k)
		{
		case 1:
		{
				System.out.print("Mon.");
				break;
		}
		case 2:
		{
				System.out.print("Tue.");
				break;
		}
		case 3:
		{
				System.out.print("Wed.");
				break;
		}
		case 4:
		{
				System.out.print("Thu.");
				break;
		}
		case 5:
		{
				System.out.print("Fri.");
				break;
		}
		case 6:
		{
				System.out.print("Sat.");
				break;
		}
		case 0:
		{
				System.out.print("Sun.");
				break;
		}
		}
		return 0;
	}
}

