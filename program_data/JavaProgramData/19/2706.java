package <missing>;

public class GlobalMembers
{
	public static String buffer = new String(new char[1024]);
	public static String word = new String(new char[1024]);
	public static String replace = new String(new char[1024]);
	public static String current = new String(new char[1024]);

	public static int Main()
	{
		buffer = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			word = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			replace = tempVar2.charAt(0);
		}

		int buffer_len = buffer.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * buffer_ptr = buffer;
		String buffer_end = buffer.Substring(buffer_len);

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * current_ptr = current;
		while (buffer_ptr < buffer_end)
		{
			if (*buffer_ptr == ' ')
			{
				*current_ptr = '\0';
				if (strcmp(word, current) == 0)
				{
					System.out.printf("%s ", replace);
				}
				else
				{
					System.out.printf("%s ", current);
				}
				current_ptr = current;
			}
			else
			{
				*current_ptr = buffer_ptr;
				++current_ptr;
			}
			++buffer_ptr;
		}
		*current_ptr = '\0';
		if (strcmp(word, current) == 0)
		{
			System.out.printf("%s", replace);
		}
		else
		{
			System.out.printf("%s", current);
		}

		return 0;
	}
}

