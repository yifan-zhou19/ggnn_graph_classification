import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[80]); //?????????
		String str2 = new String(new char[80]);
	int x = 0;
	int i;
	str1 = new Scanner(System.in).nextLine();
	str2 = new Scanner(System.in).nextLine(); //??????
	for (i = 0;i <= 79;i++)
	{
			if (str1.charAt(i) >= 97)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) - 32);
			}
		if (str2.charAt(i) >= 97)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) - 32);
		}
	}
	x = strcmp(str1,str2); //??????????????
	if (x == 1)
	{
		System.out.print(">");
		System.out.print("\n");
	}
	if (x == 0)
	{
		System.out.print("=");
		System.out.print("\n");
	}
	if (x == -1)
	{
		System.out.print("<");
		System.out.print("\n");
	}
	return 0;

	}
}

