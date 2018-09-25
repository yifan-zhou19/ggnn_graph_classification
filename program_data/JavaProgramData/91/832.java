package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char *s = (char*)malloc(101 *sizeof(char));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char s = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		s = new Scanner(System.in).nextLine();
		int i = 0;
		for (i = 0;i < s.length();i++)
		{
			if (i < s.length() - 1)
			{
				System.out.printf("%c",(char)(*(s + i) + *(s + i + 1)));
			}
			else
			{
				System.out.printf("%c\n",(char)(*(s + i) + s));
			}
		}

		return 0;
	}
}
