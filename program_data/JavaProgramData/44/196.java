package <missing>;

public class GlobalMembers
{
	public static int digit(int n)
	{
		int q = 1;
		int i;
		for (i = 0;q > 0;i++)
		{
						q = n / 10;
						n = n / 10;
		}
		return i;
	}
	public static int digz(int n)
	{
		int i;
		int q = 0;
		int r = 10;
		for (i = 0;q == 0;i++)
		{
						q = n % 10;
						n = n / 10;
		}
		return i - 1;
	}
	public static int fx(int a)
	{
		  int b = 0;
		  int m;
		  int n = 1;
		  int l;
		  int p = 1;
		  int i;
		  int j;
		  int k;
		  if (a > 0)
		  {
				 l = digit(a) - digz(a);
				 for (i = 0;i < digit(a) - 1;i++)
				 {
										  p = p * 10;
				 }
				 for (i = 0;i < l - 1;i++)
				 {
								   n = n * 10;
				 }
				 for (i = 0;i < l;i++)
				 {
								 m = 1;
								 for (j = 0;j < i;j++)
								 {
												 m = m * 10;
								 }
				 b = (a / (p / m)) * m + b;
				 a = a % (p / m);
				 }
		  }
		  else if (a < 0)
		  {
				 a = -a;
				 l = digit(a) - digz(a);
				 for (i = 0;i < digit(a) - 1;i++)
				 {
										  p = p * 10;
				 }
				 for (i = 0;i < l - 1;i++)
				 {
								   n = n * 10;
				 }
				 for (i = 0;i < l;i++)
				 {
								 m = 1;
								 for (j = 0;j < i;j++)
								 {
												 m = m * 10;
								 }
				 b = (a / (p / m)) * m + b;
				 a = a % (p / m);
				 }
				 b = -b;
		  }
		  else
		  {
		  b = 0;
		  }
		  return b;
	}
	public static int Main()
	{
		  int a;
		  int b;
		  int i;
		  for (i = 0;i < 6;i++)
		  {
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  a = Integer.parseInt(tempVar);
						  }
						  b = fx(a);
						  System.out.printf("%d\n",b);
		  }
		  System.in.read();
		  System.in.read();
	}
}

