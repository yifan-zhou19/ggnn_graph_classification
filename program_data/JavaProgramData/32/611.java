package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		char r;
		int n;
		int i;
		int j;
		int k;
		int la;
		int lb;
		int t;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char result[100];
	//	}
	//	result[50];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			la = a.length();
			lb = b.length();
			for (i = 0;i < la / 2;i++)
			{
				r = a.charAt(i);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(la - i - 1));
				a = tangible.StringFunctions.changeCharacter(a, la - i - 1, r);
			}
			for (i = 0;i < lb / 2;i++)
			{
				r = b.charAt(i);
				b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lb - i - 1));
				b = tangible.StringFunctions.changeCharacter(b, lb - i - 1, r);
			}


			for (i = 0;i < lb;i++)
			{
				if (a.charAt(i) >= b.charAt(i))
				{
					t = a.charAt(i) - b.charAt(i);
				}
				else
				{
					if (a.charAt(i + 1) == 48)
					{
						for (j = 0;;j++)
						{
							if (a.charAt(i + 1 + j) == 48)
							{
								a = tangible.StringFunctions.changeCharacter(a, i + 1 + j, 57);
								continue;
							}
							else
							{
								a = tangible.StringFunctions.changeCharacter(a, i + 1 + j, a.charAt(i + 1 + j) - 1);
								break;
							}
						}
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, i + 1, a.charAt(i + 1) - 1);
					}
					t = a.charAt(i) + 10 - b.charAt(i);
				}
				c = tangible.StringFunctions.changeCharacter(c, i, t + 48);
			}
			for (i = lb;i < la;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i));
			}
			for (i = 0;i < la / 2;i++)
			{
				r = c.charAt(i);
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(la - i - 1));
				c = tangible.StringFunctions.changeCharacter(c, la - i - 1, r);
			}
			for (i = 0;;i++)
			{
				if (c.charAt(i) != 48)
				{
					for (j = 0;j < la - i;j++)
					{
						result[k].result[j] = c.charAt(i + j);
					}

					result[k].result[la - i] = '\0';
					break;
				}
			}
		}
		for (k = 0;k < n;k++)
		{
			System.out.printf("%s\n",result[k].result);
		}
	}




}

