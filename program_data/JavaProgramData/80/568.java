package <missing>;

public class GlobalMembers
{
	public static int countyear(int a,int b)
	{
					int i;
					int t;
					t = 365 * (b - a - 1);
		for (i = a + 1;i < b;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				t += 1;
			}
		}
			return t;
	}





	public static int countday(int a,int b,int c)
	{
		int t;
		switch (b)
		{
		  case 1:
			  if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			  {
				   t = 366 - c + 1;
			  }
			   else
			   {
				   t = 365 - c + 1;
			   }
			   break;
		  case 2:
			  if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			  {
				   t = 366 - 31 - c + 1;
			  }
			   else
			   {
				   t = 365 - 31 - c + 1;
			   }
			   break;
		  case 3:
			  t = 31 - c + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 1;
			  break;
		  case 4:
			  t = 30 - c + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 1;
			  break;
		  case 5:
			  t = 31 - c + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 1;
			  break;
		  case 6:
			  t = 30 - c + 31 + 30 + 31 + 30 + 31 + 31 + 1;
			  break;
		  case 7:
			  t = 31 - c + 31 + 30 + 31 + 30 + 31 + 1;
			  break;
		  case 8:
			  t = 31 - c + 31 + 30 + 31 + 30 + 1;
			  break;
		  case 9:
			  t = 30 - c + 31 + 30 + 31 + 1;
			  break;
		  case 10:
			  t = 31 - c + 31 + 30 + 1;
			  break;
		  case 11:
			  t = 30 - c + 31 + 1;
			  break;
		  case 12:
			  t = 31 - c + 1;
			  break;
		  default:
			  break;
		}
		return t;
	}
	public static void Main()
	{

		int[] year = new int[2];
		int[] month = new int[2];
		int[] day = new int[2];
		int sum;
		int a;
		int b;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day[0] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year[1] = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month[1] = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day[1] = Integer.parseInt(tempVar6);
		}
		if (year[0] == year[1])
		{
			sum = countday(year[0], month[0], day[0]);
			a = countday(year[1], month[1], day[1]);
			sum = sum - a;
		}
		else
		{
			sum = countyear(year[0], year[1]);
			a = countday(year[0], month[0], day[0]);
			b = countday(year[1], month[1], day[1]);

			if ((year[1] % 4 == 0 && year[1] % 100 != 0) || (year[1] % 400 == 0))
			{
				b = 366 - b;
			}
			else
			{
				b = 365 - b;
			}
			sum += (a + b);
		}
		System.out.printf("%d\n",sum);
	}



}

