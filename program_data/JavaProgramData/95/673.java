import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{ //???
		int i; //??????i
		String str1 = new String(new char[254]); //??????
		String str2 = new String(new char[254]);
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine(); //??????
		for (i = 0;(str1.charAt(i) != '\0') && (str2.charAt(i) != '\0');i++)
		{ //for????????
			if ((str1.charAt(i) - str2.charAt(i) == 0) || (str1.charAt(i) - str2.charAt(i) == 32) || (str1.charAt(i) - str2.charAt(i) == -32))
			{
				continue;
			}
			else if (((str1.charAt(i) < str2.charAt(i)) && (str2.charAt(i) < 91)) || ((96 < str1.charAt(i)) && (str1.charAt(i) < str2.charAt(i))))
			{
				System.out.print('<');
				System.out.print("\n");
			break;
			} //????
			else if (str1.charAt(i) + 32 < str2.charAt(i))
			{
				System.out.print('<');
				System.out.print("\n");
			break;
			}
			else
			{
				System.out.print('>');
				System.out.print("\n");
			}
			break; //????
		}
		if ((str1.charAt(i) - str2.charAt(i) == 0) || (str1.charAt(i) - str2.charAt(i) == 32) || (str1.charAt(i) - str2.charAt(i) == -32))
		{
			System.out.print('=');
			System.out.print("\n");
		}
		return 0; //?????????????????
	}
}
