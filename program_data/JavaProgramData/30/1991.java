package <missing>;

public class GlobalMembers
{
	  public static int Main()
	  {
		int n;
		int i;
		int sum;
	   sum = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	 for (i = 1;i <= n;i++)
	 {
	  if (i % 10 == 7)
	  {
	   sum += i * i;
	  }
	  else if (i % 7 == 0)
	  {
	   sum += i * i;
	  }
	  else if (i >= 70 && i <= 79)
	  {
	   sum += i * i;
	  }
	 }
		System.out.printf("%d", n * (n + 1) * (2 * n + 1) / 6 - sum);
	   return 0;
	  }
}

