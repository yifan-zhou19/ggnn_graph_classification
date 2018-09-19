package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (a[i] == 0)
				{
				break;
				}
				if (a[j] == a[i])
				{
					for (k = j;k < n;k++)
					{
					a[k] = a[k + 1];
					}
				a[k] = 0;
				l = l + 1;
				}
			}
		}
		for (i = 0;i < n - l;i++)
		{
				if (i == 0)
				{
				System.out.print(a[i]);
				}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

