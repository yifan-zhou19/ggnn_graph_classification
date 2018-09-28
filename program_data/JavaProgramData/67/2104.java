package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double a;
		double b;
		a = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		b = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		double c;
		c = b / a;
		int i = 1;
		while (i < n)
		{
		   i++;
		   double m;
		   double n;
		   m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   n = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		   double d = n / m;
		   if ((c - d) > 0.05)
		   {
			 System.out.print("worse");
			 System.out.print("\n");
		   }
		   else if ((d - c) > 0.05)
		   {
			 System.out.print("better");
			 System.out.print("\n");
		   }
		   else
		   {
			   System.out.print("same");
			   System.out.print("\n");
		   }
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;
	}

}

