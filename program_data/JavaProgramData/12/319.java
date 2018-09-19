package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int num;
		do
		{
			num = 0;
			k = 0;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			for (i = 1; i <= 15; i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
				k++;
			}
			for (i = 0; i <= k; i++)
			{
				for (j = 0; j <= k; j++)
				{
					if (a[i] == 2 * a[j])
					{
						num++;
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		} while (1 != 0);
		return 0;
	}

}

