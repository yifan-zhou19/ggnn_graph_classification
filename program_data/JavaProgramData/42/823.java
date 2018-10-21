package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int n;
		int k;
		int i = 0;
		int j;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j < n;j++)
		{
			if (a[j] == k)
			{
				continue;
			}
			else
			{
				l++;
				if (l == 1)
				{
					System.out.print(a[j]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[j]);
				}
			}
		}





















		return 0;
	}
}

