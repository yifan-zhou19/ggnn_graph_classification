import java.util.*;

package <missing>;

public class GlobalMembers
{
	//********************************
	//????1000012825             *
	//??????                   *
	//???12.10                    *
	//?????????             *
	//********************************
	public static int Main()
	{
		String str = new String(new char[30]);
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str;
		int flag = 0; //???????
		for (p = str; * p != '\0'; p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
				flag = 1; //????????????flag = 1
			}
			else
			{
				if (flag == 1)
				{
					System.out.print("\n");
					flag = 0; //????????flag = 0,???????????????
				}
			}
		}
		System.out.print("\n");
		return 0;
	}



}
