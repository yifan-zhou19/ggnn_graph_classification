import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			String str1 = new String(new char[1000]);
			String str2 = new String(new char[1000]);
			String str3 = new String(new char[1000]);
			String str4 = new String(new char[1000]);
			str1 = new Scanner(System.in).nextLine();
			str2 = new Scanner(System.in).nextLine();
			int a = str1.length();
			int b = str2.length();
			for (j = 0;j < a;j++)
			{
				str3 = tangible.StringFunctions.changeCharacter(str3, j, str1.charAt(a - j - 1));
			}
			for (j = 0;j < b;j++)
			{
				str4 = tangible.StringFunctions.changeCharacter(str4, j, str2.charAt(b - j - 1));
			}
			for (j = 0;j < b;j++)
			{
				if (str3.charAt(j) >= str4.charAt(j))
				{
					str3 = tangible.StringFunctions.changeCharacter(str3, j, str3.charAt(j) - str4.charAt(j) + '0');
				}
				else
				{
					str3 = tangible.StringFunctions.changeCharacter(str3, j, 10 + str3.charAt(j) - str4.charAt(j) + '0');
					str3.charAt(j + 1)--;
				}
			}
			for (j = a - 1;j >= 0;j--)
			{
				System.out.print(str3.charAt(j));
			}
					System.out.print("\n");
					System.in.read();
		}
		return 0;
	}

}

