package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int b;
		int c;
		int d;
		int i;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = b;
		}
		System.out.print(a[1]);
		for (c = 2;c <= n;c++)
		{
			for (d = 0;d <= c - 1;d++)
			{
				if (a[d] == a[c])
				{
					break;
				}
				else
				{
					continue;
				}
			}
			if (d == c)
			{
				System.out.print(" ");
				System.out.print(a[c]);
			}
		}

		return 0;
	}
}

