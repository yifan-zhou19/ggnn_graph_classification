import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch = new String(new char[1001]);
		int[] num = new int[1001];
		int i;
		int j = 0;
		int nlen;
		ch = new Scanner(System.in).nextLine();
		nlen = ch.length();
		for (i = 0; i < nlen; i++)
		{
			if ((ch.charAt(i) == ch.charAt(i + 1)) || ((ch.charAt(i) - ch.charAt(i + 1)) == ('a' - 'A')) || ((ch.charAt(i) - ch.charAt(i + 1)) == ('A' - 'a')))
			{
				num[j]++;
			}
			else
			{
				num[j]++;
				j++;
			}
		}
		for (i = 0, j = 0; i < 1001; i++)
		{
			if (num[i] != 0)
			{
				j = j + num[i];
				System.out.print('(');
				if (ch.charAt(j - num[i]) >= 'A' && ch.charAt(j - num[i]) <= 'Z')
				{
					System.out.print(ch.charAt(j - num[i]));
				}
				else if (ch.charAt(j - num[i]) >= 'a' && ch.charAt(j - num[i]) <= 'z')
				{
					System.out.print((char)(ch.charAt(j - num[i]) - 'a' + 'A'));
				}
				System.out.print(',');
				System.out.print(num[i]);
				System.out.print(')');
			}
		}
		return 0;
	}


}
