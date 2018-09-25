package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[101]);
		String str2 = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str1,0,101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str2,0,101 * (Character.SIZE / Byte.SIZE));
		str1 = new Scanner(System.in).nextLine();
		int len = str1.length();
		int i;
		for (i = 1;i <= len - 1;i++)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i - 1, str1.charAt(i - 1) + str1.charAt(i));
		}
		str2 = tangible.StringFunctions.changeCharacter(str2, len - 1, str1.charAt(len - 1) + str1.charAt(0));
		System.out.printf("%s\n",str2);
	}

}

