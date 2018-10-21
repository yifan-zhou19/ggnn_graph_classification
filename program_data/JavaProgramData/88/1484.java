import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*******************************************************************
	//* ????????			  									*
	//* ????????????????								*
	//*??? ???													*
	//*???2010?12?8?												*
	//*******************************************************************
	public static int Main()
	{
		String str = new String(new char[31]); //????????
		str = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str; //??????????
		int i = 0;
		while (p < str + str.length())
		{
			if (*p >= '0' && *p <= '9') //??????????
			{
				System.out.print(p);
			}
			if (*p >= '0' && *p <= '9' && !(*(p + 1) >= '0' && *(p + 1) <= '9'))
			{
				System.out.print("\n");
			}
			p++;
		}
		return 0;
	}

}
