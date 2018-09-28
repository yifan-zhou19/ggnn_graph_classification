package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	a = new Scanner(System.in).nextLine(); //?????
	p = a;
	if (*p >= 48 && *p <= 57)
	{
	System.out.print(p);
	}
	p++;
	while (p - a <= a.length())
	{
	if (*p >= 48 && *p <= 57) //???????????
	{
			System.out.print(p);
	}
	else if (*(p - 1) >= 48 && *(p - 1) <= 57) //??????????
	{
			System.out.print("\n");
	}
		p++;
	}
	return 0;
	}

}
