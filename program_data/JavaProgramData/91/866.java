import java.util.*;

package <missing>;

public class GlobalMembers
{
	//*************************************************
	//***??????????***
	//***??????***
	//***???2012.12.8***
	//*************************************************
	public static int Main()
	{
		String a = new String(new char[101]);
		char t;
		char i = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine(); //??
		t = a.charAt(0); //??a[0]
		p = a.charAt(1);
		while (*p != '\0') //p?a[]???????????????a[0]????????
		{
			a = tangible.StringFunctions.changeCharacter(a, i, *p + *(p - 1));
			i++;
			p++;
		}
		a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + t); //????????
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}
}

