package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] number = new int[16];
		int m;
		int i = 1;
		while (m != -1)
		{
			do
			{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				number[i] = m;
				i++;
			}while (m != 0 && m != -1);
			int k = 1;
			int t;
			int j = 0;
			for (k = 1;k <= i - 1;k++)
			{
				t = number[k];
				int p;
				for (p = 1;p <= i - 1;p++)
				{
					if (t == 2 * number[p])
					{
						j++;
					}
					else
					{
						continue;
					}
				}
			}
		if (m != -1)
		{
			System.out.print(j - 1);
			System.out.print("\n");
		}
		else
		{
			break;
		}
		i = 1;
		j = 0;
		}
		return 0;
	}
}

