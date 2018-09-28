package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int m;
	 int n;
	 int k;
	 int i;
	 int a = 0;
	 int b;
	 int c = 0;
	 int d;
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
	 i = 1;
	 b = n - 1;
	 d = b;
	 m = d;
	 while (a == 0)
	 {
	  while (i <= n)
	  {
	   if (m % (n - 1) != 0)
	   {
		i = n + 1;
	   }
	   else
	   {
		c++,m = m * n / (n - 1) + k,i++;
	   }
	  }
	  i = 1;
	  d = d + b;
	  if (c == n)
	  {
	   a = 1;
	  }
	  else
	  {
	   m = d;
	  }
	  c = 0;
	 }
	 System.out.printf("%d",m);
	}
}

