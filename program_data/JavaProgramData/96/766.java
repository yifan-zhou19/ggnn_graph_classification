package <missing>;

public class GlobalMembers
{
	public static String input = new String(new char[200]);
	public static int[] output = new int[200];
	public static int Main()
	{
		input = ConsoleInput.readToWhiteSpace(true).charAt(0);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(output,0,(Integer.SIZE / Byte.SIZE));
		int length = input.length();
		int remainder = 0;
		int i;
		for (i = 0;i < length;i++)
		{
			remainder *= 10;
			remainder += input.charAt(i) - '0';
			if (remainder < 13)
			{
				output[i] = 0;
			}
			else
			{
				output[i] = remainder / 13;
				remainder %= 13;
			}
		}
		for (i = 0;i < length;i++)
		{
			if (output[i] != 0)
			{
				break;
			}
		}
		if (i == length)
		{
			System.out.print(0);
		}
		else
		{
			for (;i < length;i++)
			{
				System.out.print(output[i]);
			}
		}
		System.out.print("\n");
		System.out.print(remainder);
		System.out.print("\n");
		return 0;
	}

}

