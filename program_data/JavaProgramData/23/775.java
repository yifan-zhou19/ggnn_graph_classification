package <missing>;

public class GlobalMembers
{
	public static char swap(String str)
	{
		int n;
		int i;
		int j;
		n = str.length();
		for (i = n - 1;i >= 0;i--)
		{
		if (str[i].equals(' '))
		{
			break;
		}
		}
		for (j = i + 1;j < n;j++)
		{
			System.out.printf("%c",str[j]);
		}
		if (i > 0)
		{
		System.out.print(" ");
		str[i] = '\0';
		swap(str);
		}
	}
	public static int Main()
	{
		String str = new String(new char[101]);
		str = new Scanner(System.in).nextLine();
		swap(str);
	}
}
