package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int year;
	  int month;
	  int day;
	  int n_runnian = 0;
	  int diyitian;
	  int m;
	  int i;
	  int sum = 0;
	  int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  year = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  month = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  day = Integer.parseInt(tempVar3);
	  }

	  n_runnian = (year - 1) / 100 - (year - 1) / 400;
	  n_runnian = (year - 1) / 4 - n_runnian;


	  diyitian = (year - 1 + n_runnian) % 7;


	  if (year % 100 > 0)
	  { //?????????
	  if (year % 4 == 0)
	  {
				   a[2] = 29;
	  }
	  }
	  if (year % 400 == 0)
	  {
					 a[2] = 29;
	  }

	  //????? 
	  for (i = 0;i < month;i++)
	  {
								sum = sum + a[i];
	  }
	  sum = sum + day;

	  m = (sum % 7 + diyitian) % 7;

	  switch (m)
	  {
			 case 0 :
				 System.out.print("Sun.");
				 break;
			 case 1 :
				 System.out.print("Mon.");
				 break;
			 case 2 :
				 System.out.print("Tue.");
				 break;
			 case 3 :
				 System.out.print("Wed.");
				 break;
			 case 4 :
				 System.out.print("Thu.");
				 break;
			 case 5 :
				 System.out.print("Fri.");
				 break;
			 case 6 :
				 System.out.print("Sat.");
	  }




	}
}

