package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[100000];
		int i;
		int j;
		int k;
		int l = 0;
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			if (a[i] != k)
			{
				if (l == 0)
				{
					System.out.print(a[i]);
					l = 1;
				}
				else
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

