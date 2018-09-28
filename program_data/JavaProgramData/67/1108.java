public class way
{
	public double sum;
	public double effect;
	public double rate;
}

package <missing>;

public class GlobalMembers
{
	public static way wine = new way();
	public static way[] improve = tangible.Arrays.initializeWithDefaultwayInstances(100);
	public static void compare(double a,double b)
	{
		if (Math.abs(a - b) < 0.05)
		{
			System.out.print("same");
			System.out.print("\n");
		}
		else if (a > b)
		{
			System.out.print("worse");
			System.out.print("\n");
		}
		else
		{
			System.out.print("better");
			System.out.print("\n");
		}
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		wine.sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		wine.effect = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		wine.rate = wine.effect / wine.sum;
		for (i = 0;i < n - 1;i++)
		{
			improve[i].sum = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			improve[i].effect = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			improve[i].rate = improve[i].effect / improve[i].sum;
			//cout<<improve[i].sum<<improve[i].effect<<improve[i].rate;
		}
		for (i = 0;i < n - 1;i++)
		{
			compare(wine.rate, improve[i].rate);
		}
		return 0;
	}




}

