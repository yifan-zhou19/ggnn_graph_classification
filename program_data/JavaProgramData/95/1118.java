import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]); //?????
		int i;
		int n1;
		int n2;
		str1 = new Scanner(System.in).nextLine(); //?????
		str2 = new Scanner(System.in).nextLine();
		n1 = str1.length(); // ??????
		n2 = str2.length();
		for (i = 0; i < n1; i++)
		{
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z') //???????
			{
					str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		}
		for (i = 0; i < n2; i++)
		{
			if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z') //???????
			{
					str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
			}
		}
		if (strcmp(str1,str2) == 0) //????
		{
			System.out.print("=");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		if (strcmp(str1,str2) < 0)
		{
			System.out.print("<");
			System.out.print("\n");
		}
		return 0;
	}
}

