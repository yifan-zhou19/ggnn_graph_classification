package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		for (l = 1 ; ; l++)
		{
			i = 0;
			int[] a = new int[20];
			int num = 0;
			do
			{
				i++;
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}while (a[i] > 0);
			if (a[i] == -1)
			{
				break;
			}
			else
			{
				for (j = 1 ; j < i ; j++)
				{
					for (k = 1 ; k < i ; k++)
					{
						if (a[j] == 2 * a[k])
						{
							num++;
						}
					}
				}
				System.out.print(num);
				System.out.print("\n");

			}

		}
		return 0;
	}
}

