package <missing>;

public class GlobalMembers
{
	//?? C ???

	//??????
	public static int isKeyWord(tangible.RefObject<String> str)
	{
		int i;
		String[] keyword = {"auto", "break", "case", "char", "const", "continue", "default", "do", "double", "else", "enum", "extern", "float", "for", "goto", "if", "int", "long", "register", "return", "short", "signed", "sizeof", "static", "struct", "switch", "typedef", "union", "unsigned", "void", "volatile", "while"};

		for (i = 0; i < 32; i++)
		{
			if (strcmp(str.argValue, keyword[i]) == 0)
			{
				return 1;
			}

		}
		return 0;
	}

	//??????C?????
	public static int islegalIdentifier(tangible.RefObject<String> str)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str.argValue;
		if (isKeyWord(str) != 0)
		{
			return 0;
		}

		if (!((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p == '_')))
		{
			return 0;
		}

		while (*p != '\0')
		{
			if (!((*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z') || (*p == '_') || (*p >= '0' && *p <= '9')))
			{
				return 0;
			}
			p++;
		}
		return 1;
	}

	public static int Main()
	{
		String buffer = new String(new char[21]);
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		buffer = new Scanner(System.in).nextLine();

		for (i = 0; i < n; i++)
		{
			buffer = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_buffer = new tangible.RefObject<String>(buffer);
			if (islegalIdentifier(tempRef_buffer) != 0)
			{
				buffer = tempRef_buffer.argValue;
				System.out.println("yes");
			}
			else
			{
				buffer = tempRef_buffer.argValue;
				System.out.println("no");
			}
		}

		return 0;
	}

}

