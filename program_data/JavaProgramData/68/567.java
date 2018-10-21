package <missing>;

public class GlobalMembers
{
	public static int sushu(int n)
	{
		 int a;
		if (n == 2)
		{
		return (0);
		}
		else if (n > 2)
		{
		  for (a = 2;a <= Math.sqrt(n);a++)
		  {
				if (n % a == 0)
				{
			   break;
				}
		  }
		  if (a > Math.sqrt(n))
		  {
		  return (0);
		  }
		  else
		  {
		  return (1);
		  }
		}
	}
	public static void Main()
	{
	  int n;
	  int a;
	  int b;
	  int c;
	  int d;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (a = 6;a <= n;a = a + 2)
	  {
		  for (b = 2;b < a;b++)
		  {
			c = sushu(b);
			d = sushu(a - b);
			if (c == 0 && d == 0)
			{
				System.out.printf("%d=%d+%d\n",a,b,a - b);
			break;
			}
		  }
	  }
	}

}

