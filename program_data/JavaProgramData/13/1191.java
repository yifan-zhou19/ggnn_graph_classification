package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int[] count = new int[101];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			count[a[i]]++;
		}
		System.out.print(a[1]);
		count[a[1]] = 0;
		for (i = 2 ; i <= n; i++)
		{
			if (count[a[i]] >= 1)
			{
				System.out.print(" ");
				System.out.print(a[i]);
				count[a[i]] = 0;
			}
		}
		System.out.print("\n");
		return 0;
	}
}

