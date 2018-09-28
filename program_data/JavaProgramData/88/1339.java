package <missing>;

public class GlobalMembers
{
	//leave out and get the integers in a string
	public static int[] a = new int[30];
	public static String str = new String(new char[31]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	public static char * pt = str;
	public static int getint()
	{
		if (*pt == '\0')
		{
			return -1;
		}
		int sum = 0;
		while ('0' <= *pt && '9' >= *pt)
		{ //the egg pain segmentation fault!
			sum *= 10;
			sum = sum + *pt - '0';
			pt++;
		}
		return sum;
	}
	public static void skipstring()
	{
		while (*pt && (*pt < '0' || *pt>'9'))
		{
			pt++;
		}
	}
	public static int Main()
	{
		str = new Scanner(System.in).nextLine();
		int i = 0;
		for (i = 0;i < 30;i++)
		{
			a[i] = -1; //means initialized
		}
		i = 0;
		while (*pt != '\0')
		{
			skipstring();
			a[i] = getint();
			i++;
		}
		for (i = 0;i < 30;i++)
		{
			if (a[i] != -1)
			{
				System.out.printf("%d\n",a[i]);
			}
		}
		return 0;
	}

}
