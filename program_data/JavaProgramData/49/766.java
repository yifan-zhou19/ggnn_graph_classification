import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		char c;
		int i;
		int l;
		int j;
		int k;
		int m;
		int q;
		int n = 0;
		int p;
		a = new Scanner(System.in).nextLine();
		l = a.length();
		for (i = 0; i < l; i++)
		{
			b = tangible.StringFunctions.changeCharacter(b, l - 1 - i, a.charAt(i));
		}
		for (j = 2; j <= l; j++)
		{
			for (m = 0; m <= l - j; m++)
			{
				n = 0;
				p = m;
				q = l - p - j;
				for (k = 1; k <= j; k++)
				{
					if (a.charAt(p) == b.charAt(q))
					{
						p++;
						q++;
						n++;
					}
					else
					{
						break;
					}
				}
				if (n == j)
				{
					i = 0;
					while (i < n)
					{
						System.out.print(a.charAt(m + i));
						i++;
					}
					System.out.print("\n");
				}

			}
		}
		return 0;
	}
}

