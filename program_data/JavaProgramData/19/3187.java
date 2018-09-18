import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[100]);
		final String str1 = "";
		String str2 = new String(new char[20]);
		String str3 = new String(new char[20]);
		int num = 0;
		int j = 0;
		int i;
		str = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		for (i = 0;i < str.length();i++)
		{
			if (str.charAt(i) != ' ')
			{
			str1.charAt(num)[j++] = str.charAt(i);
			}
			if (str.charAt(i) == ' ')
			{
				num++;
				j = 0;
			}
		}
		num = num + 1;
		for (i = 0;i < num;i++)
		{
			if (strcmp(str1.charAt(i),str2) == 0)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, i, str3);
			}
		}
		for (i = 0;i < num - 1;i++)
		{
			System.out.print(str1.charAt(i));
			System.out.print(" ");
		}
		System.out.print(str1.charAt(i));
		System.out.print("\n");
		return 0;
	}
}

