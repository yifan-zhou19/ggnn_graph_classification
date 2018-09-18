package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int[] b = new int[100];
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 100; i++)
		{
			 b[i] = 0;
		}
		for (i = 0; i < n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[a[i]]++;
			if (b[a[i]] == 1)
			{
				if (i > 0)
				{
				System.out.print(" ");
				}
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

