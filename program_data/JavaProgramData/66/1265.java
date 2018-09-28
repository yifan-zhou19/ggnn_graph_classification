package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int a;
	   int b;
	   int c;
	   int d = 0;
	   int i;
	   int e;
	   int run = 0;
	   int ping = 0;
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
	   a = a % 400;
	   if (a == 0)
	   {
		   a = 5;
	   }
	   for (i = 1;i <= (a - 1);i++)
	   {
		   if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
		   {
			   run++;
		   }
		   else
		   {
			   ping++;
		   }
	   }
	   d = d + ping + 2 * run;
	   for (i = 1;i <= (b - 1);i++)
	   {
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		   {
			   d = d + 31;
		   }
		   else if (i != 2)
		   {
			   d = d + 30;
		   }
		   else if (i == 2 && (a % 4 == 0 && a % 100 != 0 || a % 400 == 0))
		   {
			   d = d + 29;
		   }
		   else
		   {
			   d = d + 28;
		   }
	   }
	   d = d + c;
	   e = d % 7;
	   if (e == 1)
	   {
		   System.out.print("Mon.");
	   }
	   else if (e == 2)
	   {
		   System.out.print("Tue.");
	   }
	   else if (e == 3)
	   {
		   System.out.print("Wed.");
	   }
	   else if (e == 4)
	   {
		   System.out.print("Thu.");
	   }
	   else if (e == 5)
	   {
		   System.out.print("Fri.");
	   }
	   else if (e == 6)
	   {
		   System.out.print("Sat.");
	   }
	   else if (e == 0)
	   {
		   System.out.print("Sun.");
	   }
	}

}

