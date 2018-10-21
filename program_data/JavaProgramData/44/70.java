package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int c;
		if (a > 0)
		{
		c = R(a);
		}
		else if (a < 0)
		{
		c = -R(-a);
		}
		else
		{
		c = 0;
		}
		return (c);
	}
	public static int R(int a)
	{
		int i;
		int b;
		int c = 0;
		for (i = 1;a > 0;i++)
		{
		   b = a % 10;
		   c = c * 10 + b;
		   a = a / 10;
		}
		return (c);
	}
	public static int Main()
	{
		  int i;
		  int j;
		  int k;
		  for (i = 1;i <= 6;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  j = Integer.parseInt(tempVar);
			  }
			  k = reverse(j);
			  System.out.printf("%d\n",k);
		  }
	}

}

