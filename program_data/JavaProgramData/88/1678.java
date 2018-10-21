package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[32]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * t = s;
	int b;
	s = new Scanner(System.in).nextLine();
	for (;(*t) != '\0';t++)
	{
		if ((b = t) > 47 && (b = t) < 58)
		{
		System.out.printf("%c",*t);
	continue;
		}
	else if ((b = (t - 1)) > 47 && (b = (t - 1)) < 58)
	{
		System.out.print("\n");
	continue;
	}
	}
	return 0;
	}
}
