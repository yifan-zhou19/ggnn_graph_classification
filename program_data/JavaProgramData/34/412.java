package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;;i++)
		{
			if (n == 1)
			{
			   System.out.print("End\n");
			   break;
			}
		  if (n % 2 == 0)
		  {
			a = n / 2;
			System.out.printf("%d/2=%d\n",n,a);
			if (a == 1)
			{
			  System.out.print("End\n");
			  break;
			}
			else
			{
			  n = a;
			}
		  }
		   if (n % 2 != 0)
		   {
			  a = n * 3 + 1;
			  System.out.printf("%d*3+1=%d\n",n,a);
			if (a == 1)
			{
			  System.out.print("End\n");
			  break;
			}
			else
			{
			n = a;
			}
		   }
		}
		return 0;
	}

}

