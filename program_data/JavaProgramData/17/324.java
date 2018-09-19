package <missing>;

public class GlobalMembers
{
	public static char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static int[] zuo = new int[101];
	public static int n = 0;
	public static void change(int x)
	{
		if (a[x] != 0)
		{
			if (a[x] == '(')
			{
				zuo[++n] = x;
			}
			else if (a[x] == ')')
			{
				if (n > 0)
				{
					a[x] = ' ';
					a[zuo[n--]] = ' ';
				}
			}
			else
			{
				a[x] = ' ';
			}
			change(x + 1);
		}

	}
	public static int Main()
	{
		while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(a);
			System.out.print("\n");
			n = 0;
			change(0);
			for (int i = 0;a[i] != 0;i++)
			{
				if (a[i] == '(')
				{
					System.out.print("$");
				}
				else if (a[i] == ')')
				{
					System.out.print("?");
				}
				else
				{
					System.out.print(a[i]);
				}
			}
			System.out.print("\n");
		}

		return 0;
	}
}

