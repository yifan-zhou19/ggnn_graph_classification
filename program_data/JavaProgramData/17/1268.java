package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int num = 0;
		int i;
		int l;
		int j;
		int k;
		int n;
		int[] left = new int[101];
		String str = new String(new char[101]);
		String str2 = new String(new char[101]);
		while (gets(str))
		{
			str2 = str;
			for (i = 0,l = 0;str.charAt(i);i++)
			{
				if (str.charAt(i) == '(')
				{
					left[l] = i;
					l++;
				}
			}
			for (n = l - 1;n >= 0;n--)
			{
				for (k = left[n] + 1;str.charAt(k);k++)
				{
					if (str2.charAt(k) == ')')
					{
						str2 = tangible.StringFunctions.changeCharacter(str2, left[n], ' ');
						str2 = tangible.StringFunctions.changeCharacter(str2, k, ' ');
						break;
					}
				}
			}
			for (j = 0;str.charAt(j);j++)
			{
				if (str2.charAt(j) == '(')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, '$');
				}
				else if (str2.charAt(j) == ')')
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, '?');
				}
				else
				{
					str2 = tangible.StringFunctions.changeCharacter(str2, j, ' ');
				}
			}
			System.out.printf("%s\n",str);
			System.out.printf("%s\n",str2);
		}
	}
}

