package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int year;
	int m1;
	int m2;
	int x = 0;
	int i;
	int m;
	int a;
	int b;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   year = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   m1 = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   m2 = Integer.parseInt(tempVar4);
	   }
		   if (m1 < m2)
		   {
			   a = m1;
			   b = m2;
		   }
		   else
		   {
			   a = m2;
		   b = m1;
		   }

	   if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	   {

		for (m = a;m < b;m++)
		{
		switch (m)
		{
		 case 1:
			 x += 31;
			 break;
		 case 3:
			 x += 31;
			 break;
		 case 5:
			 x += 31;
			 break;
		 case 7:
			 x += 31;
			 break;
		 case 8:
			 x += 31;
			 break;
		 case 10:
			 x += 31;
			 break;
		 case 12:
			 x += 31;
			 break;
		 case 2:
			 x += 29;
			 break;
		 default :
			 x += 30;
		}

		}

		if (x % 7 == 0)
		{
		 System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
		x = 0;
	   }
		else
		{
		for (m = a;m < b;m++)
		{
		switch (m)
		{
		 case 1:
			 x += 31;
			 break;
		 case 3:
			 x += 31;
			 break;
		 case 5:
			 x += 31;
			 break;
		 case 7:
			 x += 31;
			 break;
		 case 8:
			 x += 31;
			 break;
		 case 10:
			 x += 31;
			 break;
		 case 12:
			 x += 31;
		  break;
		 case 2:
			 x += 28;
		  break;
		 default :
			 x += 30;
		}

		}
	 if (x % 7 == 0)
	 {
		 System.out.print("YES\n");
	 }
	 else
	 {
		 System.out.print("NO\n");
		x = 0;
	 }
		}
	}
	return 0;
	}


}

