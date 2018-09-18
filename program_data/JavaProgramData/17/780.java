package <missing>;

public class GlobalMembers
{
	public static int i;
	public static String x = new String(new char[101]);
	public static String y = new String(new char[101]);
	public static void f()
	{
		int num = 0;
		int[] k = new int[101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(y, ' ', 101);
		int len = x.length();
		for (i = 0; i < len; i++)
		{
			if (x.charAt(i) == '(')
			{
				y = tangible.StringFunctions.changeCharacter(y, i, '$');
				num = num + 1; //num?????????
				k[num] = i; //?????????

			}
			if (x.charAt(i) == ')')
			{
				if (num > 0)
				{
					y = tangible.StringFunctions.changeCharacter(y, k[num], ' ');
					num = num - 1; //?????????
				}
				else
				{
					y = tangible.StringFunctions.changeCharacter(y, i, '?');
				}
			}
		}
		for (i = 0; i < len; i++)
		{
			System.out.print(y.charAt(i));
		}
		System.out.print("\n");
	}

	public static int Main()
	{
		while ((x = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			System.out.print(x);
			System.out.print("\n");
			f();
		}
		return 0;
	}

}

