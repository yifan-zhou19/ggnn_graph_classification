package <missing>;

public class GlobalMembers
{
	public static int m;
	  public static int n;
	  public static int k;
	public static int ok(int x)
	{
	  int i;
	  for (i = 1;i <= n;i++)
	  {
		if ((x - k) % n != 0)
		{
		  return 0;
		}
		  else if ((x - k) / n == 0)
		  {
			  return 0;
		  }
		x = (x - k) / n * (n - 1);
	  }
	  return 1;
	}
	public static int Main()
	{

	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  m = k;
	  while (true)
	  {
		m += n;
		if (ok(m) != 0)
		{
			 System.out.print(m);
			 System.out.print("\n");
			 return 0;
		}
	  }
	}
}

