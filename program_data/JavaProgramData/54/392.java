package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int temp;
	 int p;
	 int i;
	 int sum;
	 int j;
	 int k;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 sum = k;
	 p = 1;
	 while (p == 1)
	 {
		 sum = sum + n;
		 temp = sum;
		 i = 0;
		 while (i < n)
		 {
			  i++;
		   if (temp % n == k && temp >= n)
		   {
			   temp = (temp - k) / n * (n - 1);
		   if (i == n)
		   {
			   p = 0;
		   }
		   }
		   else
		   {
			   break;
		   }
		 }
	 }
	 System.out.printf("%ld",sum);
	}

}

