package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String s1 = new String(new char[LEN]);
		String s2 = new String(new char[LEN]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String h;
		int i;
		s1 = new Scanner(System.in).nextLine();
		h = p1 = s1;
		p2 = s2;
		while (*p1 != 0)
		{
			if (*(p1 + 1) == 0)
			{
				*p2 = h + *p1;
			}
			else
			{
				*p2 = p1 + *(p1 + 1);
			}
			p1++;
			p2++;
		}
		*p2 = 0;
		System.out.printf("%s",s2);
	}
}
