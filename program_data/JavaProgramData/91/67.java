package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String sz = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char first;
		p = sz;
		p = new Scanner(System.in).nextLine();
		first = p;
		for (; * (p + 1) != '\0';p++)
		{
			*p = p + *(p + 1);
		}
		*p += first;
		*(p + 1) = '\0';
		System.out.printf("%s",sz);
	}

}
