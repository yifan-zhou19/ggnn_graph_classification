import java.util.*;

package <missing>;

public class GlobalMembers
{
	//????????????????
	//?????2011?11?2?
	//???????
	public static int Main()
	{
	String str1 = new String(new char[80]); //?????
	String str2 = new String(new char[80]);
	str1 = new Scanner(System.in).nextLine(); //?????
	str2 = new Scanner(System.in).nextLine();
	int i;
	for (i = 0;i < str1.length();i++) //??????????????
	{
	if ('A' <= str1.charAt(i) && str1.charAt(i) <= 'Z')
	{
	str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
	}
	}
	for (i = 0;i < str2.length();i++)
	{
	if ('A' <= str2.charAt(i) && str2.charAt(i) <= 'Z')
	{
	str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
	}
	}
	if (strcmp(str1,str2) < 0) //????????
	{
	System.out.print("<");
	}
	if (strcmp(str1,str2) == 0)
	{
	System.out.print("=");
	}
	if (strcmp(str1,str2) > 0)
	{
	System.out.print(">");
	}
	return 0;
	}
}

