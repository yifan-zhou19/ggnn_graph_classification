package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200000];
		int n;
		int m;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		i = 0;
		while (i < n)
		{
			m = 0;
			for (j = 0;j < n;j++)
			{
				if (a[i] == a[j] && i > j)
				{
					m = m + 1;
				}
			}
			if (m == 0 && i == 0)
			{
				 System.out.print(a[i]);
			}
			if (m == 0 && i != 0)
			{
				 System.out.print(' ');
				 System.out.print(a[i]);
			}
			i = i + 1;
		}
		return 0;
	}




}

