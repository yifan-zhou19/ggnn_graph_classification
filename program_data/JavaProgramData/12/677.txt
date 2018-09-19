package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[18];
		int i;
		int n;
		int ii;
		int s;
		char c;
		while (true)
		{
			i = 1;
			while (true)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if ((a[i] == 0) || (a[i] == -1))
				{
					break;
				}
				i++;
			}
			if (a[i] == -1)
			{
				break;
			}
			n = i;
			i = 1;
			s = 0;
			while (i < n)
			{
				ii = 1;
				while (ii < n)
				{
					if (a[ii] == 2 * a[i])
					{
						s++;
					}
					ii++;
				}
				i++;
			}
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

