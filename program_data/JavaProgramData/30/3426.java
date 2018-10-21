package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int s = 0;
		int n;
		int i;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			if (i % 7 == 0)
			{
				a[i] = 1;
			}
			else
			{
				k = i;
				while (k != 0)
				{
					if (k % 10 == 7)
					{
						a[i] = 1;
						break;
					}
					k = k / 10;
				}
			}
		}
		for (i = 1; i <= n; i++)
		{
			if (a[i] != 1)
			{
				s = s + i * i;
			}
		}
		System.out.print(s);
		return 0;
	}

}

