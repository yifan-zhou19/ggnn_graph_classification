package <missing>;

public class GlobalMembers
{
	public static int dayfr(int m,int d)
	{
	int t;
	int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	t = a[m - 1] - d;
	for (m = m + 1;m <= 12;m++)
	{
	t = t + a[m - 1];
	}
	return (t);
	}
	public static int dayr(int m,int d)
	{
	int t;
	int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	t = a[m - 1] - d;
	for (m = m + 1;m <= 12;m++)
	{
	t = t + a[m - 1];
	}
	return (t);
	}
	public static void Main()
	{
	 int y1;
	 int m1;
	 int d1;
	 int y2;
	 int m2;
	 int d2;
	 int year;
	 int t;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 y1 = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m1 = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 d1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 y2 = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 m2 = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 d2 = Integer.parseInt(tempVar6);
	 }
	 year = y1;
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
	  t = dayr(m1, d1);
	 }
	  else
	  {
		  t = dayfr(m1, d1);
	  }
	 for (year = y1 + 1;year <= y2;year++)
	 {
	  if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	  {
	   t = t + dayr(1, 1) + 1;
	  }
	  else
	  {
		  t = t + dayfr(1, 1) + 1;
	  }
	 }
	  year = y2;
	 if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
	 {
	  t = t - dayr(m2, d2);
	 }
	  else
	  {
		  t = t - dayfr(m2, d2);
	  }
	 System.out.printf("%d",t);
	}
}

