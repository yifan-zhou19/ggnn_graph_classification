package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
		 int n;
		 int a;
		 int b;
		 int c;
		 int d;
		 int e;
		 int f;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (a = 2,f = a + 2;a <= n,f <= n;a++,f++)
		 {
			 c = 0;
		  e = 0;
		  for (b = 2;b * b <= a;b++)
		  {
			   if (a % b == 0)
			   {
			c = 1;
			   }
		  }
		   if (c == 0)
		   {
		   for (d = 2;d * d <= f;d++)
		   {
			 if (f % d == 0)
			 {
		 e = 1;
			 }
		   }
		   }
		 if (c == 0 && e == 0)
		 {
		 System.out.printf("%d %d\n",a,f);
		 }
		 }
	if (n < 5)
	{
	System.out.print("empty");
	}
	 }
}

