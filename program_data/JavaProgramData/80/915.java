package <missing>;

public class GlobalMembers
{
	/*?? 
	???????????????. 
	??2010-1-1?2010-1-3 ???2?? 
	
	year=1,2,...,3000. 
	
	??? 
	????(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)? 
	???2???29??
	 
	???? 
	??? 
	startYear startMonth startDay 
	??? 
	endYear endMonth endDay
	 
	???? 
	???????????????? */
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int j;
	  int k;
	  int l;
	  int sum = 0;
	  int[] y = new int[3000];
	  int s1 = 0;
	  int s2 = 0;
	  int d1;
	  int d2;

	  int i1;
	  int i2;
	  int i3;
	  int i4;
	  int i5;
	  int i;
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
		  j = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead();
	  if (tempVar5 != null)
	  {
		  k = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead();
	  if (tempVar6 != null)
	  {
		  l = Integer.parseInt(tempVar6);
	  }
		 for (i1 = a;i1 <= j;i1++)
		 {
			   if ((i1 % 4 == 0 && i1 % 100 != 0) || (i1 % 400 == 0))
			   {
				 y[i1] = 366;
			   }
			   else
			   {
				 y[i1] = 365;
			   }
		 }
		 if (y[a] == 365)
		 {
			 for (i = b;i >= 1;i--)
			 {
				 if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				 {
					 s1 = s1 + 31;
				 }
				  if (i == 4 || i == 6 || i == 9 || i == 11)
				  {
					 s1 = s1 + 30;
				  }
				  if (i == 2)
				  {
					  s1 = s1 + 28;
				  }
			 }
		 }
	if (y[a] == 366)
	{
			 for (i2 = k;i2 >= 1;i2--)
			 {
				 if (i2 == 1 || i2 == 3 || i2 == 5 || i2 == 7 || i2 == 8 || i2 == 10 || i2 == 12)
				 {
					 s1 = s1 + 31;
				 }
				  if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11)
				  {
					 s1 = s1 + 30;
				  }
				  if (i2 == 2)
				  {
					  s1 = s1 + 29;
				  }
			 }
	}



	   if (y[j] == 365)
	   {
			 for (i3 = k;i3 >= 1;i3--)
			 {
				 if (i3 == 1 || i3 == 3 || i3 == 5 || i3 == 7 || i3 == 8 || i3 == 10 || i3 == 12)
				 {
					 s2 = s2 + 31;
				 }
				  if (i3 == 4 || i3 == 6 || i3 == 9 || i3 == 11)
				  {
					 s2 = s2 + 30;
				  }
				  if (i3 == 2)
				  {
					  s2 = s2 + 28;
				  }
			 }
	   }
	if (y[j] == 366)
	{
			 for (i4 = k;i4 >= 1;i4--)
			 {
				 if (i4 == 1 || i4 == 3 || i4 == 5 || i4 == 7 || i4 == 8 || i4 == 10 || i4 == 12)
				 {
					 s2 = s2 + 31;
				 }
				  if (i4 == 4 || i4 == 6 || i4 == 9 || i4 == 11)
				  {
					 s2 = s2 + 30;
				  }
				  if (i4 == 2)
				  {
					  s2 = s2 + 29;
				  }
			 }
	}

		 d1 = c;
		 d2 = l;
		 for (i5 = a;i5 < j;i5++)
		 {
			 sum = sum + y[i5];
		 }
		 if (sum + d2 + s2 - s1 - d1 < 36500)
		 {
		 System.out.printf("%d",sum + d2 + s2 - s1 - d1);
		 }
		 else
		 {
		 System.out.printf("%d",sum + d2 + s2 - s1 - d1 + 1);
		 }
				  return 0;
	}

}

