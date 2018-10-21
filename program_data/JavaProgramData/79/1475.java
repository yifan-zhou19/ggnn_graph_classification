package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int counter = 0;
		int num;
		int[] a = new int[300];
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			for (i = 0;i < 300;i++)
			{
				a[i] = 1;
			}
			num = n;
			i = -1;
			while (num > 1)
			{
				while (counter < m)
				{
					i++;
					if (i >= n)
					{
						i = 0;
					}
					if (a[i] == 1)
					{
						counter++;
					}
				}
				a[i] = 0;
				num--;
				counter = 0;
			}
			for (i = 0;i < n;i++)
			{
				if (a[i] != 0)
				{
					System.out.print((i + 1));
					System.out.print("\n");
				}
			}
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} while (n != 0 && m != 0);
		return 0;
	}
}

