package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int flag;
		String str = new String(new char[50]);
		String substr = new String(new char[4]);
		while (scanf("%s%s",str,substr) != EOF)
		{
			n = str.length();
			for (i = 0;i <= n - 1;i++)
			{
				for (j = 0,flag = 0;j <= n - 1;j++)
				{
					if (str.charAt(i) >= str.charAt(j))
					{
						flag++;
					}
				}
				if (flag == n)
				{
					break;
				}
			}
			for (k = n - 1;k >= i + 1;k--)
			{
				str = tangible.StringFunctions.changeCharacter(str, k + 3, str.charAt(k));
			}
			for (l = 1;l <= 3;l++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i + l, substr.charAt(l - 1));
			}
			str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
			System.out.printf("%s\n",str);
		}
	}

}

