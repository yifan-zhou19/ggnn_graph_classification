import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[200]);
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		final String x = " ";
		int i = 0;
		int j = 0;
		int k = 0;
		int count = 0;
		int ls;
		int la;
		int lb;
		int l;
		int end = 0;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ls = s.length(),la = a.length(),lb = b.length();
		while (i < ls)
		{
			count = 0;
			for (j = 0;j < la;j++)
			{
				if (s.charAt(i + j) != a.charAt(j))
				{
					break;
				}
				else
				{
					count++;
				}
			}
			if ((count != la) || (i != 0 && count == la && s.charAt(i - 1) != ' '))
			{
				x = tangible.StringFunctions.changeCharacter(x, k, s.charAt(i));
				k++,i++;
			}
			else
			{
				i = i + la;
				end = k + lb;
				for (;k < end;k++)
				{
					x = tangible.StringFunctions.changeCharacter(x, k, b.charAt(k - end + lb));
				}
			}
		}
		System.out.print(x);

	}
}

