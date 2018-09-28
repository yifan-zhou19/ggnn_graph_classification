package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int a;
	  int b;
	  int c = 0;
	  int t = 0;
	  int i = 1;
	  int max = 0;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 1;i <= n;i++)
	  {
		  a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  if (a >= 90 && a <= 140 && b >= 60 && b <= 90)
		  {
			  c = c + 1;
		  }
		  else
		  {
				c = 0;
		  }
		  t = c;
			if (t > max)
			{
			 max = t;
			}
	  }

	  System.out.print(max);
	  return 0;
	}
}

