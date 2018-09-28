package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sl;
		int al;
		int i;
		int j;
		int flag = 0;
		String s = new String(new char[256]);
		String a = new String(new char[256]);
		String b = new String(new char[256]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b = tempVar3.charAt(0);
		}
		sl = s.length();
		al = a.length();
		for (i = 0;i < sl;i++)
		{
			if (s.charAt(i) == a.charAt(0))
			{
				for (j = 0;j < al;j++)
				{
					if (s.charAt(i + j) == a.charAt(j))
					{
						flag = 1;
					}
					else
					{
						flag = 0;
					}
					continue;
				}
				if (flag == 1)
				{
					for (j = 0;j < al && s.charAt(i + j) == a.charAt(j);j++)
					{
					s = tangible.StringFunctions.changeCharacter(s, i + j, b.charAt(j));
					}
				break;
				}
			}
		}
		System.out.printf("%s\n",s);
	}








}

