package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[14]);
		String b = new String(new char[14]);
		char t;
		int i;
		int n;
		int j;
		int m;
		int k;

		while (gets(a) != '\0')
		{
			b = a;
			n = a.length();
			for (i = 0;i < n;i++)
			{
				if (a.charAt(i) == ' ')
				{
				m = i;
				break;
				}
			}
			for (i = 0;i < m - 1;i++)
			{
				for (j = 0;j < m - 1 - i;j++)
				{
				if (b.charAt(j) < b.charAt(j + 1))
				{
				t = b.charAt(j);
				b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j + 1));
				b = tangible.StringFunctions.changeCharacter(b, j + 1, t);
				}
				}
			}
			for (i = 0;i < m - 1;i++)
			{
				if (a.charAt(i) == b.charAt(0))
				{
				k = i;
				break;
				}
			}
			for (i = 0;i <= k;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = n - 3;i < n;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			for (i = k + 1;i <= m - 1;i++)
			{
				System.out.printf("%c",a.charAt(i));
			}
			System.out.print("\n");

		}
	}
}

