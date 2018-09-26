package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int sum = 0;
	   int n;
	   int i;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= n;i++)
	   {
		   if (i % 7 == 0)
		   {
			   continue;
		   }
		   else if ((i - 10 * (int)(i / 10)) == 7)
		   {
			   continue;
		   }
		   else if ((int)(i / 10) == 7)
		   {
			   continue;
		   }
		   sum = sum + i * i;
	   }
		System.out.printf("%d",sum);
		return 0;
	}



}

