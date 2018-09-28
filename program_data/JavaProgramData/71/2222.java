package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int b;
	int c;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (a % 4 == 0 && (a % 100 != 0 || a % 400 == 0))
	{
	int[] m = {0, 3, 4, 7, 9, 12, 14, 17, 20, 22, 25, 27};
	if ((m[b - 1] - m[c - 1]) % 7 == 0)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	}
	else
	{
	int[] p = {0, 3, 3, 6, 8, 11, 13, 16, 19, 21, 24, 26};
	if ((p[b - 1] - p[c - 1]) % 7 == 0)
	{
		System.out.print("YES");
		System.out.print("\n");
	}
	else
	{
		System.out.print("NO");
		System.out.print("\n");
	}
	}
	}
	return 0;
	}




}

