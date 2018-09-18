package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		for (int i = 0 ; i < n ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (int i = 1 ; i < n ; i++)
		{
			for (int k = 0 ; k < i ; k++)
			{
				if (a[i] == a[k])
				{
					break;
				}
				if (k == i - 1)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
		}
		System.out.print("\n");
		return 0;
	}

}

