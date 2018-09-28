package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		final String STR = " ";
		final String str = " ";
		final String str1 = " ";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		STR = new Scanner(System.in).nextLine();
		STR += str;
		str += STR;
		n = str.length();
		s = str1;
		for (p = str.Substring(n) - 2;p >= str;p--)
		{
			if (*p == ' ')
			{
				q = p + 1;
				do
				{
					*s = q;
					s++;
					q++;
				} while (*q != ' ');
				*s = ' ';
				s++;
			}
			else
			{
				continue;
			}
		}
		*(s - 1) = '\0';
		System.out.printf("%s",str1);
	}



}
