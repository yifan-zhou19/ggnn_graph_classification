package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int a;
	 int b;
	 int sum = 0;
	 int i = 1;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (;n > 0;n--)
	 {
	 if (n % 7 != 0)
	 {
			b = n;
	  while (b >= 1)
	  {
	   a = b % 10;
	   b = (b - a) / 10;
	   if (a == 7)
	   {
		i = 0;
	   }
	  }
		if (i == 1)
		{
			  sum += n * n;
		}
		i = 1;
	 }
	 }
	 System.out.printf("%d",sum);
	}


}

