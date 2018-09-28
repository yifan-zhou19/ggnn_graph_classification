import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		int len;
		int sum = 0;
		str = new Scanner(System.in).nextLine();
		len = str.length() - 1;
		int i = 0;
		while (i <= len - 1)
		{
			if (str.charAt(i) == ' ' && str.charAt(i + 1) == ' ')
			{
				for (int j = i;j <= len - 1;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
				sum = sum + 1;
				i = i - 1;
			}
			i = i + 1;
		}
		for (int i = 0;i <= len - sum;i++)
		{
			System.out.print(str.charAt(i));
		}
		return 0;
	}
}

