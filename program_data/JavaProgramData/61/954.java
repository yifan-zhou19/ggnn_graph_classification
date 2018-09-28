package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n];
		int i;
		int j = 0;
		int f1;
		int f2;
		int p = 0;
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			f1 = 1;
			f2 = 1;
			p = 1;
			if (a[i] == 1 || a[i] == 2)
			{
				System.out.print("1");
				System.out.print("\n");
			}
			else
			{
				for (j = 1;j <= a[i] - 1;j++)
				{
					p = f1;
					f1 = f2;
					f2 = f2 + p;
				}
				System.out.print(f1);
				System.out.print("\n");
			}
		}
	return 0;
	}
}

