package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i = 1;
		int[] num = new int[16];
		int s;
		int k = 0;
			while ((s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
			{
				a[i] = s;
				if (a[i] == 0)
				{
					i = 0;
					k++;
					continue;
				}
				if (a[i] == -1)
				{
					break;
				}
				for (int j = 0 ; j <= i ; j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						num[k]++;
					}
				}
				i++;
			}
			for (i = 0 ; i < k ; i++)
			{
				System.out.print(num[i]);
				System.out.print("\n");
			}
		return 0;
	}
}

