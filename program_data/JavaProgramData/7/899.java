package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		String word1 = new String(new char[100]);
		String word2 = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			word1 = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			word2 = tempVar3.charAt(0);
		}
		int la;
		int l1;
		int l2;
		int i;
		int j;
		int k;
		int flag;
		la = a.length();
		l1 = word1.length();
		l2 = word2.length();
		for (i = 0;i < la;i++)
		{
			if (a.charAt(i) == word1.charAt(0))
			{
				for (j = 0;j < l1;j++)
				{
					flag = 1;
					if (a.charAt(i + j) != word1.charAt(j))
					{
						flag = 0;
					}
					else
					{
						flag = 1;
					}
				}
				if (flag == 1)
				{
					for (k = 0;k < l2;k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, i + k, word2.charAt(k));
					}
				}
				if (flag == 1)
				{
					System.out.printf("%s\n",a);
					break;
				}
			}
			if (i == la - 1)
			{
				System.out.printf("%s\n",a);
			}
		}
	}



}

