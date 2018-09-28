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
		for (p = str; * (p - 1) != '\n';p++)
		{
			String tempVar = ConsoleInput.scanfRead(null, 1);
			if (tempVar != null)
			{
				p = tempVar.charAt(0);
			}
		}
		int countspace = 0;
		start = str;

		for (p = str; * p != '\n';p++)
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
						for (p = start.Substring(1); * (p - 1) != '\n';p++)
						{
							*p = (p + countspace-1);
						}
					}
					countspace = 0;
					p = start.Substring(1);
				}
			}
		}
		for (p = str; * (p - 1) != '\n';p++)
		{
			System.out.printf("%c",*p);
		}
		return 0;
	}
}

