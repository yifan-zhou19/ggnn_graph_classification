package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int flag;
		int w;
		int j;
		int len;
		String str = new String(new char[257]);
		String sub = new String(new char[200]);
		String rep = new String(new char[50]);
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
		len = sub.length();
		w = 500;
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) == sub.charAt(0))
			{

				for (j = i;j < i + len;j++)
				{
					if (str.charAt(j) != sub.charAt(j - i))
					{
						flag = 0;
						break;
					}

				}


				if (flag != 0)
				{
					w = i;
					break;
				}
				else
				{
					flag = 1;
				}
			}
		}
		if (w != 500)
		{
		j = 0;
		for (i = w + len;str.charAt(i) != '\0';i++)
		{
			sub = tangible.StringFunctions.changeCharacter(sub, j, str.charAt(i));
			j++;
		}
		sub = tangible.StringFunctions.changeCharacter(sub, j, '\0');
		str = tangible.StringFunctions.changeCharacter(str, w, '\0');
		System.out.printf("%s%s%s",str,rep,sub);
		}
		else
		{
			System.out.printf("%s",str);
		}
		return 0;
	}
}

