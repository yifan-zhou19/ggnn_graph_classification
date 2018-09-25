package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[50]);
	int i = 0;
	int flag = 0;
	c = new Scanner(System.in).nextLine();
	while (i <= c.length())
	{
	if (c.charAt(i) >= '0' && c.charAt(i) <= '9')
	{
		if (flag == 0)
		{
		flag = 1;
		System.out.printf("\n%c",c.charAt(i));
		}
	else
	{
		System.out.printf("%c",c.charAt(i));
	}
	}
	else
	{
		flag = 0;
	}
	i++;
	}
	}
}
