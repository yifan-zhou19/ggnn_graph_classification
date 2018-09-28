package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int length1 = 0;
		int c = 0;
		String shuru = new String(new char[200]);
		String result = new String(new char[200]);
		int[] result1 = new int[200];
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shuru = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		length1 = shuru.length();
		int i = 0;
		int j = 0;
		int num = 0;
		int l = 0;
		for (i = 0; i <= length1 - 1; i++)
		{
			l = 0;
			if (shuru.charAt(i) >= '0' && shuru.charAt(i) <= '9')
			{
				l = (int)shuru.charAt(i) - (int)'0';
			}
			if (shuru.charAt(i) >= 'a' && shuru.charAt(i) <= 'z')
			{
				l = (int)shuru.charAt(i) - (int)'a' + 10;
			}
			if (shuru.charAt(i) >= 'A' && shuru.charAt(i) <= 'Z')
			{
				l = (int)shuru.charAt(i) - (int)'A' + 10;
			}
			num = num * a + l;
		}
		while (true)
		{
			result1[j] = num % b;
			num = num / b;
			if (result1[j] >= 10)
			{
				result = tangible.StringFunctions.changeCharacter(result, j, 'A' + result1[j] - 10);
			}
			else
			{
				result = tangible.StringFunctions.changeCharacter(result, j, '0' + result1[j]);
			}
			j++;
			if (num == 0)
			{
				break;
			}
		}
		c = j - 1;
		for (i = c; i >= 0; i--)
		{
			System.out.print(result.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

