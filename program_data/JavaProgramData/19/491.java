package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
		String p3;
		String[] p = new String[100];
		int i = 0;
		int j;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		p1 = str1;
		p2 = str2;
		p3 = str3;
		p[0] = str1;
		for (; * p1 != '\0';p1++)
		{

			if (*p1 == ' ')
			{
				i++;
				*p1 = '\0';
			p[i] = p1 + 1;
			}
		}

		for (j = 0;j <= i;j++)
		{
			if (strcmp(p[j],p2) == 0)
			{
				p[j] = p3;
			}
		}

		for (j = 0;j < i;j++)
		{
			System.out.printf("%s ",p[j]);
		}
		System.out.printf("%s",p[i]);

	}

}
