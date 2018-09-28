package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String str1 = new String(new char[1000]);
		int[] a = new int[122];
		int i;
		int l;
		str = new Scanner(System.in).nextLine();
		l = str.length();
		for (i = 0;i < l - 1;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str.charAt(i) + str.charAt(i + 1));
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, l - 1, str.charAt(l - 1) + str.charAt(0));
		for (i = 0;i < l;i++)
		{
			System.out.printf("%c",str1.charAt(i));
		}
		return 0;
	}


}

