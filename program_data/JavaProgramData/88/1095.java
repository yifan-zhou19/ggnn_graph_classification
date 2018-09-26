package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[30]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int i;
		int k;
		a = new Scanner(System.in).nextLine();
		k = a.length();
		p = a;
		for (p = a;p < a.Substring(k);p++)
		{
			if (*p >= '0' && *p <= '9' && *(p + 1) >= '0' && *(p + 1) <= '9')
			{
				System.out.printf("%c",*p);
			}
			if (*p >= '0' && *p <= '9' && (*(p + 1) < '0' || *(p + 1)>'9'))
			{
				System.out.printf("%c\n",*p);
			}
		}
	}
}
