package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					i -= 1;
					n -= 1;
					break;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (i > 0)
			{
				System.out.print(" ");
			}
			System.out.print(a[i]);
		}
		return 0;
	}
}

