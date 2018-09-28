package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012907_3.cpp
	* @author ???
	* @date 2010?12?11
	* @description
	* ??????: ???? 
	*/
	public static int Main()
	{
		String str = new String(new char[31]);
		int len;
		int i;
		int flag;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		str = new Scanner(System.in).nextLine();
		len = str.length();
		for (p = str; p < str.Substring(len); p++)
		{
			if (*p - '0' >= 0 && *p - '0' <= 9)
			{
				System.out.print(p);
				flag = 0;
			}
			else if (flag == 0)
			{
				System.out.print("\n");
				flag = 1;
			}
		}
		return 0;
	}
}
