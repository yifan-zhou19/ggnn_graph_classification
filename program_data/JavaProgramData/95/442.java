package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		String str1 = new String(new char[300]);
		String str2 = new String(new char[300]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;str1.charAt(i) && str2.charAt(i);i++)
		{
			if (str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
			{
				str1.charAt(i) -= 32;
			}
			if (str2.charAt(i) >= 'a' && str2.charAt(i) <= 'z')
			{
				str2.charAt(i) -= 32;
			}
			if (str1.charAt(i) != str2.charAt(i))
			{
				System.out.print((str1.charAt(i) > str2.charAt(i))?">":"<");
				break;
			}
		}
		if (!str1.charAt(i) && !str2.charAt(i))
		{
			System.out.print("=");
		}

		return 0;
	}
}
