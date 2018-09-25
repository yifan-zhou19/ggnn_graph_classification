package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k;
		int[] a = new int[61];
		while (n-- != 0)
		{
			k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (k == 0)
			{
				System.out.print("60\n");
				continue;
			}
			for (int i = 1;i <= k;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			int num = 0;
			for (int i = k;i >= 1;i--)
			{
				if (a[i] + i * 3 - 3 > 60)
				{
					continue;
				}
				if (a[i] + i * 3 >= 60)
				{
					num = a[i];
					break;
				}
				else
				{
					num = 60 - i * 3;
					break;
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
	  return 0;
	}

}

