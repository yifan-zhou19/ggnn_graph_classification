package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		int i;
		int j;
		int n;
		int k;
		int m = 0;
		int num = 0;

		a = new Scanner(System.in).nextLine();
		n = a.length();
		k = n - 1;
		for (i = n - 1;i >= 0;i--)
		{
			if (a.charAt(i) == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, m, String.valueOf(a.charAt(i)).substring(0, k - i + 1));
				m = m + k - i + 1;
				k = i - 1;
			}
		}
		b = tangible.StringFunctions.changeCharacter(b, m, ' ');
		m++;
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) == ' ')
			{
				b = tangible.StringFunctions.changeCharacter(b, m, String.valueOf(a.charAt(0)).substring(0, i));
				break;
			}
		}
		for (j = 0;j < n;j++)
		{
			if (a.charAt(j) == ' ')
			{
				num++;
			}
		}
		if (num == 0)
		{
			System.out.printf("%s",a);
		}
		else
		{
		for (j = 1;j < m + i;j++)
		{
			System.out.printf("%c",b.charAt(j));
		}
		}
		return 1;
	}
}

