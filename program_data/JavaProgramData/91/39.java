package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len;
		String str = new String(new char[102]);

		str = new Scanner(System.in).nextLine();

		len = str.length();
		*(str.Substring(len)) = *str;

		for (i = 0; i < len; i++)
		{
			*(str.Substring(i)) = *(str.Substring(i)) + *(str.Substring(i) + 1);
		}

		for (i = 0; i < len; i++)
		{
			System.out.printf("%c", *(str.Substring(i)));
		}

		return 0;
	}
}
