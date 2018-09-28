package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int dd;
		int ak = 0;
		int i;
		int ans;
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
			dd = Integer.parseInt(tempVar3);
		}
		for (i = 1 ; i <= 400 ; i++)
		{
		  if (i % 4 != 0)
		  {
			  ak = (ak + 365) % 7;
		  }
		   else
		   {
			if (i % 400 == 0 || i % 100 != 0)
			{
				ak = (ak + 366) % 7;
			}
			 else
			 {
				 ak = (ak + 365) % 7;
			 }
		   }
		}
		ans = (y - 1) / 400 * ak % 7;
		y %= 400;
		if (y == 0)
		{
			y = 400;
		}
		ak = ans;
		for (i = 1 ; i < y ; i++)
		{
		  if (i % 4 != 0)
		  {
			  ak = (ak + 365) % 7;
		  }
		   else
		   {
			if (i % 400 == 0 || i % 100 != 0)
			{
				ak = (ak + 366) % 7;
			}
			 else
			 {
				 ak = (ak + 365) % 7;
			 }
		   }
		}
		  ans = ak;
		  int j;
		  int d = 0;
		 for (j = 1 ; j < m ; j++)
		 {
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
				{
					d += 31;
				}
				if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					d += 30;
				}

				if (j == 2)
				{
				if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
				{
					d += 29;
				}
				else
				{
					d += 28;
				}
				}
		 }
			d += dd;
			ans += d;
			ans %= 7;
		switch (ans)
		{
			case 0 :
				System.out.print("Sun.");
				break;
		case 1 :
			System.out.print("Mon.");
			break;
		case 2 :
			System.out.print("Tue.");
			break;
		case 3 :
			System.out.print("Wen.");
			break;
		case 4 :
			System.out.print("Thu.");
			break;
		case 5 :
			System.out.print("Fri.");
			break;
		case 6 :
			System.out.print("Sat.");
			break;
		}

		return 0;
	}

}

