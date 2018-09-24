import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*****************************
	//????1000012825          *
	//??????                *
	//???12.10                 *
	//???????????      *
	//*****************************
	public static int Main()
	{
		String str = new String(new char[100]);
		str = new Scanner(System.in).nextLine(); //???????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = str; //????
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * q = null;
		for (p = str; * p != '\0'; p++)
		{
			if (*p == ' ')
			{
				for (q = p + 1; * q == ' '; q++)
				{
					*q = '0'; //??????????????????�0�
				}
			}
		}
		for (p = str; * p != '\0'; p++)
		{
			if (*p != '0')
			{
				System.out.print(p);
			}
		} //?????�0�??????
		System.out.print("\n");
		return 0;
	}


}
