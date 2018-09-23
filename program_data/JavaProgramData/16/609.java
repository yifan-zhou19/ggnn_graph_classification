package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String a = new String(new char[6]);
	a = new Scanner(System.in).nextLine();
	n = a.length();
	for (i = n - 1;i >= 0;i--)
	{
		System.out.printf("%c",a.charAt(i));
	}
	}
}
