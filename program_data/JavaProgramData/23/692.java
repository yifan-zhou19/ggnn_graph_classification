package <missing>;

public class GlobalMembers
{
	public static void fanzhuan(tangible.RefObject<String> a, int begin, int end)
	{
		for (int i = 0; i < (end - begin + 1) / 2; i++)
		{
			 char ch = a.argValue.charAt(begin + i);
			 a.argValue.charAt(begin + i) = a.argValue.charAt(end - i);
			 a.argValue.charAt(end - i) = ch;
		}
	}
	public static int Main()
	{
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		int i = 0;
		int j = 0;
		for (; j <= (int)a.length(); j++)
		{
			if (a.charAt(j) == ' ' || a.charAt(j) == '\0')
			{
			 tangible.RefObject<String> tempRef_a = new tangible.RefObject<String>(a);
				 fanzhuan(tempRef_a, i, j - 1);
				 a = tempRef_a.argValue;
				 i = j + 1;
			}
		}
	tangible.RefObject<String> tempRef_a2 = new tangible.RefObject<String>(a);
		fanzhuan(tempRef_a2, 0, a.length() - 1);
		a = tempRef_a2.argValue;
		System.out.printf("%s\n", a);
		return 0;
	}
}

