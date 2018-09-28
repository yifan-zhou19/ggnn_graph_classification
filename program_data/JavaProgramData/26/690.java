package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[101]);
	a = new Scanner(System.in).nextLine();
	int i;
	int word = 0;
	for (i = 0;i < a.length() - 1;i++)
	{
		if (a.charAt(i) == ' ')
		{
			word = 0;
		}
		else
		{
			word = 1;
		}
		if (word == 1 && a.charAt(i + 1) != ' ')
		{
			System.out.printf("%c",a.charAt(i));
		}
		if (word == 1 && a.charAt(i + 1) == ' ')
		{
			System.out.printf("%c ",a.charAt(i));
		}
	}
	System.out.printf("%c",a.charAt(a.length() - 1));

	}
}
