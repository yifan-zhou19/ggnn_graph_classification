import java.util.*;

package <missing>;

public class GlobalMembers
{
	/**
	 * @file ?????
	 * @author ???
	 * @date 11-17
	 * @description ?????
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] s = new int[101];
		int[] sa = new int[101];
		int[] sb = new int[101];
		int la;
		int lb;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1; j <= n; j++)
		{
			for (i = 0; i <= 100 ; i++)
			{
				sa[i] = 0;
				sb[i] = 0;
				s[i] = 0;
			}
			System.in.read();
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			la = a.length();
			lb = b.length();
			for (i = la - 1; i >= 0 ; i--)
			{
				sa[la - 1 - i] = a.charAt(i) - '0';
			}
			for (i = lb - 1; i >= 0 ; i--)
			{
				sb[lb - 1 - i] = b.charAt(i) - '0';
			}
			for (i = 0 ; i <= la - 1 ; i++)
			{
				s[i] = s[i] + sa[i] - sb[i];
				if (s[i] < 0)
				{
					s[i] = s[i] + 10;
					s[i + 1]--;
				}
			}
			for (i = la - 1; i >= 0 ; i--)
			{
			if (s[i] != 0)
			{
				break;
			}
			}
			while (i >= 0)
			{
				 System.out.print(s[i]);
				 i--;
			}
			System.out.print("\n");
		}
		return 0;
	}





}

