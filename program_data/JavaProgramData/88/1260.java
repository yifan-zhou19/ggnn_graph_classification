package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[31]);
		str = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;


		int flag = 0;
		while (p < str + str.length())
		{
			if ((*p >= '0') && (*p <= '9'))
			{
					System.out.print(p);
					flag = 1;
			}
			else
			{
					if (flag == 1)
					{
					   System.out.print("\n");
					}
					flag = 0;
			}
			p++;
		}

		return 0;
	}
}
