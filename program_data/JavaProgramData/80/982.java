package <missing>;

public class GlobalMembers
{
	public static void date(tangible.RefObject<Integer> year, tangible.RefObject<Integer> month, tangible.RefObject<Integer> day)
	{
	  if (month.argValue == 1 || month.argValue == 3 || month.argValue == 5 || month.argValue == 7 || month.argValue == 8 || month.argValue == 10 || month.argValue == 12)
	  {
			  day.argValue++;
			  if (day.argValue > 31)
			  {
				  day.argValue = 1;
				  month.argValue++;
			  }
			  if (month.argValue > 12)
			  {
				  month.argValue = 1;
				  year.argValue++;
			  }
	  }
	  else if (month.argValue == 4 || month.argValue == 6 || month.argValue == 9 || month.argValue == 11)
	  {
			 day.argValue++;
			 if (day.argValue > 30)
			 {
				 day.argValue = 1;
				 month.argValue++;
			 }
	  }
	  else if ((year.argValue % 4 == 0 && year.argValue % 100 != 0) || (year.argValue % 400 == 0))
	  {
			 day.argValue++;
			 if (day.argValue > 29)
			 {
				 day.argValue = 1;
				 month.argValue++;
			 }
	  }
	  else
	  {
			day.argValue++;
			if (day.argValue > 28)
			{
				day.argValue = 1;
				month.argValue++;
			}
	  }
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
		int x;
		int y;
		int z;
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
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			x = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			y = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			z = Integer.parseInt(tempVar6);
		}
		int i = 0;
		for (i = 0;a != x || b != y || c != z;date(a, b, c), i++)
		{
			;
		}
		System.out.printf("%d",i);

		/*int a=2008,b=4 ,c=1;
		date(&a,&b,&c);
		printf("%d %d %d",a,b,c);*/
	}
}

