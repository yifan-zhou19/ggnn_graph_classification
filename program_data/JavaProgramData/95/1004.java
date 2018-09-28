import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main(int argc)
	{
		String str1 = new String(new char[82]);
		String str2 = new String(new char[82]);
		char i;
		char n;
		int t;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		i = 0;
		n = 0;
		while (i <= 79)
		{
			if (str1.charAt(i) < 91 && str1.charAt(i)>64)
			{
			str1 = tangible.StringFunctions.changeCharacter(str1, i, str1.charAt(i) + 32);
			}
		if (str2.charAt(i) < 91 && str2.charAt(i)>64)
		{
			str2 = tangible.StringFunctions.changeCharacter(str2, i, str2.charAt(i) + 32);
		}
		i++;
		}
		t = strcmp(str1,str2);
		if (t > 0)
		{
			System.out.print(">");
		}
		if (t == 0)
		{
			System.out.print("=");
		}
		if (t < 0)
		{
			System.out.print("<");
		}
		return 0;
	}


}

