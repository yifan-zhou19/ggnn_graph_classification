package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			String s = new String(new char[110]);
			String s1 = new String(new char[110]);
			int l;
			int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(s,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(s1,0,(Character.SIZE / Byte.SIZE));
			s = new Scanner(System.in).nextLine();
			l = s.length();
			for (i = 0;i < l - 1;i++)
			{
					s1 = tangible.StringFunctions.changeCharacter(s1, i, s.charAt(i) + s.charAt(i + 1));
			}
			s1 = tangible.StringFunctions.changeCharacter(s1, l - 1, s.charAt(0) + s.charAt(l - 1));
			System.out.printf("%s\n",s1);
	}

}

