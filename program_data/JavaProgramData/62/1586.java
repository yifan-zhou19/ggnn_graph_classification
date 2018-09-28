package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[201]);
		str = new Scanner(System.in).nextLine();
		int i;
		int l = str.length();
		for (i = 0; i < l; i++)
		{
			if (!(i > 0 && *(str.Substring(i)) == ' ' && *(str.Substring(i) - 1) == ' '))
			{
				System.out.printf("%c", *(str.Substring(i)));
			}
		}
		return 0;
	}
}
