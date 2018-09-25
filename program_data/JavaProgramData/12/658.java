package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int j;
		int k;
		int sum;
		while (true)
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] != -1)
			{
				int i;
				for (i = 1 ; ; i++)
				{
					a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (a[i] == 0)
					{
						break;
					}
				}
				sum = 0;
				for (j = 0; j < i; j++)
				{
					for (k = j + 1; k < i ; k++)
					{
								if (a[j] == 2 * a[k] || a[k] == a[j] * 2)
								{
									sum = sum + 1;
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
		}
		return 0;
	}

}

