package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int n;
		int c;
		int i;
		for (i = 1;i <= 6;i++)
		{
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		if (n == 0)
		{
		System.out.print("0\n");
		}

	   if (n > 0)
	   {
			for (s = 0;n != 0;)
			{
			c = n % 10;
		s = c * 10 + s * 10;
		n = n / 10;
			}
		System.out.printf("%d\n",s / 10);
	   }
		if (n < 0)
		{
		for (s = 0,n = -n;n != 0;)
		{
			c = n % 10;
		 s = c * 10 + s * 10;
		 n = n / 10;
		}
		System.out.printf("-%d\n",s / 10);
		}
		}

	}

}

