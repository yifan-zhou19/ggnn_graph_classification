public class bracket
{
	public String data = new String(new char[max]);
	public int top;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[max]);
		String flag = new String(new char[max]);
		int i;
		int j;
		int len;
		int n;
		bracket leftbracket;
		bracket rightbracket;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			//????
			leftbracket = new bracket();
			rightbracket = new bracket();
			leftbracket.top = rightbracket.top = 0;

			len = str.length();

			//?????????????
			for (i = 0; i < len; i++)
			{
				switch (str.charAt(i))
				{
					case '(' :
						leftbracket.data = tangible.StringFunctions.changeCharacter(leftbracket.data, leftbracket.top++, str.charAt(i));
						flag = tangible.StringFunctions.changeCharacter(flag, i, ' ');
						break;
					case ')' :
						if (leftbracket.top > 0)
						{
							flag = tangible.StringFunctions.changeCharacter(flag, i, ' ');
							leftbracket.top -= 1;
						}
						else
						{
							flag = tangible.StringFunctions.changeCharacter(flag, i, '?');
						}
						break;
					default :
						flag = tangible.StringFunctions.changeCharacter(flag, i, ' ');
						break;
				}
			}

			//?????????????
			for (i = len - 1; i >= 0; i--)
			{
				switch (str.charAt(i))
				{
					case ')' :
						rightbracket.data = tangible.StringFunctions.changeCharacter(rightbracket.data, rightbracket.top++, str.charAt(i));
						break;
					case '(' :
						if (rightbracket.top > 0)
						{
							rightbracket.top -= 1;
						}
						else
						{
							flag = tangible.StringFunctions.changeCharacter(flag, i, '$');
						}
						break;
					default :
						break;
				}
			}
			flag = tangible.StringFunctions.changeCharacter(flag, len, '\0');
			//????
			System.out.printf("%s\n%s\n", str, flag);

			//?????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str, '\0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag, '\0', (Character.SIZE / Byte.SIZE));
		}
		return 0;
	}
}

