package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int m = 0;
	int g;
	int k;
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
		for (int i = 1;i < b;i++)
		{
			if (i == 2)
			{
					 if (a % 400 == 0 || (a % 100 != 0 && a % 4 == 0))
					 {
													  m += 29;
					 }
					 else
					 {
						  m += 28;
					 }
			}
			else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				m += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				m += 30;
			}
		}
		 k = a - 1;
		 m = m + c + k * 1 + k / 4 + k / 400 - k / 100;
		 g = m % 7;
		 switch (g)
		 {
		 case 0:
		 {
			 System.out.print("Sun.");
			 break;
		 }
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
			 System.out.print("Wen.");
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
		 }


	return 0;
	}


}

