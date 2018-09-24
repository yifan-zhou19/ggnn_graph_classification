package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int y)
	{
	 int result;
	 if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
	 {
	  result = 1;
	 }
	 else
	 {
	  result = 0;
	 }
		  return result;
	}
	public static int Main()
	{
	 int y;
	 int m;
	 int d;
	 int a;
	 int b;
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
	 if (1.0 * (y - 1) / 400 == 0)
	 {
	 a = (97 * 2 + 303) * (y - 1) / 400;
	 }
	 else if ((y - 1) % 400 < 100)
	 {
	  a = (y - 1) / 400 * (97 * 2 + 303) + ((y - 1) % 400) / 4 * 2 + (((y - 1) % 400) - ((y - 1) % 400) / 4);
	 }
	 else if ((y - 1) % 400 < 200)
	 {
	  a = ((y - 1) / 400 * (97 * 2 + 303) + (((y - 1) % 400) / 4 - 1) * 2 + (((y - 1) % 400) - ((y - 1) % 400) / 4 + 1));
	 }
	 else if ((y - 1) % 400 < 300)
	 {
	  a = (y - 1) / 400 * (97 * 2 + 303) + (((y - 1) % 400) / 4 - 2) * 2 + (((y - 1) % 400) - ((y - 1) % 400) / 4 + 2);
	 }
	 else
	 {
	  a = (y - 1) / 400 * (97 * 2 + 303) + (((y - 1) % 400) / 4 - 3) * 2 + (((y - 1) % 400) - ((y - 1) % 400) / 4 + 3);
	 }
	 int total = 0;
	 for (int i = 1; i < m; i++)
	 {
	  if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
	  {
	   total += 31;
	  }
	  else if (i == 4 || i == 6 || i == 9 || i == 11)
	  {
	   total += 30;
	  }
	  else if (i == 2)
	  {
	   if (isRunNian(y) != 0)
	   {
		total += 29;
	   }
	   else
	   {
		total += 28;
	   }
	  }
	 }
	 total += d;
	 b = a + total;
	 if (b % 7 == 1)
	 {
	  System.out.print("Mon.");
	 }
	 else if (b % 7 == 2)
	 {
	  System.out.print("Tue.");
	 }
	 else if (b % 7 == 3)
	 {
	  System.out.print("Wed.");
	 }
	 else if (b % 7 == 4)
	 {
	  System.out.print("Thu.");
	 }
	 else if (b % 7 == 5)
	 {
	  System.out.print("Fri.");
	 }
	 else if (b % 7 == 6)
	 {
	  System.out.print("Sat.");
	 }
	 else
	 {
	  System.out.print("Sun.");
	 }
	 return 0;
	}

}

