package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int j;
		int k;
		int count;
		while ((a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (a[0] == -1)
			{
				break;
			}
			count = 0;
			for (i = 1;;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}
			for (j = 0;j < i;j++)
			{
				for (k = 0;k < i;k++)
				{
					if (a[k] == 2 * a[j])
					{
						count += 1;
					}
				}
			}
			System.out.print(count);
			System.out.print("\n");
		}
		return 0;
	}






}

