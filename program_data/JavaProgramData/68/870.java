package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[60000];
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = 1;
		for (i = 2;i <= n;i++)
		{
			a[i] = a[i - 1] + 1;
		}
		for (i = 2;i <= n;i++)
		{
			if (a[i] != 0)
			{
				for (j = 2;j * i <= n;j++)
				{
					a[j * i] = 0;
				}
			}
		}
		for (j = 6;j <= n;j += 2)
		{
			for (i = 3;i <= j / 2;i++)
			{
				if (j == a[i] + a[j - i])
				{
					System.out.print(j);
					System.out.print("=");
					System.out.print(a[i]);
					System.out.print("+");
					System.out.print(a[j - i]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}
}

