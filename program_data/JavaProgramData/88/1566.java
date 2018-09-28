import java.util.*;

package <missing>;

public class GlobalMembers
{
	//* * * * * * * * * * * * * * * * * * * * * * * * 
	//*????????                             *
	//*????????.cpp                         *
	//*?????  1000012839                       *
	//*???2010.12.09                             *
	//* * * * * * * * * * * * * * * * * * * * * * * * 


	public static int Main()
	{
		String str = new String(new char[31]); //    ?????str?
		int i; //    ??????i,j?
		int j;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null; //    ?????

		str = new Scanner(System.in).nextLine();
		p = str; //    ????????????
		i = 0;
		while (str.charAt(i) != '\0')
		{
			i++; //    ??i?????????
		}
		for (j = 0; j < i; j++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.print(p);
				if (*(p + 1) < '0' || *(p + 1) > '9')
				{
					System.out.print("\n");
				}
			}
			p++; //    ???????
		}
		return 0;
	}



}
