package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int i;
		int j;
		int k;
		for (i = 1 ; i <= 16 ; i++)
		{
			a[i] = 1;
		}
		int count = 0;
		while ((a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a[1] == -1)
			{
				break;
			}
			else
			{
				for (i = 2 ; a[i - 1] != 0 ; i++)
				{
				   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			i = i - 2;
			for (j = 1 ; j <= i ; j++)
			{
				for (k = 1 ; k <= i ; k++)
				{
					if (a[k] == 2 * a[j])
					{
						count++;
						break;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
			count = 0;
		}
		return 0;
	}

}

