package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[500]);
		String sub = new String(new char[500]);
		String rep = new String(new char[500]);
		int i;
		int j;
		int shou;
		int mo;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sub = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			rep = tempVar3.charAt(0);
		}
		int len1 = str.length();
		int len2 = sub.length();
		int len3 = rep.length();
		for (i = 0;i <= len1 - len2;i++)
		{
			for (j = 0;j < len2;j++)
			{
				if (str.charAt(i + j) != sub.charAt(j))
				{
					break;
				}
			}
			if (j == len2)
			{
				shou = i;
				mo = i + j; //printf("%d %d",shou,mo);
				break;
			}
			//else
			//{printf("%s",str);break;}
		}
		if (j != len2)
		{
			System.out.printf("%s",str);
		}
		else
		{
		if (len2 >= len3)
		{
			for (i = shou,j = 0;rep.charAt(j) != 0;i++,j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, rep.charAt(j));
			}
			for (k = mo;str.charAt(k) != 0;k++,i++)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));
			}
			str = str.substring(0, i);
		}

		else
		{
			i = len1 + len3 - len2;
			for (k = len1;k >= mo;k--,i--)
			{
				str = tangible.StringFunctions.changeCharacter(str, i, str.charAt(k));
			}
			for (k = shou,j = 0;rep.charAt(j) != 0;k++,j++)
			{
				str = tangible.StringFunctions.changeCharacter(str, k, rep.charAt(j));
			}
		}
		System.out.printf("%s",str);
		}
		return 0;
	}

}

