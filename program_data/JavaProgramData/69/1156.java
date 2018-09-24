package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[250]);
		String b = new String(new char[250]);
		String c = new String(new char[250]);
		int[] aa = new int[250];
		int[] bb = new int[250];
		int[] cc = new int[250];
		int[] dd = new int[250];
		int add;
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

		int l1;
		int l2;
		int i;
		int j;
		l1 = a.length();
		l2 = b.length();

		if (l1 >= l2)
		{
			for (i = 0;i < l1 - l2;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			for (j = i;j < l1;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, b.charAt(j - l1 + l2));
			}

			for (i = 0;i < l1;i++)
			{
				aa[i] = a.charAt(i) - 48;
			}
			for (i = 0;i < l1;i++)
			{
				cc[i] = c.charAt(i) - 48;
			}
			add = 0;
			for (j = l1 - 1;j >= 1;j--)
			{
				if ((cc[j] + aa[j] + add) <= 9)
				{
					dd[j] = cc[j] + aa[j] + add;
					add = 0;
				}
				else
				{
					dd[j] = cc[j] + aa[j] + add - 10;
					add = 1;
				}
			}

			j = 0;
			if (cc[j] + aa[j] + add <= 9)
			{
				dd[j] = cc[j] + aa[j] + add;
				for (i = 0;i < l1;i++)
				{
					if (dd[i] != 0)
					{
						break;
					}
				}
				if (i == l1)
				{
					System.out.printf("%d",0);
				}
				else
				{
				for (j = i;j <= l1 - 1;j++)
				{
				System.out.printf("%d",dd[j]);
				}
				}
			}
			else
			{
				dd[j] = cc[j] + aa[j] + add - 10;
				System.out.printf("%d",1);
				for (j = 0;j <= l1 - 1;j++)
				{
				System.out.printf("%d",dd[j]);
				}
			}


		}
		else
		{
			for (i = 0;i < l2 - l1;i++)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, '0');
			}
			for (j = i;j < l2;j++)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a.charAt(j - l2 + l1));
			}

			for (i = 0;i < l2;i++)
			{
				aa[i] = b.charAt(i) - 48;
			}
			for (i = 0;i < l2;i++)
			{
				cc[i] = c.charAt(i) - 48;
			}
			add = 0;
			for (j = l2 - 1;j >= 1;j--)
			{



				if ((cc[j] + aa[j] + add) <= 9)
				{
					dd[j] = cc[j] + aa[j] + add;
					add = 0;
				}
				else
				{
					dd[j] = cc[j] + aa[j] + add - 10;
					add = 1;
				}
			}
			j = 0;
			if (cc[j] + aa[j] + add <= 9)
			{
				dd[j] = cc[j] + aa[j] + add;
				for (i = 0;i < l2;i++)
				{
					if (dd[i] != 0)
					{
						break;
					}
				}
				if (i == l1)
				{
					System.out.printf("%d",0);
				}
				else
				{
				for (j = i;j <= l2 - 1;j++)
				{
				System.out.printf("%d",dd[j]);
				}
				}
			}
			else
			{
				dd[j] = cc[j] + aa[j] + add - 10;
				System.out.printf("%d",1);
				for (j = 0;j <= l2 - 1;j++)
				{
				System.out.printf("%d",dd[j]);
				}
			}
		}
	}
}

