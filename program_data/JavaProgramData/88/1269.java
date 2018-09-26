package <missing>;

public class GlobalMembers
{
	//****************************************************************************
	//????????????????                                           *
	//????wayne                                                              *
	//?????12.4                                                             *
	//****************************************************************************
	public static int Main()
	{
		String str = new String(new char[30]);
		str = new Scanner(System.in).nextLine(); //?????????
		int len; //?flag????????
		int flag;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str; //????????
		len = str.length(); //???????
		for (;p <= str.charAt(len - 1);p++)
		{
			if (*p == '-') //??????
			{
				for (p++;p <= str.charAt(len - 1);p++)
				{
					if (*p >= 48 && *p <= 57) //???????
					{
						continue;
					}
					else //??????????
					{
						System.out.print("\n");
						flag = 1; //flag???1????????????
						break;
					}
				}
			}
			else
			{
				if (*p >= 48 && *p <= 57) //??????
				{
					System.out.print(p);
					 flag = 0; //??flag???0???????????
				}
				else if (flag == 0) //?????? flag??
				{
					System.out.print("\n");
					flag++; //????????
				}
			}
		}
		return 0;
	}
}
