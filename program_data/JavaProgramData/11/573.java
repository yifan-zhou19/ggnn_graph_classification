package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int answer;
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
	 if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
	 {
	  switch (month)
	  {
	  case 1:
		  answer = day;
		  break;
	  case 2:
		  answer = 31 + day;
		  break;
	  case 3:
		  answer = 31 + 29 + day;
		  break;
	  case 4:
		  answer = 31 + 29 + 31 + day;
		  break;
	  case 5:
		  answer = 31 + 29 + 31 + 30 + day;
		  break;
	  case 6:
		  answer = 31 + 29 + 31 + 30 + 31 + day;
		  break;
	  case 7:
		  answer = 31 + 29 + 31 + 30 + 31 + 30 + day;
		  break;
	  case 8:
		  answer = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
		  break;
	  case 10:
		  answer = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		  break;
	  case 11:
		  answer = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		  break;
	  case 12:
		  answer = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		  break;
	  }
	 System.out.printf("%d\n",answer);
	 }
	 else
	 {
		 switch (month)
		 {
	  case 1:
		  answer = day;
		  break;
	  case 2:
		  answer = 31 + day;
		  break;
	  case 3:
		  answer = 31 + 28 + day;
		  break;
	  case 4:
		  answer = 31 + 28 + 31 + day;
		  break;
	  case 5:
		  answer = 31 + 28 + 31 + 30 + day;
		  break;
	  case 6:
		  answer = 31 + 28 + 31 + 30 + 31 + day;
		  break;
	  case 7:
		  answer = 31 + 28 + 31 + 30 + 31 + 30 + day;
		  break;
	  case 8:
		  answer = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
		  break;
	  case 10:
		  answer = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
		  break;
	  case 11:
		  answer = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
		  break;
	  case 12:
		  answer = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
		  break;
		 }
	 System.out.printf("%d\n",answer);
	 }
		return 0;
	}
}

