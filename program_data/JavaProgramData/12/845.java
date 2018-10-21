package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int num;
		while (true)
		{
			for (i = 0;i < 16;i++)
			{
		   a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[0] == -1)
				{
					return 0;
				}
				if (a[i] == 0)
				{
					break;
				}
			}
			num = 0;
			for (i = 0;a[i] != 0;i++)
			{
				for (j = 0;a[j] != 0;j++)
				{
					if (a[i] == 2 * (a[j]))
					{
						num++;
					}
				}
			}
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}
}

