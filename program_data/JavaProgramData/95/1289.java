import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]);
		String str2 = new String(new char[80]);
		char i;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		for (i = 0;i < 80;i++)
		{
			if (str1.charAt(i) >= 97 && str1.charAt(i) <= 122)
			{
				str1.charAt(i) -= 32;
			}
			if (str2.charAt(i) >= 97 && str2.charAt(i) <= 122)
			{
				str2.charAt(i) -= 32;
			}
		}
		if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) == 1)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) == -1)
		{
			System.out.print("<");
			System.out.print("\n");
		}
	return 0;
	}
}
