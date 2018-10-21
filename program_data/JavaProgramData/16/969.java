package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int x;
		int y;
		int z;
		int n;
		int b;
		int place;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		if (a > 9999)
		{
			place = 5;
		}
	if (a > 999)
	{
			place = 4;
	}
	else if (a > 999)
	{
			place = 4;
	}
	else if (a > 99)
	{
			place = 3;
	}
	else if (a > 9)
	{
			place = 2;
	}
	else
	{
		place = 1;
	}
		n = a / 1000;
		x = a / 100 % 10;
		y = a / 10 % 10;
		z = a % 10;
	switch (place)
	{
		case 5:
			System.out.print("00001");
			 break;
	case 4:
		System.out.printf("%d%d%d%d",z,y,x,n);
	 break;

	case 3:
		System.out.printf("%d%d%d",z,y,x);
	 break;

	case 2:
		System.out.printf("%d%d",z,y);
	 break;
	case 1:
		System.out.printf("%d",z);
	 break;

	}

	}

}

