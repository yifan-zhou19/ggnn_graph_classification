import java.util.*;

package <missing>;

public class GlobalMembers
{
	//****************************
	//?????????? 
	//??????1200012914
	//???2012.12.04
	//*************************


	public static int Main()
	{
		String str = new String(new char[101]);
		char a;
		str = new Scanner(System.in).nextLine();
		int l = str.length();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		for (p = str; p < str.Substring(l) - 1; p++)
		{
			a = p + *(p + 1);
			System.out.print(a);
		}
		a = (str.charAt(0) + str.charAt(l - 1)); //???????????
		System.out.print(a);
		System.out.print("\n");

		return 0;
	}


}
