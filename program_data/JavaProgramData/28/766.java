package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[10000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		int n;
		int len;
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (len = 0; * p;p++)
		{
			if (*p == ' ')
			{
				continue;
			}
			else
			{
				len++;
				if (*(p + 1) == ' ' || *(p + 1) == '\0')
				{
					System.out.printf("%d",len);
					if (*(p + 1) != '\0')
					{
						System.out.print(",");
					}
					len = 0;
				}
			}
		}
	}

}
