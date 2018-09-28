package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
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
		int sum1 = 0;
		int sum2 = 0;
		int sum;
		int i;
		sum1 = (a - 1) / 4 - (a - 1) / 100 + (a - 1) / 400 + a - 1;
		for (i = 1;i < b;i++)
		{
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		   {
				sum2 += 3;
		   }
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum2 += 2;
			}
			else if (i == 2)
			{
						 if (a % 400 == 0 || (a % 4 == 0 && a % 100 != 0))
						 {
							   sum2 += 1;
						 }
						 else
						 {
							   sum2 += 0;
						 }
			}
		}
		sum = sum1 + sum2 + c;
		int x;
		x = sum % 7;
		switch (x)
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
				break;
		}
		return 0;
	}
}

