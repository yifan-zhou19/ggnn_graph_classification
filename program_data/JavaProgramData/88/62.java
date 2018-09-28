package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
	String a = new String(new char[500]);
	a = new Scanner(System.in).nextLine();
	for (i = 0;i < a.length();i++)
	{
	if (a.charAt(i) >= '0' && a.charAt(i) <= '9')
	{
	System.out.print(a.charAt(i));
	}
	else
	{
		if (!(a.charAt(i) >= '0' && a.charAt(i) <= '9') && a.charAt(i + 1) >= '0' && a.charAt(i + 1) <= '9')
		{
	System.out.print("\n");
		}
	}
	}
	return 0;
	}
}
