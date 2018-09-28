package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int flag = int n;
	 int m;
	 int i;
	 int a;
	 int b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 m = Integer.parseInt(tempVar);
	 }
	 while ((m >= 6) && (m % 2 == 0))
	 {
	   for (i = 2;i <= m / 2;i++)
	   {
		  if (flag(i) == 0 && flag(m - i) == 0)
		  {
		  System.out.printf("%d %d\n",i,m - i);
		  }
	   }
	   break;
	 }
	}
	public static int flag(int n)
	{
	 int c;
	 int k;
	 int i;
	 k = Math.sqrt(n);
	 for (i = 2,c = 0;i <= k;i++)
	 {
	   if (n % i == 0)
	   {
			c = 1;
			break;
	   }
	 }
	 return (c);
	}

}

