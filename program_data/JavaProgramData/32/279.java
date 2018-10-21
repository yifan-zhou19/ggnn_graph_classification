package <missing>;

public class GlobalMembers
{
	public static int flag = 0;
	public static char minus(char a,char b)
	{
		int z;
		if ((int)a >= (int)b)
		{
			z = (int)a - (int)b + 48;
		}
		else
		{
			z = (int)a - (int)b + 10 + 48;
			flag = 1;
		}
		return ((char)z);

	}
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int n;
		int i;
		int j;
		int k;
		int la;
		int lb;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
			System.out.print("\n");
			la = a.length();
			lb = b.length();
			for (j = 0;j < lb;j++)
			{
				flag = 0;
				a = tangible.StringFunctions.changeCharacter(a, la - j - 1, minus(a.charAt(la - j - 1), b.charAt(lb - j - 1)));
				if (flag != 0)
				{
					for (k = 1;;k++)
					{
						if (a.charAt(la - j - 1 - k) != '0')
						{
							a = tangible.StringFunctions.changeCharacter(a, la - j - 1 - k, a.charAt(la - j - 1 - k) - 1);
							if (k > 1)
							{
								for (m = 1;m <= k - 1;m++)
								{
									a = tangible.StringFunctions.changeCharacter(a, la - j - 1 - m, '9');
								}
							}

								break;
						}
					}
				}
			}
			System.out.printf("%s\n",a);
		}

	}







}

