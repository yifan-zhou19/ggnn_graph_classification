package <missing>;

public class GlobalMembers
{
	public static int N;
	public static void chenger(int depth, tangible.RefObject<String> a)
	{
		if (depth == N) //??N???
		{
			int len = a.argValue.length() - 1;
			for (int i = len;i >= 0;i--)
			{
				System.out.print(a.argValue.charAt(i));
			}
		}
		else
		{
			final String b = "";
			int len = a.argValue.length();
			int[] temp = new int[100]; //??
			for (int i = 0;i < len;i++) //??
			{
				b = tangible.StringFunctions.changeCharacter(b, i, ((a.argValue.charAt(i) - '0') * 2) % 10 + temp[i] + '0');
				temp[i + 1] = ((a.argValue.charAt(i) - '0') * 2) / 10;
			}
			if (temp[len] != 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, len, temp[len] + '0');
			}
		tangible.RefObject<String> tempRef_b = new tangible.RefObject<String>(b);
			chenger(depth + 1, tempRef_b);
			b = tempRef_b.argValue;
		}
	}
	public static int Main()
	{
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final String num = "";
		num = tangible.StringFunctions.changeCharacter(num, 0, '1'); //2?0??
	tangible.RefObject<String> tempRef_num = new tangible.RefObject<String>(num);
		chenger(0, tempRef_num);
		num = tempRef_num.argValue;
		return 0;
	}
}

