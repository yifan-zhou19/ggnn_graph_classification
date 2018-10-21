package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int ii;
		int tf;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 2;
		while (i < m / 2 + 1)
		{
			ii = 1;
			while (ii < (i / 2 + 1))
			{
				ii = ii + 1;
				if (i % ii == 0)
				{
					tf = 0;
					break;
				}
				else
				{
					tf = 1;
				}
			}
			ii = 1;
			while (ii < ((m - i) / 2 + 1))
			{
				ii = ii + 1;
				if ((m - i) % ii == 0)
				{
					tf = 0;
				}
				else
				{
					tf = tf * 1;
				}
			}
			if ((tf == 1) && (i != 1) && (m - i != 1))
			{
				System.out.print(i);
				System.out.print(" ");
				System.out.print((m - i));
				System.out.print("\n");
			}
			i++;
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}



}

