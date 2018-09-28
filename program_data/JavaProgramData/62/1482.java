package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String start;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		str = (String)calloc(1000,(Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();

		int countspace = 0;
		start = str;

		for (p = str; * p != '\0';p++)
		{
			if (*p == ' ')
			{
				if (*(p - 1) != ' ')
				{
					start = p;
				}
				countspace++;
				if (*(p + 1) != ' ')
				{
					if (countspace > 1)
					{
						for (p = start.Substring(1); * (p - 1) != '\0';p++)
						{
							*p = (p + countspace-1);
						}
					}
					countspace = 0;
					p = start.Substring(1);
				}
			}
		}

		System.out.println(str);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(str);
		return 0;
	}
}
