import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		String str1 = new String(new char[80]); //??????
		String str2 = new String(new char[80]);
		str1 = new Scanner(System.in).nextLine(); //?????1
		str2 = new Scanner(System.in).nextLine(); //?????2
			for (i = 0;i < str1.length();i++)
			{ //?????????
			if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
			{
				str1.charAt(i) += 32;
			}
				else
				{
					continue;
				}
			}
			for (i = 0;i < str2.length();i++)
			{ //?????????
				if (str2.charAt(i) >= 'A' && str2.charAt(i) <= 'Z')
				{
					str2.charAt(i) += 32;
				}
					else
					{
						continue;
					}
			}
		if (strcmp(str1,str2) > 0)
		{
			System.out.print(">");
			System.out.print("\n");
		}
		else if (strcmp(str1,str2) == 0)
		{
			System.out.print("=");
			System.out.print("\n");
		}
		else
		{
		System.out.print("<");
		System.out.print("\n");
		}
		return 0;
	}

}
