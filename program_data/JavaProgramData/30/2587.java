package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int sum = 0;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 10)
		{
			for (i = 1;i < 10;i++)
			{
		 for (j = 0;(j < 10) && (10 * i + j) <= n;j++)
		 {
			 if ((10 * i + j) % 7 != 0 && i != 7 && j != 7)
			 {
				 sum += (10 * i + j) * (10 * i + j);
			 }
		 }

			}
		 sum += 236;
		}
		else
		{
		for (j = 0;(j < 10) && j <= n;j++)
		{
			if (j % 7 != 0)
			{
			 sum += j * j;
			}
		}

		}



		System.out.print(sum);
		return 0;
	}

}

