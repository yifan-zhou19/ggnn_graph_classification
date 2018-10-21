import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*           ????
	??????      2010.12.12        */
	public static int Main()
	{
		int num;
		int flag = 0;
		String a = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		a = tangible.StringFunctions.changeCharacter(a, a.length(), 'a');
		for (p = a;p < a + a.length();p++)
		{
			if (*p <= '9' && *p >= '0')
			{
				if (flag != 0)
				{
					num = num * 10 + *p - '0';
				}
				else
				{
					num = p - '0';
				}
				flag = 1;
			}
			else
			{
				if (flag == 1)
				{
					System.out.print(num);
					System.out.print("\n");
				}
				flag = 0;
			}
		}
		return 0;
	}

}

