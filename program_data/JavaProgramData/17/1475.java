package <missing>;

public class GlobalMembers
{
	public static int left(int x, String s, int n)
	{
		int a;
		if (!s[n].equals('\0'))
		{
			if (s[n].equals('('))
			{
				a = left(x + 1, s, n + 1);
				if (a > 0)
				{
				s[n] = ' ';
				return (a - 1);
				}
			   else
			   {
				   s[n] = '$';
				   return 0;
			   }
			}
			else if (s[n].equals(')'))
			{
				if (x > 0)
				{
					s[n] = ' ';
					return (left(x - 1, s, n + 1) + 1);
				}
				else
				{
					s[n] = '?';
					return (left(0, s, n + 1) + 1);
				}
			}
			else
			{
			  s[n] = ' ';
			  return left(x, s, n + 1);
			}
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int l;
		char[] c = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		c = new Scanner(System.in).nextLine();
		System.out.println(c);
		l = left(0, c, 0);
		System.out.printf("%s",c);
		while ((scanf("%s",c) != EOF))
		{
		System.out.print("\n");
		System.out.println(c);
		l = left(0, c, 0);
		System.out.printf("%s",c);
		}
		return 0;
	}
}
