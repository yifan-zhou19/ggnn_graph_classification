import java.util.*;

package <missing>;

public class GlobalMembers
{
	/*
	???:Huiwen()
	??:???????????,?????1,????0
	**/
	public static int Huiwen(String part)
	{
		String check = new String(new char[501]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(check, 0, (Character.SIZE / Byte.SIZE));
		int i;
		int j;
		int len;
		len = part.length();
		j = len - 1;
		for (i = 0; i < len; i++)
		{
			check = tangible.StringFunctions.changeCharacter(check, j--, part[i]);
		}
		check = tangible.StringFunctions.changeCharacter(check, len, '\0');
		return (!(strcmp(part, check)));
	}

	public static int Main()
	{
		String input = new String(new char[501]);
		String part = new String(new char[501]);
		input = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int t;
		int len;
		int n;
		len = input.length();
		for (n = 2; n <= len; n++)
		{
			for (i = 0; i <= len - n; i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
				memset(part, 0, 501);
				part = tangible.StringFunctions.changeCharacter(part, 0, input.charAt(i));
				k = 1;
				for (j = i + 1; j < i + n; j++)
				{
					part = tangible.StringFunctions.changeCharacter(part, k++, input.charAt(j));
				}
				part = tangible.StringFunctions.changeCharacter(part, k, '\0');
				if (Huiwen(part) != 0)
				{
					for (t = 0; t < k; t++)
					{
						System.out.print(part.charAt(t));
					}
					System.out.print("\n");
				}
			}
		}
		return 0;
	}

}

