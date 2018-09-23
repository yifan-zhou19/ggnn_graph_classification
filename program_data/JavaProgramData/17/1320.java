package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int flag;
		String a = new String(new char[200]);
		String b = new String(new char[200]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,0,200);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			for (j = 0;j < a.length();j++)
			{
				if (a.charAt(j) == '(')
				{
					flag = 1;
					k = j + 1;
					while (flag != 0 && k < a.length())
					{
						if (a.charAt(k) == '(')
						{
							flag++;
						}
						if (a.charAt(k) == ')')
						{
							flag--;
						}
						k++;
					}
					if (k >= a.length() && flag != 0)
					{
						b = tangible.StringFunctions.changeCharacter(b, j, '$');
					}
					else
					{
						b = tangible.StringFunctions.changeCharacter(b, k - 1, ' ');
						b = tangible.StringFunctions.changeCharacter(b, j, ' ');
					}
				}
				else if (a.charAt(j) == ')' && b.charAt(j) != ' ')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '?');
				}
				else
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				}
			}
			System.out.printf("%s\n",a);
			System.out.printf("%s\n",b);
		}
		return 0;
	}

}

