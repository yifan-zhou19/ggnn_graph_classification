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
		if (b == 1)
		{
			System.out.printf("%d",c);
		}
		if ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0))
		{
			switch (b)
			{
		case 2 :
		{
			System.out.printf("%d",31 + c);
			break;
		}
		case 3:
		{
		   System.out.printf("%d",31 + 29 + c);
		   break;
		}
		case 4:
		{
		   System.out.printf("%d",31 + 29 + 31 + c);
		   break;
		}
		case 5:
		{
				  System.out.printf("%d",31 + 29 + 31 + 30 + c);
				  break;
		}
		case 6:
		{
					   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + c);
					   break;
		}
		case 7:
		{
						   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + c);
						   break;
		}
		case 8:
		{
							   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + c);
							   break;
		}
		case 9:
		{
								   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + c);
								   break;
		}
		case 10:
		{
									   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c);
									   break;
		}
		case 11:
		{
										   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c);
										   break;
		}
		case 12:
		{
											   System.out.printf("%d",31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c);
											   break;
		}
			}
		}
			else
			{
		 switch (b)
		 {
			case 2:
			{
			System.out.printf("%d",31 + c);
			break;
			}
		   case 3:
		   {
		   System.out.printf("%d",31 + 28 + c);
		   break;
		   }
			case 4:
			{
			   System.out.printf("%d",31 + 28 + 31 + c);
			   break;
			}
			case 5:
			{
			 System.out.printf("%d",31 + 28 + 31 + 30 + c);
			 break;
			}
			case 6:
			{
			 System.out.printf("%d",31 + 28 + 31 + 30 + 31 + c);
			 break;
			}
			case 7:
			{
			System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + c);
			break;
			}
			case 8:
			{
			System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + c);
			break;
			}
			case 9:
			{
			System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + c);
			break;
			}
							case 10:
							{
									   System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + c);
									   break;
							}
							case 11:
							{
										   System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + c);
										   break;
							}
							case 12:
							{
											   System.out.printf("%d",31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + c);
											   break;
							}
		 }
			}
		return 0;
	}
}

