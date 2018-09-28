package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String[] p = new String[100];
		String[] family = new String[100];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * t;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * s;
		p = new Scanner(System.in).nextLine();
		for (t = p,s = family; * (t + 1) != '\0';t++,s++)
		{
			*s = t + *(t + 1);
		}
		*s = t + p[0];
		System.out.printf("%s",family);
	}

}
