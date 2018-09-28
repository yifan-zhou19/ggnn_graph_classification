package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] bfnq = new int[n];
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			bfnq [i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}


		int a1 = 1;
		int a2 = 1;
		for (i = 0; i < n; i++) //n?????
		{
			a1 = 1;
			a2 = 1;
			if (bfnq[i] == 1 || bfnq[i] == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else if (bfnq[i] % 2 == 1)
			{
					for (j = 3; j <= bfnq[i]; j += 2)

					{
							 a1 = a1 + a2;
							 a2 = a1 + a2;
					}
						System.out.print(a1);
						System.out.print("\n");
			}
			else
			{
				for (j = 3; j <= bfnq[i]; j += 2)
				{
					a1 = a1 + a2;
					a2 = a1 + a2;
				}
				System.out.print(a2);
				System.out.print("\n");
			}
		}

		return 0;
	}

}

