package <missing>;

public class GlobalMembers
{
	public static int after(int x)
	{
		int y;
		int sum;
		int z;
		int m;
		y = (x - 1) / 400;
		m = (x - 1) / 100;
		z = (x - 1) / 4;
		sum = x - 1 + z - m + y;
		return sum;
	}
	public static int date(int x,int y,int z)
	{
		 int sum = 0;
		 int i;
		 if (y == 1)
		 {
			 sum = z;
		 }
		 else
		 {
			 for (i = 1;i < y;i++)
			 {
				 if (i == 1 || i == 3 || i == 7 || i == 5 || i == 8 || i == 10 || i == 12)
				 {
					 sum += 31;
				 }
				 if (i == 4 || i == 6 || i == 9 || i == 11)
				 {
					 sum += 30;
				 }
				 if (i == 2)
				 {
					 if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
					 {
						 sum += 29;
					 }
					 else
					 {
						 sum += 28;
					 }
				 }
			 }
			 sum += z;
		 }
		 return sum;
	}
	public static int Main()
	{
		int a;
		int b;
		int c;
		int year;
		int day;
		int result;
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
		year = after(a);
		day = date(a, b, c);
		result = (year + day) % 7;
		switch (result)
		{
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
		case 0:
			System.out.print("Sun.");
		}
		return 0;
	}

}

