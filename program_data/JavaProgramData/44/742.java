package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int c;
		int a;
		int b = 0;
		c = n;
		if (n >= 0)
		{
			while (c > 0)
			{
				a = c % 10;
				c = c / 10;
				b = 10 * b + a;
			}
		}
		if (n == 0)
		{
			b = 0;
		}
		if (n < 0)
		{
			b = -reverse(-n);
		}
		return (b);
	}
	  public static int Main()
	  {
		  int i;
		  int c;
		  for (i = 1;i <= 6;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  c = Integer.parseInt(tempVar);
			  }
			  System.out.printf("%d\n",reverse(c));
		  }
	  return 0;
	  }
}

