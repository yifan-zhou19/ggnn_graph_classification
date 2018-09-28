package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[2000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * media;
		media = str;
		String min = new String(new char[2000]);
		String max = new String(new char[2000]);

		str = new Scanner(System.in).nextLine();
		int Mi = str.length() + 1;
		int Ma = 0;
		int strn;
		String p;
		p = str;
		for (;;)
		{
			if (*media == ' ' || *media == ',')
			{
				*media = '\0';
				strn = media - p;
				if (strn > Ma)
				{
					max = p;
					Ma = strn;
				}
				if (strn < Mi && strn != 0)
				{
					min = p;
					Mi = strn;
				}
				p = media + 1;
			}
			else if (*media == '\0')
			{
				strn = p.length();
				if (strn > Ma)
				{
					max = p;
					Ma = strn;
				}
				if (strn < Mi)
				{
					min = p;
					Mi = strn;
				}
				break;
			}
			media++;
		}
		System.out.println(max);
		System.out.println(min);
		return 0;
	}
}
