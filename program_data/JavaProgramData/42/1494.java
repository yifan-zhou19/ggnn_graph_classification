package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int l;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n;
		for (int i = 0;i < l;)
		{
			if (a[i] == k)
			{
				for (int j = i;j < l - 1;j++)
				{
					a[j] = a[j + 1];
				}
				l--;
			}
			else
			{
				i++;
			}
		}
		for (int i = 0;i < l;i++)
		{
			System.out.print(a[i]);
			if (i != l - 1)
			{
				System.out.print(' ');
			}
		}
		return 0;
	}
}

