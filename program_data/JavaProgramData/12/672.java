package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int i = 0;
		while ((a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			int i = 0;
			int j = 0;
			if (a[i] == -1)
			{
				return 0;
			}
			do
			{
				i++;
				j++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			} while (a[i] != 0);


				int y;
				int z;
				int k = 0;
				 for (z = 0; z <= j - 1; z++)
				 {
					for (y = z + 1; y <= j - 1; y++)
					{
						if (a[z] == 2 * a[y] || a[y] == 2 * a[z])
						{
							k++;
						}
					}
				 }
				System.out.print(k);
				System.out.print("\n");


		}

		return 0;
	}

}

