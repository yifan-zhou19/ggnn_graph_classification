package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
	 int i;
	 int a;
	 long total;
	 long sum;
	 int[] N = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  year = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  month = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  day = Integer.parseInt(tempVar3);
			  }
			 a = year - 1;
			 total = (long)a * 365 + a / 4 + a / 400 - a / 100;
			 // printf("total is %lld\n",total);    
		sum = 0;
	 for (i = 1;i < month;i++)
	 {
	  sum = sum + N[i - 1];
	 }
		if (((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) && month >= 3)
		{
			 sum = sum + 1;
		}
	 sum = sum + day + total - 1;
	 //printf("sum is %lld\n",sum);
		   if (sum % 7 == 0)
		   {
			   System.out.print("Mon.");
		   }
		else if (sum % 7 == 1)
		{
			System.out.print("Tue.");
		}
		else if (sum % 7 == 2)
		{
			System.out.print("Wed.");
		}
		else if (sum % 7 == 3)
		{
			System.out.print("Thu.");
		}
		else if (sum % 7 == 4)
		{
			System.out.print("Fri.");
		}
		else if (sum % 7 == 5)
		{
			System.out.print("Sat.");
		}
	else if (sum % 7 == 6)
	{
		System.out.print("Sun.");
	}
	return 0;
	}
}

