package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n == 1)
		{
			 System.out.print("End");
		}
		else
		{
		for (int i = 0;i < 99999;i++)
		{
			   a = n;
			   if (n % 2 == 0)
			   {
					  n = n / 2;
					  System.out.printf("%d/2=%d\n",a,n);
			   }
			   else
			   {
					  n = n * 3 + 1;
					  System.out.printf("%d*3+1=%d\n",a,n);
			   }
			   if (n == 1)
			   {
				   System.out.print("End");
					  break;
			   }

		}
		}
		 return 0;
	}

}

