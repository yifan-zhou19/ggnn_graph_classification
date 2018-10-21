package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int j;
		int l;
		int r;
		for (i = 0;i < n;i++)
		{

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,'\n',200);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(b,'\n',200);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			System.out.printf("%s\n",a);
			l = a.length();
			for (j = 0;j < l;j++)
			{
				if (a.charAt(j) == '(')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '$');
				}
				else if (a.charAt(j) == ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, '?');
					for (r = j - 1;r >= 0;r--)
					{
						if (b.charAt(r) == '$')
						{
							b = tangible.StringFunctions.changeCharacter(b, r, ' ');
							b = tangible.StringFunctions.changeCharacter(b, j, ' ');
							break;
						}
					}
				}
				else if (a.charAt(j) != '(' && a.charAt(j) != ')')
				{
					b = tangible.StringFunctions.changeCharacter(b, j, ' ');
				}
			}
			System.out.printf("%s\n",b);
		}
		return 0;
	}





}

