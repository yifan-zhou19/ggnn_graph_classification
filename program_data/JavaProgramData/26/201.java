import java.util.*;

package <missing>;

public class GlobalMembers
{
	//???2010?12?8?

	//???1000010586_???

	//??????????

	public static int Main()
	{
		int i = 0;
		String word = new String(new char[100]);
		String str = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String q;
		word = new Scanner(System.in).nextLine();
		p = word;
		for (; * p != '\0' ; p++)
		{
			if (*p == ' ' && *(p - 1) == ' ')
			{
				continue;
			}
			str = tangible.StringFunctions.changeCharacter(str, i, *p);
			i++;
		}
		str = tangible.StringFunctions.changeCharacter(str, i, '\0');
		q = str;
		System.out.print(q);
		System.out.print("\n");
		return 0;
	}
}

