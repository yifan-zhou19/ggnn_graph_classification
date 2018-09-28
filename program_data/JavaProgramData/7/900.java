package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int lenstr;
		int lensub;
		int lenrpl;
		int i;
		int j;
		String temp = new String(new char[260]);
		String str = new String(new char[260]);
		String sub = new String(new char[260]);
		String rpl = new String(new char[260]);
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
			rpl = tempVar3.charAt(0);
		}
		lenstr = str.length();
		lensub = sub.length();
		lenrpl = rpl.length();
		str = tangible.StringFunctions.changeCharacter(str, lenstr, '\0');
		sub = tangible.StringFunctions.changeCharacter(sub, lensub, '\0');
		rpl = tangible.StringFunctions.changeCharacter(rpl, lenrpl, '\0');
		for (i = 0;i < lenstr - lensub + 1;i++)
		{
			for (j = 0;j < lensub;j++) //?????????????substring??????
			{
				temp = tangible.StringFunctions.changeCharacter(temp, j, str.charAt(i + j));
			}
			temp = tangible.StringFunctions.changeCharacter(temp, j, '\0');
			if (strcmp(temp,sub) == 0) //????????substring?????????????????
			{
				break;
			}
		}
		if (i != lenstr - lensub + 1) //??????????????????
		{
			for (j = 0;j < lenrpl;j++) //??
			{
				str = tangible.StringFunctions.changeCharacter(str, i + j, rpl.charAt(j));
			}
		}
		System.out.printf("%s\n",str); //??\(^o^)/~
	}



}

