package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[1000]);
	c = new Scanner(System.in).nextLine();
	int i;
	int n;
	int j;
	int t = 0;
	n = c.length();
	for (i = t;i < n;i++)
	{
	if ((c.charAt(i) >= '0') && (c.charAt(i) <= '9'))
	{
	System.out.print(c.charAt(i));
	}
	else
	{
	for (j = i;j < n;)
	{
	if ((c.charAt(j) >= '0') && (c.charAt(j) <= '9'))
	{
	System.out.print("\n");
	t = j - 1;
	j = n;
	}
	else
	{
	j = j + 1;
	}
	}
	}
	}
	return 0;
	}
}
