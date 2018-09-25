package <missing>;

public class GlobalMembers
{
	public static int isPrim(int n)
	{
	  int r = (int)Math.sqrt(n);
	  int i;

	  for (i = 2; i <= r; ++i)
	  {
		if (n % i == 0)
		{
		  return 0;
		}
	  }

	  return 1;
	}

	public static int isHui(int n)
	{
	  int m = 0;
	  int nn = n;

	  do
	  {
		m = m * 10 + n % 10;
		n = n / 10;
	  } while (n != 0);

	  return m == nn;
	}

	public static int Main()
	{
	  int m;
	  int n;
	  int p;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  p = 0;

	  for (; m <= n; ++m)
	  {
		if (isPrim(m) != 0 && isHui(m) != 0)
		{
		  if (p == 0)
		  {
			  p = 1;
		  }
		  else
		  {
			  System.out.print(",");
		  }
		  System.out.printf("%d", m);
		}
	  }

	  if (p == 0)
	  {
		  System.out.print("no");
	  }
	}
}

