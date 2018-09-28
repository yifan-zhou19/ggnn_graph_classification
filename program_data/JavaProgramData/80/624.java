package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  int count1 = 0;
	  int count2 = 0;
	  int year1;
	  int year2;
	  int month1;
	  int month2;
	  int date1;
	  int date2;
	  int i;
	  int sum = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  year1 = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  month1 = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ");
	  if (tempVar3 != null)
	  {
		  date1 = Integer.parseInt(tempVar3);
	  }
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  year2 = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  month2 = Integer.parseInt(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  date2 = Integer.parseInt(tempVar6);
	  }
	  for (i = 1;i <= month1;i++)
	  {
		  if ((year1 % 4 == 0) && (year1 % 100 != 0) || (year1 % 400 == 0))
		  {
		  count1 += a[i - 1];
		  }
		  else
		  {
		  count1 += b[i - 1];
		  }
	  }
	  count1 += date1;
	  for (i = 1;i <= month2;i++)
	  {
		  if ((year2 % 4 == 0) && (year2 % 100 != 0) || (year2 % 400 == 0))
		  {
		  count2 += a[i - 1];
		  }
		  else
		  {
		  count2 += b[i - 1];
		  }
	  }
	  count2 += date2;
	  if (year1 == year2)
	  {
	  sum = 0;
	  }
	  else
	  {
	  for (i = year1;i <= year2 - 1;i++)
	  {
		  if ((i % 4 == 0) && (i % 100 != 0) || (i % 400) == 0)
		  {
		  sum += 366;
		  }
		  else
		  {
		  sum += 365;
		  }
	  }
	  }
	  System.out.printf("%d",sum - count1 + count2);
	}
}

