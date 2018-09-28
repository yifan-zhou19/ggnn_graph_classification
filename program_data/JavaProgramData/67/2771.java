package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		double x;
		double y;
		double[] wine = new double[2];
		double[] improve = new double[2];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < 2;i++)
		{
		wine[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		x = wine[1] / wine[0]; //???????????
		for (int i = 1;i < n;i++)
		{
		  improve[0] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  improve[1] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		  y = improve[1] / improve[0]; //??????????
		  if (x - y > 0.05) //??????
		  {
		  System.out.print("worse");
		  System.out.print("\n");
		  }
		  else if (y - x > 0.05)
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
		return 0;
	}

}

