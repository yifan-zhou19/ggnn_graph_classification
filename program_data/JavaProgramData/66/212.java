package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int year;
	 int month;
	 int days;
	 int sum = 0;
	 int t;
	 int i;
	 String[] c = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
	 int[] s = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 31};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 year = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 month = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 days = Integer.parseInt(tempVar3);
	 }

	 sum = year % 7 + year / 4 - year / 100 + year / 400;


	 for (i = 0;i < month;i++)
	 {
	  sum = sum + s[i];
	 }

	 sum = sum + days - 1;

	 if (month <= 2 && ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0))
	 {

		   sum = sum - 1;
	 }

	 t = sum % 7;
	 System.out.printf("%s\n",c[t]);
	 return 0;
	}


}

