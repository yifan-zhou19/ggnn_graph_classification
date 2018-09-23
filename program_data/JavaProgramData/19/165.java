package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		String a = new String(new char[200]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[200]);
		int i;
		int j;
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int m = 0;
		int flat = 0;
		int x = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{

			n1++;
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			n2++;
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			n3++;
		}
		for (i = 0;i <= n1 + x * (n3 - n2) - 1;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				flat = 1;
				for (j = 1;j <= n2 - 1;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						break;
					}
					else
					{
						flat = flat + 1;
					}
				}
				if (((flat == n2) && (a.charAt(i - 1) == ' ') && (a.charAt(i + n2) == ' ')) || ((i == 0) && (flat == n2) && (a.charAt(i + n2) == ' ')) || ((flat == n2) && (i >= n1 + x * (n3 - n2) - n2 - 1) && (a.charAt(i - 1) == ' ')))
				{
					for (m = i + n2;m <= n1 + 2;m++)
					{
						d = tangible.StringFunctions.changeCharacter(d, m - i - n2, a.charAt(m));
					}
					for (m = i;m <= i + n3 - 1;m++)
					{
						a = tangible.StringFunctions.changeCharacter(a, m, c.charAt(m - i));
					}
					for (m = i + n3;m <= n1 + n3 - n2 + 2;m++)
					{
						a = tangible.StringFunctions.changeCharacter(a, m, d.charAt(m - i - n3));
					}
					i = i + n3 - n2;
					x = x + 1;
				}
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, n1 + x * (n3 - n2), '\0');
		System.out.printf("%s\n",a);
	}

}

