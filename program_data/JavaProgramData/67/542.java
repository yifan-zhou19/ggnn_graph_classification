package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] all = new int[100];
		int[] eff = new int[100];
		double[] r = new double[100];

		int k = 0;
		while (k < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				all[k] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				eff[k] = Integer.parseInt(tempVar3);
			}
			k++;
		}
		r[0] = (1.0 * (eff[0]) * 100) / (1.0 * (all[0]));

		int i = 1;
		while (i < n)
		{
			r[i] = (1.0 * eff[i] * 100) / (1.0 * all[i]);
			if (r[i] - r[0] > 5)
			{
				if (i == 1)
				{
					System.out.print("better");
				}
				else
				{
					System.out.print("\nbetter");
				}

			}
			else
			{
				if (r[0] - r[i] > 5)
				{
					if (i == 1)
					{
						System.out.print("worse");
					}
					else
					{
						System.out.print("\nworse");
					}

				}
				else
				{
					if (i == 1)
					{
						System.out.print("same");
					}
					else
					{
						System.out.print("\nsame");
					}

				}
			}
			i++;
		}
		return 0;



	}
}

