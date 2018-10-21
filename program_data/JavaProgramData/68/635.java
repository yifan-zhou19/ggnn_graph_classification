package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int f = int n;
	  int n;
	  int i;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 6;i <= n;i += 2)
	  {
		for (j = 3;j < i;j++)
		{
		  if (f(j) == 1 && f(i - j) == 1)
		  {
		  System.out.printf("%d=%d+%d\n",i,j,i - j);
		  break;
		  }
		}
	  }
	return 0;
	}
	public static int f(int n)
	{
	  int i;
	  int a = Math.sqrt(n);
	  int c;
	  for (i = 2;i <= a;i++)
	  {

		if (n % i == 0)
		{
			break;
		}
	  }
		if (i > a)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
	  return (c);
	}
}

