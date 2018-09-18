package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[20000];
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (int j = 1;j < n;j++)
		{
			l = 0;
			for (int k = j - 1;k >= 0;k--)
			{
				if (a[j] != a[k])
				{
					l = l;
				}
				else
				{
					l = l + 1;
				}
			}
			if (l == 0)
			{
				System.out.print(" ");
				System.out.print(a[j]);
			}
		}
		System.out.print("\n");
		return 0;
	}



}

