package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100000];
		int k;
		int i;
		int j;
		int p;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;)
		{
			if (a[i] == k)
			{
				for (j = i;j < n - 1;j++)
				{
					a[j] = a[j + 1];
				}
				n -= 1;
			}
			else
			{
				i++;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		System.out.print("\n");
		return 0;
	}
}

