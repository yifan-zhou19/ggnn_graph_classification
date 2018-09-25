package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 1;
		int k;
		int[] m = new int[20];
		int x;
		int time1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (x == 0) //??????
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
			for (j = 1;j <= x;j++)
			{
					m[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					time1 = m[j] + 3 * (j - 1); //??????
					if (time1 >= 57 && time1 <= 60)
					{
							  System.out.print(m[j]);
							  System.out.print("\n");
							  break;
					}
					if (time1 > 60)
					{
						System.out.print(m[j] - (time1 - 60));
						System.out.print("\n");
						break;
					}

			}
			if (j < x)
			{
				for (k = j;k < x;k++)
				{
					m[k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			if (time1 <= 57)
			{
					System.out.print(60 - (time1 + 3) + m[x]);
					System.out.print("\n");
			}
			}
		}

		return 0;
	}


}

