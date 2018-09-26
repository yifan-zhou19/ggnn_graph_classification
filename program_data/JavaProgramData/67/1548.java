package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double cocktail1;
		double cocktail2;
		double cocktail;
		double result;
		double[] extra1 = new double[10000];
		double[] extra2 = new double[10000];
		double[] extra = new double[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		cocktail1 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		cocktail2 = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		cocktail = cocktail2 / cocktail1;
		for (i = 0;i < n - 1;i++)
		{
			extra1[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			extra2[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			extra[i] = extra2[i] / extra1[i];
		}

		for (i = 0;i < n - 1;i++)
		{
			result = extra[i] - cocktail;
			if (result > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else if (result < (-0.05))
			{
				System.out.print("worse");
				System.out.print("\n");
			}
			else if (result >= -0.05 && result <= 0.05)
			{
				System.out.print("same");
				System.out.print("\n");
			}
		}
		return 0;
	}


}

