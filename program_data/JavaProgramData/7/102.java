package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String s = new String(new char[256]);
	String a = new String(new char[256]);
	String b = new String(new char[256]);
	int x;
	int y;
	int z;
	int k;
	int l;
	int i;
	int j;
	int m;
	int n;
	int cha;
	int mark = 0;

	s = new Scanner(System.in).nextLine();
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	x = a.length();
	y = b.length();
	z = s.length();

	for (i = 0;i < z;i++)
	{
		if (s.charAt(i) == a.charAt(0))
		{
			for (j = 0;j < x;j++)
			{
				if ((s.charAt(i + j) == a.charAt(j)) && (j != x - 1))
				{
				   continue;
				}
				else if (s.charAt(i + j) != a.charAt(j))
				{
					break;
				}
				else if ((s.charAt(i + j) == a.charAt(j)) && (j == x - 1))
				{
					mark++;
						if (x > y)
						{
							for (k = 0;k < y;k++)
							{
								s = tangible.StringFunctions.changeCharacter(s, i + k, b.charAt(k));
							}
							cha = x - y;
							for (m = i + x;m < z;m++)
							{
							s = tangible.StringFunctions.changeCharacter(s, m - cha, s.charAt(m));
							}
							s = tangible.StringFunctions.changeCharacter(s, z - cha, '\0');
						}
						else if (x == y)
						{ //??=?==
							for (k = 0;k < y;k++)
							{
								s = tangible.StringFunctions.changeCharacter(s, i + k, b.charAt(k));
							}
						}
						else if (x < y)
						{
							cha = y - x;
							for (l = z - 1;l >= i + x;l--)
							{
							s = tangible.StringFunctions.changeCharacter(s, l + cha, s.charAt(l));
							}
							for (n = 0;n < y;n++)
							{
							s = tangible.StringFunctions.changeCharacter(s, i + n, b.charAt(n));
							}
							s = tangible.StringFunctions.changeCharacter(s, z + cha, '\0');
							z = s.length(); //??????s?????????z???????
						}
				}
			}
		}
			if (mark != 0)
			{
				   System.out.printf("%s",s);
				   return 0;
			}

	}
	if (mark == 0)
	{
	System.out.printf("%s",s);
	}

	return 0;
	}


}

