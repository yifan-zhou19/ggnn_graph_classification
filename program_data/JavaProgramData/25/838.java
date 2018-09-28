package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ANS = new String(new char[MAX]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ANS,0,(Character.SIZE / Byte.SIZE));
		ANS = tangible.StringFunctions.changeCharacter(ANS, 0, '1');
		ANS = tangible.StringFunctions.changeCharacter(ANS, 1, '\0');
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1;i <= N;i++)
		{
			int LEN = ANS.length();
			int g = 0;
			int h = 0;
			int k;

			for (k = 0;g || k < LEN;k++)
			{
				int mk = 0;
				if (k < LEN)
				{
					mk = ANS.charAt(k) - '0';
				}
				h = mk * 2 + g;
				g = h / 10;
				ANS = tangible.StringFunctions.changeCharacter(ANS, k, h % 10 + '0');
			}

			ANS = tangible.StringFunctions.changeCharacter(ANS, k, '\0');
		}
		for (int i = 0;i < ANS.length();i++)
		{
			System.out.print(ANS.charAt(ANS.length() - i - 1));
		}

		return 0;
	}

}

