int leap = int;
int main()
{
	int[] total = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334, 365};
	int y1;
	int y2;
	int m1;
	int m2;
	int d1;
	int d2;
	int sum = 0;
	int j;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		y1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		m1 = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		d1 = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		y2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		m2 = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		d2 = Integer.parseInt(tempVar6);
	}

	if (y1 == y2)
	{
			 if (leap(y1) == 0)
			 {
				 sum += total[m2 - 1] - total[m1 - 1] + d2 - d1;
			 }
			 if (leap(y1) == 1 && m2 > 2)
			 {
				 sum += total[m2 - 1] - total[m1 - 1] + d2 - d1 + 1;
			 }
	}

	if (y2 > y1)
	{
	   for (j = y1 + 1;j < y2;j++)
	   {
		  if (leap(j) == 1)
		  {
			  sum += 366;
		  }
		  else if (leap(j) == 0)
		  {
			  sum += 365;
		  }
	   }
	   if (leap(y1) == 0)
	   {
		   sum += 365 - total[m1 - 1] - d1;
	   }
	   else if (leap(y1) == 1 && m1 <= 2)
	   {
		   sum += 365 - total[m1 - 1] - d1 + 1;
	   }

	   if (leap(y2) == 0)
	   {
		   sum += total[m2 - 1] + d2;
	   }
	   else if (leap(y2) == 1 && m2 > 2)
	   {
		   sum += total[m2 - 1] + d2 + 1;
	   }
	}

	System.out.printf("%d",sum);
	return 0;
}

int leap(int y)
{
	int j;
	if (y % 400 == 0 || y % 100 != 0 && y % 4 == 0)
	{
		j = 1;
	}
	else
	{
		j = 0;
	}
	return j;
}

