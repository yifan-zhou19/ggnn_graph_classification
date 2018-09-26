import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	 *file:1000012776_5.cpp
	 *author : ???1000012776
	 *date : 12-12
	 *discription : ??????????????
	 */
	public static int Main()
	{
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p; //?????????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q;
		int flag = 0; //?????flag?0?
		str = new Scanner(System.in).nextLine();
		for (p = str ; ; p++) //???????????
		{
			if (*p == ' ' && flag == 1) //??????????????????????????
			{
				for (q = p ; ; q++) //????????????????
				{
					*q = (q + 1);
					if (*q == '\0')
					{
						break;
					}
				}
				p--; //p???????
			}
			if (*p == ' ')
			{
				flag = 1; //???????????????
			}
			else
			{
				flag = 0;
			}
			if (*p == '\0')
			{
				break;
			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}
}
