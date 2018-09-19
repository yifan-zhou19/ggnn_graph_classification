package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[101]);
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		String s4 = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		char[][] s3 = new char[100][101];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String p3 = new String(new char[101]);
		int n;
		int i;
		n = s.length();
		p = s;
		p3 = s3;
		i = 0;
		for (p = s;p <= (s.Substring(n));p++)
		{
			if ((*p == ' ') || (*p == '\0'))
			{
				*((*p3) + i) = '\0';
				p3 = p3.Substring(1);
				i = 0;
			}
			else
			{
				*((*p3) + i) = *p;
				i++;
			}
		}
		*((*p3)) = '\0';
		for (p3 = s3; * ((*p3)) != '\0';p3++)
		{
			if (strcmp(*p3,s1) == 0)
			{
				*p3 = s2;
			}
		}
		p3 = s3;
		s4 = p3;
		for (p3 = s3 + 1; * ((*p3)) != '\0';p3++)
		{
			s4 += " ";
			s4 += *p3;
		}
		System.out.println(s4);
	}
}
