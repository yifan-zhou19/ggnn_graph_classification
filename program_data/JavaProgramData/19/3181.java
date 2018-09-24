import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int s;
		int k;
		int l;
		int m;
		int n;
		int v = 0;
		String a = new String(new char[202]);
		String b = new String(new char[102]);
		String c = new String(new char[102]);
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		l = c.length();
		m = a.length();
		n = b.length();
		for (j = 0;j < m;)
		{
			k = 0;
			if ((j == 0) || ((j > 0) && (a.charAt(j - 1) == ' ')))
			{
				for (i = j;i < j + n;i++)
				{
				if (a.charAt(i) == b.charAt(i - j))
				{
				k++;
				}
				}
				if ((k == n) && (a.charAt(j + n) != ' ') && (a.charAt(j + n) != '\0'))
				{
					k = 0;
				}
			} //???????????????

			if (k == n)
			{
				if (l > n)
				{
					for (s = 0;s < l - n;s++)
					{
					for (i = m + s;i >= j + n + s;i--)
					{
						a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i)); //???????????????l-n??
					}
					}
				}
				if (l < n)
				{
					for (s = 0;s < n - l;s++)
					{
					for (i = j + n - s - 1;i < m - s;i++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i + 1));
					}
					}
					for (i = m + l - n;i < m;i++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '\0');
					}
				}
				for (i = j;i < j + l;i++)
				{
				a = tangible.StringFunctions.changeCharacter(a, i, c.charAt(i - j));
				}
				j += l; //??????
				m = m + l - n;
			}
			else
			{
				j++;
			}
		}
		for (i = 0;i < m;i++)
		{
	System.out.print(a.charAt(i));
		}
		System.out.print("\n");
	return 0;
	}
}

