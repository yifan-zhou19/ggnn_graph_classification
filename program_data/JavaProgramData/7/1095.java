package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str1 = new String(new char[257]);
		String str2 = new String(new char[257]);
		String str3 = new String(new char[257]);
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
		int a;
		int i;
		int j;
		int b;
		int k = 0;
		int c;
		c = str3.length();
		a = str1.length();
		b = str2.length();
		for (i = 0;i < a;i++)
		{
			if (str1.charAt(i) == str2.charAt(0))
			{
				for (j = 1;j < b;j++)
				{
					if (str1.charAt(i + j) == str2.charAt(j))
					{
						k++;
					}
					else
					{
						k = 0;
						break;
					}
				}
				if (k == b - 1)
				{
					for (j = i;j < i + c;j++)
					{
						str1 = tangible.StringFunctions.changeCharacter(str1, j, str3.charAt(j - i));
					}
					break;
				}
			}
		}
		System.out.printf("%s",str1);
		return 0;
	}
}

