package <missing>;

public class GlobalMembers
{
	public static int reverse(int num)
	{
		int c = 0;
		int a;
		if (num >= 0)
		{
				  for (;num != 0;)
				  {
						a = num % 10;
						c = c * 10 + a;
						num = num / 10;
				  }
				  return c;
		}
		else
		{
			num = 0 - num;
			for (;num != 0;)
			{
						a = num % 10;
						c = c * 10 + a;
						num = num / 10;
			}
			c = 0 - c;
			return c;
		}
	}
	public static int Main()
	{
		  int n;
		  for (int i = 1;i <= 6;i++)
		  {
						   String tempVar = ConsoleInput.scanfRead();
						   if (tempVar != null)
						   {
							   n = Integer.parseInt(tempVar);
						   }
						   n = reverse(n);
						   System.out.printf("%d\n",n);
		  }

	}

}

