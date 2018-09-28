package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int m;
		int i;
		int p;
		int s;
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
	 m = n;
	 p = 0;
	 while (p == 0)
	 {
		  p = 1;
	   i = 1;
	   s = m;
	   while (i <= n != 0 && p == 1)
	   {
			if ((s - k) % n == 0 && (s - k) != 0)
			{
			 p = 1;
		  s = s - (s - k) / n - k;
		  i = i + 1;
			}
		 else
		 {
			 p = 0;
		 }
	   }
	   if (p == 0)
	   {
		   m = m + 1;
	   }
	 }
	 System.out.printf("%d",m);
	}
}

