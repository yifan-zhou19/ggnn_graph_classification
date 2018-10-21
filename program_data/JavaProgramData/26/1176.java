package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[101]);
	int i;
	int n;
	int b;
	int j;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = 0;i < n;i++)
	{
	if (a.charAt(i) == ' ')
	{
	if (a.charAt(i + 1) == ' ')
	{
	continue;
	}
	else
	{
		System.out.printf("%c",a.charAt(i));
	}
	}
	else
	{
		System.out.printf("%c",a.charAt(i));
	}
	}
	return 0;
	}

}
