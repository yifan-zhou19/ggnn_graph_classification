package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int flag;
		int len;
		int k;
		int x;
		int[] a = new int[100];
		int[] b = new int[100];
		String str = new String(new char[101]);
		String s = new String(new char[101]);
		while (gets(str))
		{
			for (i = 0;i < 100;i++)
			{
				a[i] = 0;
				b[i] = 0;
			}
			m = 0;
			for (i = 0;str.charAt(i) != '\0';i++)
			{
				if (str.charAt(i) == ')')
				{
					j = i;
					x = 1;
					while (j >= 0)
					{
						if (str.charAt(j) == '(')
						{
							for (k = 0;k < m;k++)
							{
								if (a[k] == j)
								{
									x = 0;
								}
							}
							if (x != 0)
							{

							a[m] = j;
							b[m] = i;
							m++;
							break;
							}
						}
						j--;
						x = 1;
					}
				}
			}

			s = str;
			flag = 1;
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				if (s.charAt(i) == '(')
				{
					for (j = 0;j < m;j++)
					{
						if (i == a[j])
						{
							flag = 0;
							break;
						}
					}
					if (flag == 0)
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '$');
					}
				}
				else if (s.charAt(i) == ')')
				{
					for (j = 0;j < m;j++)
					{
						if (i == b[j])
						{
							flag = 0;
							break;
						}
					}
					if (flag == 0)
					{
						s = tangible.StringFunctions.changeCharacter(s, i, ' ');
					}
					else
					{
						s = tangible.StringFunctions.changeCharacter(s, i, '?');
					}
				}
				else
				{
					s = tangible.StringFunctions.changeCharacter(s, i, ' ');
				}
				flag = 1;
			}
		len = s.length();
		for (j = len;j >= 0;j--)
		{
			if ((s.charAt(j) == ' ') || (s.charAt(j) == '\0'))
			{
				if (s.charAt(j - 1) != ' ')
				{
					s = tangible.StringFunctions.changeCharacter(s, j, '\0');
					break;
				}
			}
		}
		System.out.printf("%s\n",str);
		j = 0;
		while (s.charAt(j) == ' ')
		{
			j++;
		}
		for (i = j;s.charAt(i) != '\0';i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");


		}
		return 0;
	}

}

