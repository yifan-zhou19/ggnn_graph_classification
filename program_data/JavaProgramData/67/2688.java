package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int b;
		int n;
		int i;
	  double a;
	  double m;
	  double x;
	  double y;
	  k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  x = b / a;
	  for (i = 1;i <= (k - 1);i++)
	  {
	  m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y = n / m;
	  if (y - x > 0.05)
	  {
		  System.out.print("better");
		  System.out.print("\n");
	  }
	  if (x - y > 0.05)
	  {
		  System.out.print("worse");
		  System.out.print("\n");
	  }
	  if (y - x <= 0.05 & x - y <= 0.05)
	  {
		  System.out.print("same");
		  System.out.print("\n");
	  }
	  }
	  return 0;
	}
}

