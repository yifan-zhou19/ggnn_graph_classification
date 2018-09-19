package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[110]);
	public static void search()
	{
		int i = 0;
		int l;
		int t = 0;
		String str1 = new String(new char[110]);
		int[] stack = new int[110]; //?
		System.out.print(str);
		System.out.print("\n");
		l = str.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(str1,' ',(Character.SIZE / Byte.SIZE));
		while (i < l)
		{
			if (str.charAt(i) == '(') //???????
			{
				t++;
				stack[t] = i;
			}
			if (str.charAt(i) == ')') //??????????????????
			{
				if (t == 0)
				{
					str1 = tangible.StringFunctions.changeCharacter(str1, i, '?');
				}
				else
				{
					t--; //??
				}
			}
			i++;
		}
		for (i = 1;i <= t;i++)
		{
			str1 = tangible.StringFunctions.changeCharacter(str1, stack[i], '$'); //???????
		}
		for (i = 0;i < l;i++)
		{
			System.out.print(str1.charAt(i));
		}
		System.out.print("\n");
	}
	public static int Main()
	{
		while ((str = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			search(); //????????
		}
		return 0;
	}


}

