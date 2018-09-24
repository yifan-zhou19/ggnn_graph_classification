package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[100]);
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		String t = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p1;
		int i = 0;
		str = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (p = str; * (p - 1) != '\0';p++)
		{
			if (*p == ' ' || *p == '\0') //??????
			{
				*(t.Substring(i)) = '\0'; //?????
				if (strcmp(s1,t) == 0) //????
				{
					p1 = s2;
				}
				else
				{
					p1 = t; //??
				}

				if (p - t.length() != str) //???????
				{
					System.out.print(' ');
				}
				System.out.printf("%s",p1);
				i = 0;
			}
			else
			{
				*(t.Substring(i)) = *p;
				i++;
			}
		}
	}
}
