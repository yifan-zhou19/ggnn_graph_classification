package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		String s1 = new String(new char[101]);
		String s2 = new String(new char[101]);
		String p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		s1 = new Scanner(System.in).nextLine();
		p = s1;
		q = s2;
		n = s1.length();
		for (i = 0; * (p.Substring(i) + 1) != '\0';i++)
		{
		   *q = (*(p.Substring(i))) + (*(p.Substring(i) + 1));
		   q++;
		}
		*(q++) = *(p.Substring(n) - 1) + p;
		*(q++) = '\0';
		System.out.println(s2);
		return 0;
	}
}
