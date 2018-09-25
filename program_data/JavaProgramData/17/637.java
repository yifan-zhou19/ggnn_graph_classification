package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[103]);
	public static String temp = new String(new char[103]);
	public static int len;
	public static int match(int x)
	{
		int y;
		if (x == len) //??x?len??????????x
		{
			return x;
		}
		if (str.charAt(x) == '(') //??str[x] = '('??y = match?x+1)
		{
			y = match(x + 1);
		}
		else if (str.charAt(x) == ')') //??str[x] = '(',??x
		{
			return x;
		}
		else //???????match?x+1?
		{
			return match(x + 1);
		}
		if (y == len)
		{ //??y = len???temp[x] = $,?????????????y
			temp = tangible.StringFunctions.changeCharacter(temp, x, '$');
			return y;
		}
		else //???????match(y+1)
		{
			return match(y + 1);
		}
	}
	public static int Main()
	{
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{ //?????
			System.out.print(str);
			System.out.print("\n");
			len = str.length(); //len?str???
			int z = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(temp, ' ', (Character.SIZE / Byte.SIZE)); //?temp??????
			while (z != len)
			{ //??????????
				z = match(z);
				if (z != len)
				{
					temp = tangible.StringFunctions.changeCharacter(temp, z, '?');
					z++;
				}
			}
			for (int i = 0; i < len; i++)
			{
				System.out.print(temp.charAt(i));
			}
			System.out.print("\n");
		}
		return 0;
	}

}

