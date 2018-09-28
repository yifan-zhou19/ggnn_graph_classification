import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int legal(tangible.RefObject<String> p)
	{ //??????????
		int i;
		for (i = 0; * (p.argValue.Substring(i)) != 0;i++)
		{
			if (i == 0)
			{
				if (*(p.argValue.Substring(i)) != '_' && !(*(p.argValue.Substring(i)) >= 'a' && *(p.argValue.Substring(i)) <= 'z') && !(*(p.argValue.Substring(i)) >= 'A' && *(p.argValue.Substring(i)) <= 'Z'))
				{
					break;
				}
			}
			else if (*(p.argValue.Substring(i)) != '_' && !(*(p.argValue.Substring(i)) >= 'a' && *(p.argValue.Substring(i)) <= 'z') && !(*(p.argValue.Substring(i)) >= 'A' && *(p.argValue.Substring(i)) <= 'Z') && !(*(p.argValue.Substring(i)) >= '0' && *(p.argValue.Substring(i)) <= '9'))
			{
				break;
			}
		}
		if (*(p.argValue.Substring(i)) == 0)
		{
			return 1;
		}
		return 0;
	}
	public static int Main()
	{
		int n;
		String string = new String(new char[81]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		String = new Scanner(System.in).nextLine();
		for (;n > 0;n--)
		{
			String = new Scanner(System.in).nextLine();
		tangible.RefObject<String> tempRef_String = new tangible.RefObject<String>(String);
			System.out.print(legal(tempRef_String));
			String = tempRef_String.argValue;
			System.out.print("\n");
		}
		return 0;
	}

}

