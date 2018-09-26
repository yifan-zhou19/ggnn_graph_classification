import java.util.*;

package <missing>;

public class GlobalMembers
{
	//**********************************************
	//****??????    1200012772****************
	//****??????????      ****************
	//****???2012?12?8?       ****************
	//**********************************************
	public static int Main()
	{
		String str1 = new String(new char[102]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = null;
		char temp;
		str1 = new Scanner(System.in).nextLine();
		p = str1;
		int l = str1.length();
		str1 = tangible.StringFunctions.changeCharacter(str1, l, str1.charAt(0));
		for (; * p != '\0'; p++)
		{
			temp = p;
			*p = temp + *(p + 1);
		}
		str1 = tangible.StringFunctions.changeCharacter(str1, l, '\0');
		System.out.print(str1);
		return 0;
	}
}

