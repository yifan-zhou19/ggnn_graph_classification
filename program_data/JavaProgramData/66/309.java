package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int c;
	int m = 0;
	int i;
	int j;
	int[] t1 = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] t2 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	if (b > 1)
	{
	if (a % 4 != 0 || (a % 100 == 0 && a % 400 != 0))
	{
				 for (j = 0;j < b - 1;j++)
				 {
				 m += t1[j];
				 }
	}
				 else
				 {
				 for (j = 0;j < b - 1;j++)
				 {
				 m += t2[j];
				 }
				 }
	}
	   m += c;
	   m += a - 1 + (int)((a - 1) / 4) - (int)((a - 1) / 100) + (int)((a - 1) / 400);
	   if (m % 7 == 1)
	   {
		   System.out.print("Mon.");
	   }
	   else if (m % 7 == 2)
	   {
		   System.out.print("Tue.");
	   }
	   else if (m % 7 == 3)
	   {
		   System.out.print("Wed.");
	   }
	   else if (m % 7 == 4)
	   {
		   System.out.print("Thu.");
	   }
	   else if (m % 7 == 5)
	   {
		   System.out.print("Fri.");
	   }
	   else if (m % 7 == 6)
	   {
		   System.out.print("Sat.");
	   }
	   else if (m % 7 == 0)
	   {
		   System.out.print("Sun.");
	   }
	   return 0;
	}
}

