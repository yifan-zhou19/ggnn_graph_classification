package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		a = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		p = a;
		q = b;
		*q = p;
		q = b.Substring(1);
		for (p = a.Substring(1); * p != '\0';p++)
		{
			if (*(p) == ' ' && *(p - 1) == ' ')
			{
				continue;
			}
			*q = p;
			q++;
		}

		*q = '\0';
		System.out.print(b);
			return 0;
	}
}
