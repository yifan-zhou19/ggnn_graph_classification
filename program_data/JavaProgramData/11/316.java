package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if ((a % 100 != 0 && a / 4 == 0) || a % 400 == 0)
		{
		  switch (b)
		  {
		  case 1:
			  System.out.printf("%d",c);
			  break;
		  case 2:
			  System.out.printf("%d",d = 31 + c);
			  break;
		  case 3:
			  System.out.printf("%d",d = 60 + c);
			  break;
		  case 4:
			  System.out.printf("%d",d = 91 + c);
			  break;
		  case 5:
			  System.out.printf("%d",d = 121 + c);
			  break;
		  case 6:
			  System.out.printf("%d",d = 152 + c);
			  break;
		  case 7:
			  System.out.printf("%d",d = 182 + c);
			  break;
		  case 8:
			  System.out.printf("%d",d = 213 + c);
			  break;
		  case 9:
			  System.out.printf("%d",d = 244 + c);
			  break;
		  case 10:
			  System.out.printf("%d",d = 274 + c);
			  break;
		  case 11:
			  System.out.printf("%d",d = 305 + c);
			  break;
		  case 12:
			  System.out.printf("%d",d = 335 + c);
			  break;
		  }
		}
		else
		{
			switch (b)
			{
			case 1:
				System.out.printf("%d",c);
				break;
			case 2:
				System.out.printf("%d",d = 31 + c);
				break;
			case 3:
				System.out.printf("%d",d = 59 + c);
				break;
			case 4:
				System.out.printf("%d",d = 90 + c);
				break;
			case 5:
				System.out.printf("%d",d = 120 + c);
				break;
			case 6:
				System.out.printf("%d",d = 151 + c);
				break;
			case 7:
				System.out.printf("%d",d = 181 + c);
				break;
			case 8:
				System.out.printf("%d",d = 212 + c);
				break;
			case 9:
				System.out.printf("%d",d = 243 + c);
				break;
			case 10:
				System.out.printf("%d",d = 273 + c);
				break;
			case 11:
				System.out.printf("%d",d = 304 + c);
				break;
			case 12:
				System.out.printf("%d",d = 334 + c);
				break;
			}
		}
	 return 0;
	}


}

