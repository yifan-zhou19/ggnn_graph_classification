package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int tmp;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   while (true)
	   {
		   tmp = n % 10;
		   System.out.printf("%d",tmp);
		   if ((n = n / 10) == 0)
		   {
			   break;
		   }
	   }
	   System.out.print("\n");
	   return 0;
	}
}

