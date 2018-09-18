package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[5]);
	a = new Scanner(System.in).nextLine();
	int i;
	for (i = a.length();i > 0;i--)
	{
	System.out.printf("%c",a.charAt(i - 1));
	}
	return 0;
	}
}
