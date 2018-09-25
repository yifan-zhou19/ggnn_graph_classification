package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[100]);
		String str2 = new String(new char[100]);
		String str3 = new String(new char[100]);
		char[][] a = new char[100][100];
		int i;
		int j = 0;
		int t = 0;
		int l;
		int m;
		int n;
		int k = -1;
		int f = 1;
		str1 = new Scanner(System.in).nextLine();
		str2 = new Scanner(System.in).nextLine();
		str3 = new Scanner(System.in).nextLine();
		m = str1.length();
		l = str2.length();
		str1 = tangible.StringFunctions.changeCharacter(str1, m, '\0');
		for (j = 0;i <= m;j++)
		{
			for (i = k + 1,n = 0;i <= m;i++,n++)
			{
				if (str1.charAt(i) != ' ' && str1.charAt(i) != '\0')
				{
					a[j][n] = str1.charAt(i);
				}
				else
				{
					a[j][n] = '\0';
					k = i;
					break;
				}
			}
		}
		k = j - 1;
		for (j = 0;j < k;j++)
		{
			f = 1;
			t = String.valueOf(a[j]).length();
			if (l != t)
			{
				System.out.printf("%s",a[j]);
				if (j < k - 1)
				{
					System.out.print(" ");
				}
				continue;
			}
			else
			{
				for (i = 0;i < l;i++)
				{
					if (a[j][i] != str2.charAt(i))
					{
						System.out.printf("%s",a[j]);
						if (j < k - 1)
						{
							System.out.print(" ");
						}
						f = 0;
						break;
					}
				}
			}
			if (f == 1)
			{
				System.out.printf("%s",str3);
				if (j < k - 1)
				{
					System.out.print(" ");
				}
			}
		}
	}
}

