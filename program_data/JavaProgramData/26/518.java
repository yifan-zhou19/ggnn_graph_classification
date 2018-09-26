import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		int len;
		int i;
		int j;
		int k;
		int num = 0;

		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (k = 0;k < len;k++)
		{
		num = 0;
		for (i = 0;i < len;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (a.charAt(i + 1) == ' ')
				{
				num++;
				for (j = i;j <= len - num;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
				}
				}
			}
		}
		}
		len = a.length();
		for (i = 0;i < len;i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

