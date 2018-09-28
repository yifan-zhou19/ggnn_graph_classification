package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
	String a = new String(new char[100]);
	int n;
	int i;
	a = new Scanner(System.in).nextLine();
	n = a.length();
	if (a.charAt(0) != ' ')
	{
		System.out.printf("%c",a.charAt(0));
	}
	for (i = 1;i < n;i++)
	{
	if (a.charAt(i) != ' ')
	{
		System.out.printf("%c",a.charAt(i));
	}
	else
	{
		if (a.charAt(i - 1) != ' ')
		{
			System.out.printf("%c",a.charAt(i));
		}
	}
	}



	}
}
