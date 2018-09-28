package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int t;
		int s;
		float x;
		float y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = b * 1.0 / a;
		for (i = 1;i <= n - 1;i++)
		{
			t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  y = s * 1.0 / t;
		  if (y - x > 0.05F)
		  {
			  System.out.print("better");
			  System.out.print("\n");
		  }
		  if (x - y > 0.05F)
		  {
			  System.out.print("worse");
			  System.out.print("\n");
		  }
		  if (x - y <= 0.05F && y - x <= 0.05F)
		  {
			  System.out.print("same");
			  System.out.print("\n");
		  }
		}
		return 0;
	}

}

