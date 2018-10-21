package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int l;
		do
		{
			i = 0;
			l = -1;
			for (j = 0;j <= 15;j++)
			{
				a[j] = 1;
			}
			do
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				i++;
					if (a[0] == -1)
					{
						break;
					}
			}while (a[i - 1] != 0);
			if (a[0] == -1)
			{
				break;
			}
			for (j = 0;j <= i - 1;j++)
			{
				for (k = 0;k <= i - 1;k++)
				{
					if (a[j] == 2 * a[k])
					{
						l++;
					}
				}
			}
			System.out.print(l);
			System.out.print("\n");
		}while (a[0] != -1);
		return 0;
	}

}

