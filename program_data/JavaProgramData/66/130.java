package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long year,month,day,i,n,a,b,total,c;
	 int year;
	 int month;
	 int day;
	 int i;
	 int n;
	 int a;
	 int b;
	 int total;
	 int c;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long s[13]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	 int[] s = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
	 n = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;
	 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
	 {
	  s[2] = 29;
	 }
		b = 0;
	 for (a = 1;a < month;a++)
	 {
	  b = b + s[a];
	 }
	 total = year - 1 + n + b + day;
	 c = total % 7;
	switch (c)
	{
	 case 0:
	  System.out.print("Sun.");
	  break;
	 case 1:
	  System.out.print("Mon.");
	  break;
	 case 2:
	  System.out.print("Tue.");
	  break;
	 case 3:
	  System.out.print("Wed.");
	  break;
	 case 4:
	  System.out.print("Thu.");
	  break;
	 case 5:
	  System.out.print("Fri.");
	  break;
	 case 6:
	  System.out.print("Sat.");
	  break;
	}
	return 0;
	}
}

