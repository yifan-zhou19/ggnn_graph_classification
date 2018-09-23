import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		str = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		for (i = 0; str.charAt(i) != '\0'; i++)
		{
			int len = 0;
			int k;
			for (j = 0; a.charAt(j) != '\0'; j++)
			{
			   if (str.charAt(i + j) == a.charAt(j) && (str.charAt(i - 1) == ' ' && i != 0) || i == 0)
			   {
				   len++;
			   }
			}
			if (len == a.length() && (str.charAt(i + j) == ' ' || str.charAt(i + j) == '\0'))
			{
				if (a.length() >= b.length())
				{
					for (k = 0; k < b.length(); k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, i + k, b.charAt(k));
					}
					for (k = i + b.length(); str.charAt(k) != '\0'; k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k + a.length() - b.length()));
					}
				}
				else
				{
					for (k = str.length() + b.length() - a.length();k >= i + a.length(); k--)
					{
						str = tangible.StringFunctions.changeCharacter(str, k, str.charAt(k + a.length() - b.length()));
					}
					for (k = 0; k < b.length(); k++)
					{
						str = tangible.StringFunctions.changeCharacter(str, i + k, b.charAt(k));
					}
					i += b.length();
				}


			}
		}
		System.out.print(str);
		System.out.print("\n");
		return 0;
	}

}

