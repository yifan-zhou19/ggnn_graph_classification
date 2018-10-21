package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int m = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int temp = n - 1;
		for (int i = 1;;)
		{
			m = i * n + k;
			while (m % (n - 1) == 0)
			{
				m = m / (n - 1) * n + k;
				temp--;
				if (temp == 0)
				{
					System.out.print(m);
					break;
				}
			}
			if (temp == 0)
			{
				break;
			}
			i++;
			temp = n - 1;
		}
		return 0;
	}
}

