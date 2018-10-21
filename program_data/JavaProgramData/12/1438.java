package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int num = 1;
		int num1 = 1;
		int i = 1;
		int k;
		int j;
		int c = 0;
		while (num1 != -1)
		{
			num1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[0] = num1;
			while (num != 0)
			{
				num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i] = num;
				i++;
			}
			for (k = 0 ; k <= i - 2 ; k++)
			{
				for (j = k + 1 ; j <= i - 2 ; j++)
				{
					if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
					{
						c++;
					}
				}
			}
			System.out.print(c);
			System.out.print("\n");
			int[] a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			c = 0;
			i = 1;
			num = 1;
		}
		return 0;
	}

}

