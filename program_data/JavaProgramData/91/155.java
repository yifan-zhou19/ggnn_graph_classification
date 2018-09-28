package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String s = new String(new char[9999]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s1;
		String s2;
		s = new Scanner(System.in).nextLine();
		s0 = s;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s1 = (String)malloc((Character.SIZE / Byte.SIZE));
		s2 = s1;
		for (i = 0;i < s.length() - 1;i++)
		{
			*s1 = s0 + *(s0 + 1);
			s1++;
			s0++;
		}
		*s1++=*s + *s0;
		*s1 = '\0';
		System.out.printf("%s",s2);
		return 0;
	}
}
