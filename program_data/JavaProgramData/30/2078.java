package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int c;
	   int i;
	   c = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   if (i < 70 && i % 10 != 7 && i % 7 != 0)
		   {
			   c += i * i;
		   }
		   else if (i > 79 && i % 10 != 7 && i % 7 != 0)
		   {
			   c += i * i;
		   }
	   }
	   System.out.printf("%d",c);
	   return 0;
	}
}

