package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 3; i <= n / 2; i = i + 2)
		{
			int r = 0;

			k = Math.sqrt(i);

			for (j = 2; j <= k; j++)
			{
			   if (i % j == 0)
			   {
			r++;
			break;
			   }
			}

			if (r != 0)
			{
			   continue;
			}
			r = 0;
			k = Math.sqrt(n - i);

			for (j = 2; j <= k; j++)
			{
				if ((n - i) % j == 0)
				{
			r++;
			break;
				}
			}

			if (r != 0)
			{
				continue;
			}

			System.out.print(i);
			System.out.print(" ");
			System.out.print((n - i));
			System.out.print("\n");
		}
		return 0;
	}


}

