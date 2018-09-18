package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[15];
		int j = 1;
		int i;
		int m;
		int k;
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			m = 0;
			k = 0;
			for (i = 1;i < 15;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i] == 0)
				{
					break;
				}
				else
				{
					j++;
				}
			}
			for (i = 0;i <= j - 1;i++)
			{
				for (k = 0;k <= j - 1;k++)
				{
					if (a[k] == 2 * a[i])
					{
						m++;
					}
				}
			}
			System.out.print(m);
			System.out.print("\n");
			a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == 0)
			{
				a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			j = 1;
		}while (a[0] != -1);
		return 0;
	}
}

