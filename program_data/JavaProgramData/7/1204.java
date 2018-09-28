import java.util.*;

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[300]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		int n;
		int m;
		int p;
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		n = s.length();
		m = a.length();
		p = b.length();
		for (i = 0 ; i < n; i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{
				for (j = 1; j < m; j++)
				{
					if (a.charAt(j) != s.charAt(j + i))
					{
						break;
					}
				}
				if (j == m)
				{
					if (m == p)
					{
						for (j = 0; j < m; j++)
						{
							s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
						}
					}
					else
					{
						if (p < m)
						{
							for (j = 0; j < p; j++)
							{
								s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
							}
							for (j = i + p;; j++)
							{
								s = tangible.StringFunctions.changeCharacter(s, j, s.charAt(j + m - p));
								if (s.charAt(j) == '\0')
								{
									break;
								}
							}
						}
						else
						{
							for (j = 0;; j++)
							{
								if (n - j == i + m - 1)
								{
									break;
								}
								s = tangible.StringFunctions.changeCharacter(s, n + p - m - j, s.charAt(n - j));
							}
							for (k = 0; k < p; k++)
							{
								s = tangible.StringFunctions.changeCharacter(s, i + k, b.charAt(k));
							}
						}
					}
					break;
				}
			}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}






}

