package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int x;
		int y;
	  float std;
	  float t;

	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  std = 1.0 * y / x;
	  for (i = 1;i < n;i++)
	  {
		  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		t = 1.0 * y / x - std;
		if (t > 0.05F)
		{
			System.out.print("better");
		}
		else if (t < -0.05F)
		{
			System.out.print("worse");
		}
			  else
			  {
				  System.out.print("same");
			  }
		System.out.print("\n");
	  }
	  return 0;
	}
}

