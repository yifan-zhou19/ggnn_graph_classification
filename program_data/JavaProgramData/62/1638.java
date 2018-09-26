import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;

		String a = new String(new char[201]);
		String b = new String(new char[201]);

		a = new Scanner(System.in).nextLine();

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;

		for (p = a; * p != '\0';p++)
		{
			if (*p != ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, *p);
				i++;
			}
			if (*p == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ' ');
				i++;
				for (; * p != '\0';p++)
				{
					if (*p != ' ')
					{
						b = tangible.StringFunctions.changeCharacter(b, i, *p);
						i++;
						break;
					}
				}
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, i, '\0');
		System.out.print(b);
		System.out.print("\n");

		return 0;
	}
}

