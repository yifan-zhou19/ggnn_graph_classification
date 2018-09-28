package <missing>;

public class GlobalMembers
{
	// ?????? ???1000010500 
	// ??????? 
	// 2010-12-8


	public static int Main()
	{
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int flag = 0; // flag???????????
		str = new Scanner(System.in).nextLine();
		for (p = str; * p != '\0';p++)
		{
			if (*p == ' ' && flag == 0) // ?????
			{
				flag = 1;
				continue;
			}
			if (*p == ' ' && flag == 1) // ?????????????
			{
				*p = '1'; // ?????????
				continue;
			}
			if (*p != ' ')
			{
				flag = 0;
			}
		}
		for (p = str; * p != '\0';p++)
		{
			if (*p != '1')
			{
				System.out.print(p);
			}
		}
		return 0;
	}

}
