package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int k;
		int s;
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
		if ((a % 4 == 0 && a % 10 != 0) || (a % 400 == 0))
		{
			switch (b)
			{
				   case 1:
				   {
						  k = 0;
						  break;
				   }
				  case 2:
				  {
						  k = 31;
						  break;
				  }
				  case 3:
				  {
						  k = 60;
						  break;
				  }
				  case 4:
				  {
						  k = 91;
						  break;
				  }
				  case 5:
				  {
						  k = 121;
						  break;
				  }
				   case 6:
				   {
						  k = 152;
						  break;
				   }
				   case 7:
				   {
						  k = 182;
						  break;
				   }
					case 8:
					{
						  k = 213;
						  break;
					}
					case 9:
					{
						  k = 244;
						  break;
					}
					case 10:
					{
						  k = 274;
						  break;
					}
					 case 11:
					 {
						  k = 305;
						  break;
					 }
					 case 12:
					 {
						  k = 335;
						  break;
					 }

			}
		}
		else
		{
			switch (b)
			{
				   case 1:
				   {
						  k = 0;
						  break;
				   }
				  case 2:
				  {
						  k = 31;
						  break;
				  }
				  case 3:
				  {
						  k = 59;
						  break;
				  }
				  case 4:
				  {
						  k = 90;
						  break;
				  }
				  case 5:
				  {
						  k = 120;
						  break;
				  }
				   case 6:
				   {
						  k = 151;
						  break;
				   }
				   case 7:
				   {
						  k = 181;
						  break;
				   }
					case 8:
					{
						  k = 212;
						  break;
					}
					case 9:
					{
						  k = 243;
						  break;
					}
					case 10:
					{
						  k = 273;
						  break;
					}
					 case 11:
					 {
						  k = 304;
						  break;
					 }
					 case 12:
					 {
						  k = 334;
						  break;
					 }

			}
		}

		   s = k + c;
		   System.out.printf("%d\n",s);


		return 0;
	}

}

