package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100000];
		int b;
		int c;
		int f = 0;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i - 1] = b;
		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int j = 1;j <= n;j++)
		{
			if (a[j - 1] - c != 0)
			{
				if (f == 0)
				{
					System.out.print(a[j - 1]);
					f++;
				}
				else
				{
					System.out.print(" ");
					System.out.print(a[j - 1]);
				}
			}
		}
		return 0;
	}

}

