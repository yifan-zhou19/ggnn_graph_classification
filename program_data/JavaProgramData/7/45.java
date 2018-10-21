package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char c;
		char d;
		String str1 = new String(new char[256]);
		String str2 = new String(new char[256]);
		String str3 = new String(new char[256]);
		int l;
		int h;
		int i;
		int j = 0;
		int k;
		int st = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str1 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str2 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			str3 = tempVar3.charAt(0);
		}
		l = str2.length();
		for (i = 0;((c = str2.charAt(i)) != '\0');i++)
		{
			c = str2.charAt(i);
			for (;((d = str1.charAt(j)) != '\0');j++)
			{
				d = str1.charAt(j);
				if (c == d)
				{
					st = st + 1;
					j = j + 1;
					break;
				}
				else if ((c != d) && (st != 0))
				{
					st = 0;
					i = -1;
					break;
				}
			}
		}
		if (st == l)
		{
			for (h = 0,k = (j - l);k < j;k++,h++)
			{
				str1 = tangible.StringFunctions.changeCharacter(str1, k, str3.charAt(h));
			}
			System.out.printf("%s\n",str1);
		}
		else
		{
			System.out.printf("%s\n",str1);
		}
	}


}

