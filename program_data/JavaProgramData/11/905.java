package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int year;
		  int mon;
		  int day;
		  int f;
		  int i;
		  int sum = 0;
		  int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  year = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead(" ");
		  if (tempVar2 != null)
		  {
			  mon = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  day = Integer.parseInt(tempVar3);
		  }
		  if (year % 4 == 0 && year % 100 != 0)
		  {
		  f = 1;
		  }
		  else if (year % 400 == 0)
		  {
		  f = 1;
		  }
		  else
		  {
		  f = 0;
		  }
		  for (i = 1;i < mon;i++)
		  {
							   sum = sum + a[i - 1];
		  }
		  sum = sum + day;
		  if (f == 1 && mon > 2)
		  {
		  sum = sum + 1;
		  }
		  System.out.printf("%d",sum);
		  System.in.read();
		  System.in.read();
	}

}

