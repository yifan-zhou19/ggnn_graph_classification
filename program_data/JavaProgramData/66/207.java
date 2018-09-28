package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	  int y;
	  int m;
	  int d;
	  int sum = 0;
	  int a;
	  int y1;
	  int i;
	  int[] monthdays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  y = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  m = Integer.parseInt(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  d = Integer.parseInt(tempVar3);
	  }
	  for (i = 1;i <= m;i++)
	  {
		  sum += monthdays[i - 1];
	  }
	  if (m > 2 && ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0))
	  {
		   sum += 1;
	  }
	  for (i = y - 1;i >= 0;i--)
	  {
		 if (i % 400 == 0)
		 {
			 y1 = i;
		 break;
		 }
	  }
	  for (i = y1 + 100;i < y;i += 100)
	  {
		 if (i % 400 != 0)
		 {
			 sum -= 1;
		 }
	  }
	  a = (sum + 365 * (y - y1 - 1) + d + (y - y1 - 1) / 4) % 7;
	  if (a == 0)
	  {
		  System.out.print("Sun.\n");
	  }
	  else if (a == 1)
	  {
		  System.out.print("Mon.\n");
	  }
	  else if (a == 2)
	  {
		  System.out.print("Tue.\n");
	  }
	  else if (a == 3)
	  {
		  System.out.print("Wed.\n");
	  }
	  else if (a == 4)
	  {
		  System.out.print("Thu.\n");
	  }
	  else if (a == 5)
	  {
		  System.out.print("Fri.\n");
	  }
	  else
	  {
		  System.out.print("Sat.\n");
	  }
	}

}

