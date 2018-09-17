package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int year;
		  int month;
		  int day;
		  int sum = 0;
		  int sm = 0;
		  int k;
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
		  if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) != 0)
		  {
			int[] m = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (k = 0;k < month;k++)
			{
			  sum = sum + m[k];
			}
			sum = sum + day;
			System.out.printf("%d",sum);
		  }
		  else
		  {
			int[] n = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (k = 0;k < month;k++)
			{
			  sm = sm + n[k];
			}
			  sm = sm + day;
			  System.out.printf("%d",sm);
		  }
		  System.in.read();
		  System.in.read();
	}


}

