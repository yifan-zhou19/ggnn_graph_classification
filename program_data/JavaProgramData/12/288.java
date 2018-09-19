package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int sum;
		do
		{
			sum = 0;
			i = 0;
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] != -1)
			{
				do
				{
					i++;
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				} while (a[i] != 0);
				for (j = 0; j < i; j++)
				{
					for (k = 0; k < i; k++)
					{
						if (a[k] == 2 * a[j])
						{
							sum += 1;
						}
					}
				}
				System.out.print(sum);
				System.out.print("\n");
			}
			else
			{
				break;
			}
		} while (1 != 0);
		return 0;
	}

}

