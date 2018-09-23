import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string = new String(new char[101]); //??????
		int i;
		int j;
		int lenth;
		int n;
		int t;
		while (String = new Scanner(System.in).nextLine())
		{ //??????????????
			n = 0;
			lenth = String.length(); //????
			System.out.print(String);
			System.out.print("\n");
			for (i = 0;i < lenth;i++)
			{ //??????????????????????
				if (String[i] == '(')
				{
					String[i] = '$';
				}
				else if (String[i] == ')')
				{
					String[i] = '?';
				}
				else
				{
					String[i] = ' ';
					n++;
				}
			}
			n = (lenth - n) / 2; //?????????????
			for (i = 0;i < n;i++)
			{ //??
				for (j = 0;j < lenth;j++)
				{
					for (t = j + 1;t < lenth;t++)
					{
						if (String[j] == '$' && string.charAt(t) == '$')
						{
							j = t;
							continue;
						}
						if (String[j] == '$' && string.charAt(t) == '?')
						{
							String[j] = string[t] = ' ';
							j = t - 1;
						}
					}
				}
			}
			for (i = lenth - 1;i >= 0;i--)
			{ //??????
				if (String[i] != ' ')
				{
					break;
				}
			}
			String[i + 1] = '\0';
			lenth = String.length();
			int m = 0;
			for (i = 0;i < lenth;i++)
			{ //??????
				if (String[i] != ' ')
				{
					break;
				}
				m++;
			}
			for (i = m;i < lenth;i++)
			{
				System.out.print(String[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}
