package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		long sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 10)
		{
			for (int i = 1;i < 10;i++)
			{
				int ok = 1;
				ok = (i % 7);
				if (ok != 0)
				{
					sum += i * i;
				}


			}
			for (int i = 10;i <= n;i++)
			{
				int[] ok = {1, 1, 1};
				ok[0] = (i % 7);
				ok[1] = ((i % 10) % 7);
				int j = i;
				ok[2] = ((j / 10) % 7);
				if (ok[1] != 0 && ok[0] != 0 && ok[2] != 0)
				{
					sum += i * i;
				}
			}

		}
		else
		{
			for (int i = 1;i <= n;i++)
			{
						int ok = 1;
						ok = (i % 7);
						if (ok != 0)
						{
							sum += i * i;
						}
			}



		}
	  int k = n;
	  k = k / 10;
		for (int i = 1;i <= k;i++)
		{
			sum += 100 * i * i;
		}
		if (n >= 70)
		{
			sum = sum - 4900;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;

	}
}

