package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int total; /* total is to store the total number of the cocktail
		int eff;
						and eff is to store the effective number of the cocktail */
		total = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eff = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double e1; // to calculate the efficency of the cocltail
		e1 = ((double)(eff)) / ((double)(total));
		int total2; // to store the total number andthe effective number of the other methods
		int eff2;
		double e2;
		for (int i = 0; i < n - 1; i++)
		{
			total2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			eff2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			e2 = ((double)(eff2) / (double)(total2));
			if (e2 - e1 > 0.05)
			{
				System.out.print("better");
				System.out.print("\n");
			}
			else
			{
				if (e1 - e2 > 0.05)
				{
					System.out.print("worse");
					System.out.print("\n");
				}
				else
				{
					System.out.print("same");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

