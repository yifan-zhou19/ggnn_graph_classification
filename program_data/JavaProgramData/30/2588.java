package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int i;
	 int n;
	 int sum = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	  if (n < 10)
	  {
	   for (i = 1;i <= n;i++)
	   {
	   if (i != 7)
	   {
		   sum = sum + i * i;
	   }
	   }
	  }
	   else
	   {
	   for (i = 1;i <= 9;i++)
	   {
	   if (i != 7)
	   {
		   sum = sum + i * i;
	   }
	   }

	  for (i = 10;i <= n;i++)
	  {
	   if ((i % 10 != 7) && (i % 7 != 0) && ((i - i % 10) % 7 != 0))
	   {
	   sum = sum + i * i;
	   }
	  }
	   }
	  System.out.printf("%d",sum);
	}
}

