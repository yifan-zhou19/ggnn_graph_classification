package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int i;
	 int m;
	 int x;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead(" ");
	 if (tempVar2 != null)
	 {
		 k = Integer.parseInt(tempVar2);
	 }
	 for (m = k + n;m < 10000000;m = m + n)
	 {
		 x = m;
	 if (x % (n - 1) == 0)
	 {
		 for (i = 1;i < n;i++)
		 {
		 if (x % (n - 1) != 0)
		 {
			 break;
		 }
	  x = x * n / (n - 1) + k;
	  if (i == n - 1)
	  {
		  System.out.printf("%d",x);
		  m = 10000001;
	  }
		 }
	 }
	 }
	}
}

