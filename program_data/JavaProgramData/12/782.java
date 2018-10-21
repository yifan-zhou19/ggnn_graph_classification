package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[17];
		int i;
		int j;
		int k;
		int s;
		int n;
		for (k = 1;;k++)
		{
			s = 0;
			n = 0;
			for (i = 1;;i++)
			{
				a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				n++;
				if (a[i] == 0 || a[i] == -1)
				{
					break;
				}
			}
			if (a[n] == -1)
			{
				break;
			}
			for (i = 1;i < n;i++)
			{
				for (j = i + 1;j <= n;j++)
				{
					if ((a[i] * 2 == a[j]) || (a[j] * 2 == a[i]))
					{
						s++;
					}
				}
			}
			System.out.print(s);
			System.out.print("\n");

		}
		return 0;
	}

}

