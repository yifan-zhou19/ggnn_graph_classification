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
		char[] str = {0};
		char[] flag = {0};
		int i;
		int len;
		int n;
		bracket leftbracket;
		bracket rightbracket;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	while (n > 0)
	{
			while (scanf("%s", str) != EOF)
			{
			//????   
			leftbracket = new bracket();
			rightbracket = new bracket();
			leftbracket.top = rightbracket.top = 0;

			len = str.length();

			//?????????????   
			for (i = 0; i < len; i++)
			{
				switch (str[i])
				{
					case '(' :
						leftbracket.data = tangible.StringFunctions.changeCharacter(leftbracket.data, leftbracket.top++, str[i]);
						flag[i] = ' ';
						break;
					case ')' :
						if (leftbracket.top > 0)
						{
							flag[i] = ' ';
							leftbracket.top -= 1;
						}
						else
						{
							flag[i] = '?';
						}
						break;
					default :
						flag[i] = ' ';
						break;
				}
			}

			//?????????????   
			for (i = len - 1; i >= 0; i--)
			{
				switch (str[i])
				{
					case ')' :
						rightbracket.data = tangible.StringFunctions.changeCharacter(rightbracket.data, rightbracket.top++, str[i]);
						break;
					case '(' :
						if (rightbracket.top > 0)
						{
							rightbracket.top -= 1;
						}
						else
						{
							flag[i] = '$';
						}
						break;
					default :
						break;
				}
			}

			//????   
			System.out.printf("%s\n%s\n", str, flag);

			//?????   
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str, '\0', (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(flag, '\0', (Character.SIZE / Byte.SIZE));
			}
	n--;
	}
		return 0;
	}


}

