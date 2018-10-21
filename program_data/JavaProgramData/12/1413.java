package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i = 0;
		int j = 0;
		int n = 0;
		int num;
		int k = 0;
		int m;
		do
		{
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1)
			{
				break;
			}

			for (i = 1;i < 16;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
			}

			n = 0;
			for (k = 0;k < i;k++)
			{
				for (j = 0;j < i;j++)
				{
					if (a[k] == 2 * a[j])
					{
						n++;
					}
				}
			}
				System.out.print(n);
				System.out.print("\n");
		} while (1 != 0);
	return 0;
	}




}

