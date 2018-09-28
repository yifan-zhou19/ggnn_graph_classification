import java.util.*;

package <missing>;

public class GlobalMembers
{
	//******************************
	//*????4.??????
	//*??????
	//*???2012-12-8
	//******************************

	public static int Main()
	{
		int i;
		int l;
		String str1 = new String(new char[1000]); // ???????????????
		String str2 = new String(new char[1000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * m = str1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * n = str2;
		str1 = new Scanner(System.in).nextLine();
		l = str1.length(); //?????
		for (i = 0; i < l - 1; i++)
		{
			*n++= *m + *++m;
		}
		*n = str1.charAt(0) + *m; // ?????????????????
		*++n = '\0';
		System.out.print(str2);

	return 0;
	}


}
