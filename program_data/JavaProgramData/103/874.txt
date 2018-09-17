package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char temp;
		int i;
		int count = 0;
		p = str;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		temp = str;
		if (temp > 'Z')
		{
			temp -= 32;
		}
		count++;
		while (*++p != 0)
		{
			if (*p == temp || *p - 32 == temp)
			{
				count++;
			}
			else
			{
				System.out.printf("(%c,%d)",temp,count);
				count = 1;
				temp = p;
				if (temp > 'Z')
				{
					temp -= 32;
				}
			}
		}
		System.out.printf("(%c,%d)",temp,count);
		return 0;
	}
}

