package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100001];
		int k;
		int b = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = n;
		for (i = n;i >= 1;i--)
		{
			if (a[i] == k)
			{
				b--;
			}
			if (a[i] != k)
			{
				break;
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] != k)
			{
				if (i < b)
				{
					System.out.print(a[i]);
					System.out.print(' ');
				}
				else
				{
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}
}

