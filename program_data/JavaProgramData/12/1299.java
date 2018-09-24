package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int count = 0;
		int i;
		int j;
		int k;
		for (i = 0; ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}
			else if (a[i] == 0)
			{
				for (j = 0; j < i; j++)
				{
					for (k = 0; k < i; k++)
					{
						if (a[k] == a[j] * 2)
						{
							count++;
						}
					}
				}
					System.out.print(count);
					System.out.print("\n");
					count = 0;
					i = -1;
			}
		}

		return 0;
	}

}

