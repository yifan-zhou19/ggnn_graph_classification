package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		final String s = "";
		final String a = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		s = new Scanner(System.in).nextLine();
		int count = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		p1 = s;
		p2 = s;
		while (*p1 != '\0')
		{
			while (*p1 != ' ' && *p1 != '\0')
			{
			p1++;
			}


			for (i = 0,p = p2;p < p1;p++,i++)
			{
				a.charAt(count)[i] = *p;
			}
			count++;
			p1++;
			p2 = p1;
		}

		for (i = count - 1;i > 0;i--)
		{
			System.out.printf("%s ",a.charAt(i));
		}
		System.out.printf("%s\n",a.charAt(0));
	}



}
