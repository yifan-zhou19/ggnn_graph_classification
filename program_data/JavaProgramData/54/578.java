package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int s;
		int i;
		int n;
		int k;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;;i++)
		{
			s = n * i + k;
			for (j = 1;j < n;j++)
			{
				if (s % (n - 1) == 0)
				{
					s = s * n / (n - 1) + k;
				}
				else if (s % (n - 1) != 0)
				{
					break;
				}
			}
			if (j == n)
			{
				System.out.print(s);
				System.out.print("\n");
				return 0;
			}
		}
	}



}

