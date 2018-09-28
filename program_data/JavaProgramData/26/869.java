import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???????
	public static int Main()
	{
		String str = new String(new char[110]);
		int num = 0;
		int i;
		int x;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str; //??????????
		str = new Scanner(System.in).nextLine(); //?????
		for (i = 0; * p != '\0';p++,i++)
		{
			if (*p == ' ')
			{
				for (x = i;;x++,p++)
				{
					if (str.charAt(x) != ' ') //???????????????????????????
					{
					 break;
					}
				}
				System.out.print(' ');
				i = x;
			}


			if (*p != ' ')
			{
				System.out.print(p);
			}
		}
	return 0;

	}

}
