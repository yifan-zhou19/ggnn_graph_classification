package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int n;
	 int k;
	 int i;
	 int year;
	 int mon1;
	 int mon2;
	 int day1;
	 int day2;
	 int day;
	 int temp;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (k = 0;k < n;k++)
	 {
		 day1 = day2 = 0;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 year = Integer.parseInt(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 mon1 = Integer.parseInt(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 mon2 = Integer.parseInt(tempVar4);
		 }
		 if (mon1 > mon2)
		 {
			 temp = mon1;
			 mon1 = mon2;
			 mon2 = temp;
		 }
		 for (i = 0;i < mon1 - 1;i++)
		 {
			 day1 = day1 + a[i];
		 }
		 for (i = 0;i < mon2 - 1;i++)
		 {
			 day2 = day2 + a[i];
		 }
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
		 {
			 if (mon1 > 2)
			 {
				 day1++;
			 }
			 if (mon2 > 2)
			 {
				 day2++;
			 }
		 }
		 day = day2 - day1;
		 if (day % 7 == 0)
		 {
			 System.out.print("YES\n");
		 }
		 else
		 {
			 System.out.print("NO\n");
		 }
	 }

	}
}

