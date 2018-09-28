package <missing>;

public class GlobalMembers
{
	public static String c1 = new String(new char[210]);
	public static String c2 = new String(new char[210]);
	public static int[] num1 = new int[210];
	public static int[] num2 = new int[210];
	public static int Main()
	{
		c1 = ConsoleInput.readToWhiteSpace(true).charAt(0);
		c2 = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num1, 0, (Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(num2, 0, (Integer.SIZE / Byte.SIZE));
		if ((strcmp(c1, "0") == 0) && (strcmp(c2, "0") == 0))
		{
			System.out.print(0);
			System.out.print("\n");
		}
		for (int i = c1.length() - 1, j = 0; i >= 0; i--)
		{
			num1[j++] = c1.charAt(i) - '0';
		}
		for (int i = c2.length() - 1, j = 0; i >= 0; i--)
		{
			num2[j++] = c2.charAt(i) - '0';
		}
		int len = c1.length() > c2.length() ? c1.length() : c2.length();
		for (int i = 0; i < len; i++)
		{
			num1[i] += num2[i];
			if (num1[i] >= 10)
			{
				num1[i + 1]++;
				num1[i] -= 10;
			}
		}

		for (int i = 0; i <= len; i++)
		{
			c1 = tangible.StringFunctions.changeCharacter(c1, i, num1[i] + '0');
		}
		int pos = 209;
		while (num1[pos] == 0)
		{
			pos--;
		}
		for (int i = pos; i >= 0; i--)
		{
			System.out.print(c1.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}


}

