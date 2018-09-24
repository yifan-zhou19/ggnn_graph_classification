package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[501]);
	int a;
	int i;
	int j;
	int m;
	int n;
	c = new Scanner(System.in).nextLine();
	n = c.length();
	for (m = 2;m <= n;m++)
	{
	for (i = 0;i <= n - m;i++)
	{
	a = 0;
	for (j = i;j < m + i;j++)
	{
	if (c.charAt(j) != c.charAt(m + i - j + i - 1))
	{
		a = 1;
		break;
	}
	}
	if (a == 0)
	{
	for (j = i;j < m + i;j++)
	{
	System.out.printf("%c",c.charAt(j));
	}
	System.out.print("\n");
	}
	}
	}
	return 0;
	}

}
