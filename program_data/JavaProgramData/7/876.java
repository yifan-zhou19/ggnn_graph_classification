package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[256]);
		String subString = new String(new char[256]);
		String replacement = new String(new char[256]);
		String n = null;
		int l;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		memset(String, '\0', sizeof(String));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(subString, '\0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(replacement, '\0', (Character.SIZE / Byte.SIZE));
		String = ConsoleInput.readToWhiteSpace(true);
		subString = ConsoleInput.readToWhiteSpace(true).charAt(0);
		replacement = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = tangible.StringFunctions.strStr(String, subString);
		l = subString.length();
		if (n != null)
		{
			for (i = 0; i < l; i++)
			{
				n = tangible.StringFunctions.changeCharacter(n, i, replacement.charAt(i));
			}
		}
		System.out.print(String);
		System.out.print("\n");
		return 0;
	}
}

