package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'a', so pointers on this parameter are left unchanged:
	public static int hefa(char * a)
	{
		for (; * a == '_' || (*a >= 'A' && *a <= 'Z') || (*a >= 'a' && *a <= 'z') || (*a >= '0' && *a <= '9') || *a == '\0';a++)
		{
			if (*a == '\0')
			{
				System.out.print("1\n");
				return 0;
			}
			else if (!(*a == '_' || (*a >= 'A' && *a <= 'Z') || (*a >= 'a' && *a <= 'z') || (*a >= '0' && *a <= '9')))
			{
				System.out.print("0\n");
				return 0;
			}
		}
		System.out.print("0\n");
		return 0;
	}
	public static int Main()
	{
		String zifu = new String(new char[2000000]);
		String p;
		int i;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			zifu = new Scanner(System.in).nextLine();
			p = zifu;
			if (p == '_' || (p >= 'A' && p <= 'Z') || (p >= 'a' && p <= 'z'))
			{
				hefa(p);
			}
			else
			{
				System.out.print("0\n");
			}
		}
		return 0;
	}

}

