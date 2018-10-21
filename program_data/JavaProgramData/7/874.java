import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int len1;
	public static int len2;
	public static int len3;
	public static String replacement = new String(new char[256]);
	public static void answer(String str, String substr)
	{
		int i;
		int k;
		int count;
		int num = 0;
		for (i = 0; i < len1; i++)
		{
			if (str[i].equals(substr[0]))
			{
				count = 0;
				for (k = i; ; k++)
				{
					if ((str[k].equals(substr[count])) && (!str[k].equals('\0')))
					{
						count++;
					}
					else
					{
						break;
					}
				}
				if (count == len2)
				{
					num++;
					for (k = 0; k < i; k++)
					{
						System.out.print(str[k]);
					}
					for (k = 0; k < len3; k++)
					{
						System.out.print(replacement.charAt(k));
					}
					for (k = i + len2; k < len1; k++)
					{
						System.out.print(str[k]);
					}
					break;
				}
			}
		}
		if (num == 0)
		{
			for (i = 0; i < len1; i++)
			{
				System.out.print(str[i]);
			}
		}
	}
	public static int Main()
	{
		String str = new String(new char[260]);
		String substr = new String(new char[256]);
		str = new Scanner(System.in).nextLine();
		substr = new Scanner(System.in).nextLine();
		replacement = new Scanner(System.in).nextLine();
		len1 = str.length();
		len2 = substr.length();
		len3 = replacement.length();
		answer(str, substr);
		return 0;
	}
}
