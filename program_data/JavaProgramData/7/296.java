package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int len1;
		int len2;
		int len3;
		int j;
		int m = 0;
		int l;
		String zifu = new String(new char[256]);
		String chazhao = new String(new char[256]);
		String tihuan = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			zifu = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			chazhao = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			tihuan = tempVar3.charAt(0);
		}
		len1 = zifu.length();
		len2 = chazhao.length();
		len3 = tihuan.length();
		for (i = 0;i < len1;i++)
		{
			m = 0;
			if (zifu.charAt(i) == chazhao.charAt(0))
			{
				for (j = 0;j < len2;j++)
				{
					if (zifu.charAt(i + j) == chazhao.charAt(j))
					{
						m++;
					}
					if (zifu.charAt(i + j) != chazhao.charAt(j))
					{
						break;
					}
				}

			}
				if (m == len2)
				{
					break;
				}

		}


		if (i < len1)
		{
			if (len2 == len3)
			{
				for (l = 0;l < len2;l++)
				{
					zifu = tangible.StringFunctions.changeCharacter(zifu, i + l, tihuan.charAt(l));
				}
			}
			else if (len2 > len3)
			{
				for (l = 0;l < len3;l++)
				{
					zifu = tangible.StringFunctions.changeCharacter(zifu, i + l, tihuan.charAt(l));
				}
				for (l = i + len2;l < len1 + 1;l++)
				{
					zifu = tangible.StringFunctions.changeCharacter(zifu, l + len3 - len2, zifu.charAt(l));
				}
			}
			else if (len2 < len3)
			{
				for (l = i + len2;l < len1 + 1;l++)
				{
					zifu = tangible.StringFunctions.changeCharacter(zifu, l + len3 - len2, zifu.charAt(l));
				}
				for (l = 0;l < len3;l++)
				{
					zifu = tangible.StringFunctions.changeCharacter(zifu, i + l, tihuan.charAt(l));
				}
			}
		}

		System.out.printf("%s\n",zifu);
		return 0;
	}

}

