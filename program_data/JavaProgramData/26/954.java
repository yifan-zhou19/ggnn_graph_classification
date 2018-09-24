package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[101]);
	a = new Scanner(System.in).nextLine();
	char b = a.charAt(0);
	for (int i = 0;a.charAt(i);i++)
	{
	if ((b == ' ') && (a.charAt(i) == ' '))
	{
	continue;
	}
	else
	{
	System.out.printf("%c",a.charAt(i));
	b = a.charAt(i);
	}
	}
	System.out.print("\n");
	return 0;
	}

}
