package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		int i;
		int[] b = new int[400];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = String.valueOf(a[i]).length();
		}
		int num;
		int length = b[1];
		i = 1;
		System.out.print(a[1]);
		while (true)
		{
			if (i > 1)
			{
			length = length + 1 + b[i];
			}
				if (length + 1 + b[i + 1] <= 80)
				{
					System.out.print(" ");
					System.out.print(a[i + 1]);
				}
				else
				{
					System.out.print("\n");
					System.out.print(a[i + 1]);
					length = -1;
				}
			i++;
			if (i == n)
			{
				break;
			}
		}
		return 0;
	}
}

