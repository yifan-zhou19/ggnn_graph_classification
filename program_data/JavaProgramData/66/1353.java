package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int s = 0;
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
		if (m >= 2)
		{
		for (int i = 1;i < m;i++)
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
		 {
				 s = s + 31;
				 break;
		 }
		 case 2:
		 {
				 if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
				 {
					 s = s + 29;
				 }
				 else
				 {
					 s = s + 28;
				 }
				 break;
		 }
		 default:
		 {
				 s = s + 30;
				 break;
		 }
		  }
		}
		}
		  s = (d + s) % 7;
		  int q;
		  q = (y - 1) / 4 - (y - 1) / 100 + (y - 1) / 400;
		  s = s + 2 * q + (y - q - 1);

		  int a = s % 7;
		  switch (a)
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
		  }
		  return 0;
	}




}

