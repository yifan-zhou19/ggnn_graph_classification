package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int j;
	 int[] s = new int[250];
	 int year;
	 int month1;
	 int month2;
	 int p;
	 int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (j = 1;j <= n;j++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 year = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead(" ");
	 if (tempVar3 != null)
	 {
		 month1 = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead(" ");
	 if (tempVar4 != null)
	 {
		 month2 = Integer.parseInt(tempVar4);
	 }
	 int i;
	 int sum1 = 0;
	 for (i = 1;i < month1;i++)
	 {
		 sum1 = sum1 + monthday[i - 1];
	 }
	 sum1 = sum1 + 1;
	 int k;
	 int sum2 = 0;
	for (k = 1;k < month2;k++)
	{
		 sum2 = sum2 + monthday[k - 1];
	}
	 sum2 = sum2 + 1;
	 int a;
	 a = year % 4;
	 if (month1 > 2 && (a == 0 && year % 100 != 0 || year % 400 == 0))
	 {
		 sum1 = sum1 + 1;
	 }
	 if (month2 > 2 && (a == 0 && year % 100 != 0 || year % 400 == 0))
	 {
		 sum2 = sum2 + 1;
	 }
	 p = sum2 - sum1;
	 if (p % 7 == 0)
	 {
	 s[j] = 1;
	 }
	 else
	 {
		 s[j] = 0;
	 }
	 }
	for (j = 1;j <= n;j++)
	{
		if (s[j] == 1)
		{
	 System.out.print("YES\n");
		}
	 else
	 {
		 System.out.print("NO\n");
	 }
	}
	 return 0;
	}


}

