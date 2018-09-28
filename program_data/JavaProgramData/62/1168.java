package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	String str = new String(new char[100]);
	int i;
	str = new Scanner(System.in).nextLine();
	for (i = 0;i < str.length();i++)
	{
	if (str.charAt(i) != ' ')
	{
	System.out.printf("%c",str.charAt(i));
	}
	else if (str.charAt(i) == ' ')
	{
		if (str.charAt(i - 1) != ' ')
		{
	System.out.printf("%c",str.charAt(i));
		}
	}
	}

	return 0;
	}
}
